package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.ScheduleSpecialException;
import edu.ucla.library.libservices.scheduler.db.mapper.ScheduleSpecialExceptionMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ScheduleSpecialExceptionWebBean
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private JdbcTemplate sql;
  private int specialExceptionId;
  private int scheduleId;
  private ScheduleSpecialException exception;
  private String sourceName;

  public ScheduleSpecialExceptionWebBean()
  {
    scheduleId = -1;
  }

  public void setSpecialExceptionId( int specialExceptionId )
  {
    this.specialExceptionId = specialExceptionId;
  }

  public void setScheduleId( int scheduleId )
  {
    this.scheduleId = scheduleId;
  }

  public ScheduleSpecialException getException()
  {
    makeConnection();
    if ( scheduleId != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      exception = (ScheduleSpecialException)sql.queryForObject(
        "SELECT * FROM Library_Web.dbo.Special_Exception WHERE Schedule_ID = " +
        //"SELECT * FROM Library_Web_Test.dbo.Special_Exception WHERE Schedule_ID = " 
        + scheduleId, new ScheduleSpecialExceptionMapper() );

      releaseConnection();
       return exception;
    }
    else
    {
      releaseConnection();
      return null;
    }
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
