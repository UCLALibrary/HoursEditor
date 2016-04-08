package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.Schedule;
import edu.ucla.library.libservices.scheduler.db.mapper.ScheduleMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ScheduleWebBean
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private JdbcTemplate sql;
  private Schedule schedule;
  private List<Schedule> allSchedules;
  private List<Schedule> exceptionsInPeriod;
  private int scheduleID;
  private int unitID;
  private int periodID;
  private boolean isException;
  private boolean hasSpecialRange;
  private String sourceName;

  public ScheduleWebBean()
  {
    scheduleID = -1;
    unitID = -1; 
    periodID = -1;
  }

  public Schedule getSchedule()
  {
    makeConnection();
    if ( scheduleID != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      schedule = ( Schedule ) sql.queryForObject(
        "SELECT * FROM Library_Web.dbo.Schedule WHERE Schedule_ID = "
        //"SELECT * FROM Library_Web_Test.dbo.Schedule WHERE Schedule_ID = "
        + scheduleID, new ScheduleMapper());
      releaseConnection();
      return schedule;
    }
    else
    {
      releaseConnection();
      return null;
    }
  }

  public List<Schedule> getAllSchedules()
  {
    return allSchedules;
  }

  public List<Schedule> getExceptionsInPeriod()
  {
    makeConnection();
    if ( unitID != -1 && periodID != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      exceptionsInPeriod = sql.query(
        "SELECT * FROM Library_Web.dbo.Schedule WHERE Is_Exception = 1 AND "
        //"SELECT * FROM Library_Web_Test.dbo.Schedule WHERE Is_Exception = 1 AND "
        + "Unit_ID = " + unitID + " AND (Period_Id = " + periodID
        + " OR Period_ID IN (SELECT Period_ID FROM Library_Web.dbo.Period"
        //+ " OR Period_ID IN (SELECT Period_ID FROM Library_Web_Test.dbo.Period"
        + " WHERE Falls_In_Quarter = " + periodID + " OR Falls_In_Semester = "
        + periodID + "))", new ScheduleMapper());

      releaseConnection();
      return exceptionsInPeriod;
    }
    else
    {
      releaseConnection();
      return null;
    }
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
  }

  public void setUnitID( int unitID )
  {
    this.unitID = unitID;
  }

  public void setPeriodID( int periodID )
  {
    this.periodID = periodID;
  }

  public void setIsException( boolean isException )
  {
    this.isException = isException;
  }

  public void setHasSpecialRange( boolean hasSpecialRange )
  {
    this.hasSpecialRange = hasSpecialRange;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }
  private void makeConnection()
  {
    //dataSource = DataSourceFactory.createDataSource();
    dataSource = DataSourceFactory.createDataSource( sourceName );
  }
  private void releaseConnection()
  {
    dataSource = null;
  }
}
