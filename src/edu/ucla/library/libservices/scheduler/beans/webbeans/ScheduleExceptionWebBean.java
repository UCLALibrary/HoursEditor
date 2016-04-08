package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.ScheduleException;
import edu.ucla.library.libservices.scheduler.db.mapper.ScheduleExceptionMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ScheduleExceptionWebBean
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;
  private JdbcTemplate sql;
  private List<ScheduleException> allExceptions;
  private ScheduleException exception;
  private int exceptionID;

  public ScheduleExceptionWebBean()
  {
    exceptionID = -1;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public List<ScheduleException> getAllExceptions()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      allExceptions = sql.query( 
        "SELECT * FROM Library_Web.dbo.Exception ORDER BY Exception_Title", 
        //"SELECT * FROM Library_Web_Test.dbo.Exception ORDER BY Exception_Title", 
        new ScheduleExceptionMapper() );
    }

    releaseConnection();
    return allExceptions;
  }

  public ScheduleException getException()
  {
    makeConnection();
    if ( exceptionID != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      exception = ( ScheduleException ) sql.queryForObject( 
        "SELECT * FROM Library_Web.dbo.Exception WHERE Exception_ID = " 
        //"SELECT * FROM Library_Web_Test.dbo.Exception WHERE Exception_ID = " 
        + exceptionID, new ScheduleExceptionMapper() );

      releaseConnection();
      return exception;
    }
    else
    {
      releaseConnection();
      return null;
    }
  }

  public void setExceptionID( int exceptionID )
  {
    this.exceptionID = exceptionID;
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
