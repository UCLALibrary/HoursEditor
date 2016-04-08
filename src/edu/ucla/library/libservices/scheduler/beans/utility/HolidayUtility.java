package edu.ucla.library.libservices.scheduler.beans.utility;

import edu.ucla.library.libservices.scheduler.beans.tables.Period;
import edu.ucla.library.libservices.scheduler.db.mapper.PeriodMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class HolidayUtility
{
  private int periodID;
  private int unitID;
  private List<Period> openHolidays;
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private JdbcTemplate sql;
  private String sourceName;

  public HolidayUtility()
  {
  }

  public void setPeriodID( int periodID )
  {
    this.periodID = periodID;
  }

  public void setUnitID( int unitID )
  {
    this.unitID = unitID;
  }

  public List<Period> getOpenHolidays()
  {
    makeConenction();
    if ( periodID != -1 && unitID != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      openHolidays = sql.query(
      "SELECT * FROM Library_Web.dbo.Period WHERE Is_Exception = 1 AND"
      //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Is_Exception = 1 AND"
      + " (Falls_In_Quarter = " + periodID + " OR Falls_In_Semester = "
      + periodID + ") AND Period_ID NOT IN (SELECT Period_ID FROM "
      + "Library_Web.dbo.Schedule WHERE Unit_ID = " + unitID
      //+ "Library_Web_Test.dbo.Schedule WHERE Unit_ID = " + unitID
      + " AND Is_Exception = 1) ORDER BY Start_Date", new PeriodMapper());
      releaseConenction();
      return openHolidays;
    }
    else
    {
      releaseConenction();
      return null;
    }
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }
  private void makeConenction()
  {
    //dataSource = DataSourceFactory.createDataSource();
    dataSource = DataSourceFactory.createDataSource( sourceName );
  }

  private void releaseConenction()
  {
    dataSource = null;
  }
}
