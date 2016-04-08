package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class DeleteScheduleProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;
  private int scheduleID;

  public DeleteScheduleProcedure()
  {
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
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

  public void deleteSchedule()
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
    setSql( "Library_Web.dbo.uspDeleteSchedule" );
    //setSql( "Library_Web_Test.dbo.uspDeleteSchedule" );
    declareParameter( new SqlParameter( "ScheduleID", Types.INTEGER ) );
    compile();
  }

  private Map execute()
  {
    Map input;
    Map out;

    out = null;
    input = new HashMap();

    input.put( "ScheduleID", scheduleID );

    out = execute( input );

    return out;
  }

}
