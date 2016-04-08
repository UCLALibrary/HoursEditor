package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class EditExceptionReasonProcedure
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;
  private String exception_title;
  private int exception_id;
  
  public EditExceptionReasonProcedure()
  {
  }

  public void editReason()
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
    setDataSource(dataSource);
    setFunction(false);
    setSql("Library_Web.dbo.uspEditException");
    //setSql("Library_Web_Test.dbo.uspEditException");
    declareParameter( new SqlParameter( "ExceptionID", Types.INTEGER ));
    declareParameter( new SqlParameter( "ExceptionTitle", Types.VARCHAR ));
    compile();
  }

  private Map execute() 
  {
    Map input;
    Map out;

    out = null;
    input = new HashMap();

    input.put("ExceptionID", exception_id);
    input.put("ExceptionTitle", exception_title);
    
    out = execute(input);

    return out;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void setException_title( String exception_title )
  {
    this.exception_title = exception_title;
  }

  public void setException_id( int exception_id )
  {
    this.exception_id = exception_id;
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
