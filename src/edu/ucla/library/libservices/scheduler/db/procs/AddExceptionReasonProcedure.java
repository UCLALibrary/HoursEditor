package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class AddExceptionReasonProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String exception_title;
  private String sourceName;

  public AddExceptionReasonProcedure()
  {
  }

  public void addReason()
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
    setSql( "Library_Web.dbo.uspAddException" );
    //setSql( "Library_Web_Test.dbo.uspAddException" );
    declareParameter( new SqlParameter( "ExceptionTitle", 
                                        Types.VARCHAR ) );
    compile();
  }

  private Map execute()
  {
    Map input;
    Map out;

    out = null;
    input = new HashMap();

    input.put( "ExceptionTitle", exception_title );

    out = execute( input );

    return out;
  }

  public void setException_title( String exception_title )
  {
    this.exception_title = exception_title;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

    private void makeConnection()
    {
      //dataSource = DataSourceFactory.createDataSource( );
      dataSource = DataSourceFactory.createDataSource( sourceName );
    }

    private void releaseConnection()
    {
      dataSource = null;
    }
}
