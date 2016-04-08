package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class AddSpecialExceptionProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private int scheduleID;
  private int exceptionID;
  private String startDate;
  private String endDate;
  private String note;
  private String sourceName;

  public AddSpecialExceptionProcedure()
  {
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
  }

  public void setExceptionID( int exceptionID )
  {
    this.exceptionID = exceptionID;
  }

  public void setStartDate( String startDate )
  {
    this.startDate = startDate;
  }

  public void setEndDate( String endDate )
  {
    this.endDate = endDate;
  }

  public void setNote( String note )
  {
    this.note = note;
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

  public void addException()
  {
    Map results;

    makeConnection();
    if ( dataSource != null )
    {
      prepProc();
      results = execute();
      releaseConnection();
    }
  }

  private void prepProc()
  {
    setDataSource( dataSource );
    setFunction( false );
    setSql( "Library_Web.dbo.uspAddSpecialException" );
    //setSql( "Library_Web_Test.dbo.uspAddSpecialException" );
    declareParameter( new SqlParameter( "ScheduleID", Types.INTEGER ) );
    declareParameter( new SqlParameter( "ExceptionID", Types.INTEGER ) );
    declareParameter( new SqlParameter( "StartDate", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "EndDate", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "Note", Types.VARCHAR ) );
    compile();
  }

  private Map execute()
  {
    Map input;
    Map out;

    input = new HashMap();

    input.put( "ScheduleID", scheduleID );
    input.put( "ExceptionID", exceptionID );
    input.put( "StartDate", startDate );
    input.put( "EndDate", endDate );
    input.put( "Note", note );

    out = execute( input );

    return out;
  }
}
