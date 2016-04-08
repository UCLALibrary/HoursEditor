package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.ExceptionReason;
import edu.ucla.library.libservices.scheduler.db.mapper.ExceptionReasonMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ExceptionReasonWebBean
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;
  private JdbcTemplate sql;
  private List<ExceptionReason> allExceptions;
  private ExceptionReason exception;
  private int exceptionID;

  public ExceptionReasonWebBean()
  {
    exceptionID = -1;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public List<ExceptionReason> getAllExceptions()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      allExceptions = sql.query( 
        "SELECT * FROM Library_Web.dbo.Exception ORDER BY Exception_Title", 
        //"SELECT * FROM Library_Web_Test.dbo.Exception ORDER BY Exception_Title", 
        new ExceptionReasonMapper() );
    }

    releaseConnection();
    return allExceptions;
  }

  public ExceptionReason getException()
  {
    makeConnection();
    if ( exceptionID != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      exception = ( ExceptionReason ) sql.queryForObject( 
        "SELECT * FROM Library_Web.dbo.Exception WHERE Exception_ID = " +
        //"SELECT * FROM Library_Web_Test.dbo.Exception WHERE Exception_ID = " + 
        exceptionID, new ExceptionReasonMapper() );

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
