package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class AddDailyHoursProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private int scheduleID;
  private String dayOfWeek;
  private String opens;
  private String closes;
  private boolean isClosed;
  private String note;
  private String sourceName;

  public AddDailyHoursProcedure()
  {
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
  }

  public void setDayOfWeek( String dayOfWeek )
  {
    this.dayOfWeek = dayOfWeek;
  }

  public void setOpens( String opens )
  {
    this.opens = opens;
  }

  public void setCloses( String closes )
  {
    this.closes = closes;
  }

  public void setIsClosed( boolean isClosed )
  {
    this.isClosed = isClosed;
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
  public void addHours()
  {
    Map results;

    makeConnection();
    if ( dataSource != null )
    {
      prepProc();
      results = execute();
    }
    releaseConnection();
  }

  private void prepProc()
  {
    setDataSource( dataSource );
    setFunction( false );
    setSql( "Library_Web.dbo.uspAddDailyHours" );
    //setSql( "Library_Web_Test.dbo.uspAddDailyHours" );
    declareParameter( new SqlParameter( "ScheduleID", Types.INTEGER ) );
    declareParameter( new SqlParameter( "DayOfWeek", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "Opens", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "Closes", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "IsClosed", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "Note", Types.VARCHAR ) );
    compile();
  }

  private Map execute()
  {
    Map input;
    Map out;

    out = null;
    input = new HashMap();

    input.put( "ScheduleID", scheduleID );
    input.put( "DayOfWeek", dayOfWeek );
    input.put( "Opens", 
               ( !opens.equals( "-1" ) ? opens : null ) );
    input.put( "Closes", 
               ( !closes.equals( "-1" ) ? closes : null ) );
    input.put( "IsClosed", ( isClosed ? "1" : "0" ) );
    input.put( "Note", note );

    out = execute( input );

    return out;
  }

}
