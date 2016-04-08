package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class AddScheduleProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private int unit;
  private int period;
  private String exception;
  private String range;
  private String sourceName;
  //private int newID;

  public AddScheduleProcedure()
  {
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

  public void setUnit( int unit )
  {
    this.unit = unit;
  }

  public void setPeriod( int period )
  {
    this.period = period;
  }

  public void setException( String exception )
  {
    this.exception = exception;
  }

  public void setRange( String range )
  {
    this.range = range;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }
  public int addSchedule()
  {
    Map results;

    makeConnection();
    if ( dataSource != null )
    {
      prepProc();
      results = execute();
      releaseConnection();

      return Integer.parseInt( results.get( "NewID" ).toString() );
    }
    else
      return -1;
  }

  private void prepProc()
  {
    setDataSource( dataSource );
    setFunction( false );
    setSql( "Library_Web.dbo.uspAddSchedule" );
    //setSql( "Library_Web_Test.dbo.uspAddSchedule" );
    declareParameter( new SqlOutParameter( "NewID", Types.INTEGER ) );
    declareParameter( new SqlParameter( "UnitID", Types.INTEGER ) );
    declareParameter( new SqlParameter( "PeriodID", Types.INTEGER ) );
    declareParameter( new SqlParameter( "IsException", Types.VARCHAR ) );
    declareParameter( new SqlParameter( "HasSpecialRange", 
                                        Types.VARCHAR ) );
    compile();
  }

  private Map execute()
  {
    Map input;
    Map out;

    input = new HashMap();
    input.put( "UnitID", unit );
    input.put( "PeriodID", period );
    input.put( "IsException", exception );
    input.put( "HasSpecialRange", range );
    out = execute( input );

    return out;
  }

}
