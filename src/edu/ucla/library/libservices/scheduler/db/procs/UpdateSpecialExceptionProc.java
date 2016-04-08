package edu.ucla.library.libservices.scheduler.db.procs;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class UpdateSpecialExceptionProc
  extends StoredProcedure
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;
  private Integer specialExceptionID;
  private String startDate;
  private String endDate;
  private String note;

  public UpdateSpecialExceptionProc()
  {
  }

  public void updateException()
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
    setSql("Library_Web.dbo.uspUpdateSpecialException");
    //setSql("Library_Web_Test.dbo.uspUpdateSpecialException");
    declareParameter( new SqlParameter( "SpecialExceptionID", Types.INTEGER ));
    declareParameter( new SqlParameter( "StartDate", Types.VARCHAR ));
    declareParameter( new SqlParameter( "EndDate", Types.VARCHAR ));
    declareParameter( new SqlParameter( "Note", Types.VARCHAR ));
    compile();
  }

  private Map execute() 
  {
    Map input;
    Map out;

    input = new HashMap();

    input.put("SpecialExceptionID", specialExceptionID);
    input.put("StartDate", startDate);
    input.put("EndDate", endDate);
    input.put("Note", note);

    out = execute(input);

    return out;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void setSpecialExceptionID( Integer specialExceptionID )
  {
    this.specialExceptionID = specialExceptionID;
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
