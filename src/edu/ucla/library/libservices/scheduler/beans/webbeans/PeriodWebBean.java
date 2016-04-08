package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.Period;
import edu.ucla.library.libservices.scheduler.db.mapper.PeriodMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class PeriodWebBean
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private JdbcTemplate sql;
  private List<Period> allPeriods;
  private List<Period> allStandardPeriods;
  private List<Period> allExceptionPeriods;
  private List<Period> nonExceptionPeriods;
  private List<Period> quarters;
  private List<Period> semesters;
  private List<Period> exceptionsInRange;
  private List<Period> exceptionsInPeriod;
  private Period period;
  private Integer periodId;
  private String theDate;
  private String sourceName;
  private String startDate;
  private String endDate;

  public PeriodWebBean()
  {
  }

  public List<Period> getAllPeriods()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      allPeriods = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period ORDER BY Period_Title", 
        //"SELECT * FROM Library_Web_Test.dbo.Period ORDER BY Period_Title", 
        new PeriodMapper() );
    }
    releaseConnection();

    return allPeriods;
  }

  public List<Period> getAllStandardPeriods()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      allStandardPeriods = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE End_Date >= '" + theDate 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE End_Date >= '" + theDate 
        + "' AND Is_Exception = 0 ORDER BY Start_Date", new PeriodMapper() );
    }

    releaseConnection();
    return allStandardPeriods;
  }

  public List<Period> getAllExceptionPeriods()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      allExceptionPeriods = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE End_Date >= '" + theDate 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE End_Date >= '" + theDate 
        + "' AND Is_Exception = 1 ORDER BY Start_Date", new PeriodMapper() );
    }
    releaseConnection();

    return allExceptionPeriods;
  }

  public List<Period> getNonExceptionPeriods()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      nonExceptionPeriods = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE Is_Exception = 0 ORDER BY " 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Is_Exception = 0 ORDER BY " 
        + "Period_Title", new PeriodMapper() );
    }
    releaseConnection();

    return nonExceptionPeriods;
  }

  public List<Period> getExceptionsInRange()
  {
    makeConnection();
    if ( startDate != null && endDate != null && 
         dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      exceptionsInRange = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE Is_Exception = 1 AND" 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Is_Exception = 1 AND" 
        + "(Start_Date >= '" + startDate + "' AND End_Date <= '" 
        + endDate + "')", new PeriodMapper() );

      releaseConnection();
      return exceptionsInRange;
    }
    else
    {
      releaseConnection();
      return null;
    }
  }

  public List<Period> getExceptionsInPeriod()
  {
    makeConnection();
    if ( periodId != null && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      exceptionsInPeriod = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE Is_Exception = 1 " 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Is_Exception = 1 " 
        + "AND (Falls_In_Quarter = " + periodId + " OR Falls_In_Semester = " 
        + periodId + ") ORDER BY Start_Date", new PeriodMapper() );

      releaseConnection();
      return exceptionsInPeriod;
    }
    else
    {
      releaseConnection();
      return null;
    }
  }

  public Period getPeriod()
  {
    makeConnection();
    if ( periodId != null && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      period = ( Period ) sql.queryForObject( 
        "SELECT * FROM Library_Web.dbo.Period WHERE Period_ID = " 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Period_ID = " 
        + periodId, new PeriodMapper() );

      releaseConnection();
      return period;
    }
    else
    {
      releaseConnection();
      return null;
    }
  }

  public void setPeriodId( Integer periodId )
  {
    this.periodId = periodId;
  }

  public void setTheDate( String theDate )
  {
    this.theDate = theDate;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void setStartDate( String startDate )
  {
    this.startDate = startDate;
  }

  public void setEndDate( String endDate )
  {
    this.endDate = endDate;
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

  public List<Period> getQuarters()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      quarters = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE Is_Exception = 0 AND " 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Is_Exception = 0 AND " 
        + "upper(Period_Title) NOT LIKE '%SEMESTER%' ORDER BY Period_Title", 
        new PeriodMapper() );
    }
    releaseConnection();

    return quarters;
  }

  public List<Period> getSemesters()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      semesters = sql.query( 
        "SELECT * FROM Library_Web.dbo.Period WHERE Is_Exception = 0 " 
        //"SELECT * FROM Library_Web_Test.dbo.Period WHERE Is_Exception = 0 " 
        + "AND upper(Period_Title) LIKE '%SEMESTER%' ORDER BY Period_Title", 
        new PeriodMapper() );
    }
    releaseConnection();

    return semesters;
  }
}
