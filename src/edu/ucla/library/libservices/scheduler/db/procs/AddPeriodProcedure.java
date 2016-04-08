package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class AddPeriodProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;
  private String period_title, start_date, end_date;
  private boolean is_exception;
  private int falls_in_semester, falls_in_quarter;

  public AddPeriodProcedure()
  {
  }


  public void addPeriod()
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
    setSql( "Library_Web.dbo.uspAddPeriod" );
    //setSql( "Library_Web_Test.dbo.uspAddPeriod" );
    declareParameter( new SqlParameter( "PeriodTitle", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "StartDate", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "EndDate", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "IsException", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "FallsInQuarter", 
                                        Types.INTEGER ) );
    declareParameter( new SqlParameter( "FallsInSemester", 
                                        Types.INTEGER ) );
    compile();
  }

  private Map execute()
  {
    Map input;
    Map out;

    out = null;
    input = new HashMap();

    input.put( "PeriodTitle", period_title );
    input.put( "StartDate", start_date );
    input.put( "EndDate", end_date );
    input.put( "IsException", ( is_exception? "1" : "0" ) );
    input.put( "FallsInQuarter", 
               ( falls_in_quarter == -1? null : falls_in_quarter ) );
    input.put( "FallsInSemester", 
               ( falls_in_semester == -1? null : falls_in_semester ) );

    out = execute( input );

    return out;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void setPeriod_title( String period_title )
  {
    this.period_title = period_title;
  }

  public void setStart_date( String start_date )
  {
    this.start_date = start_date;
  }

  public void setEnd_date( String end_date )
  {
    this.end_date = end_date;
  }

  public void setIs_exception( boolean is_exception )
  {
    this.is_exception = is_exception;
  }

  public void setFalls_in_semester( int falls_in_semester )
  {
    this.falls_in_semester = falls_in_semester;
  }

  public void setFalls_in_quarter( int falls_in_quarter )
  {
    this.falls_in_quarter = falls_in_quarter;
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
