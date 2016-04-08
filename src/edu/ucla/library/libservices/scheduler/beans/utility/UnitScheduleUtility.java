package edu.ucla.library.libservices.scheduler.beans.utility;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class UnitScheduleUtility
{
  private boolean hasException;
  private boolean hasStandard;
  private int periodID;
  private int scheduleID;
  private int unitID;
  private DataSource dataSource;
  //private DriverManagerDataSource dataSource;
  private JdbcTemplate sql;
  private String sourceName;
  private String startDate;
  private String endDate;

  public UnitScheduleUtility()
  {
  }

  public boolean isHasException()
  {
    int holiday, special;

    makeConenction();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      holiday = sql.queryForInt( 
        "SELECT count(S.Schedule_ID) AS periods FROM Library_Web.dbo.Schedule" 
        //"SELECT count(S.Schedule_ID) AS periods FROM Library_Web_Test.dbo.Schedule" 
        + " S, Library_Web.dbo.Period P WHERE S.Unit_ID = " + unitID 
        //+ " S, Library_Web_Test.dbo.Period P WHERE S.Unit_ID = " + unitID 
        + " AND (S.Is_Exception = 1 AND S.Has_Special_Range = 0) AND " 
        + "(S.Period_ID = P.Period_ID AND (P.Falls_In_Quarter = " 
        + periodID + " OR P.Falls_In_Semester = " + periodID + "))" );
        
      special = sql.queryForInt( 
        "SELECT count(S.Schedule_ID) AS periods FROM Library_Web.dbo.Schedule" 
        //"SELECT count(S.Schedule_ID) AS periods FROM Library_Web_Test.dbo.Schedule" 
        + " S, Library_Web.dbo.Special_Exception SE WHERE S.Unit_ID = " 
        //+ " S, Library_Web_Test.dbo.Special_Exception SE WHERE S.Unit_ID = " 
        + unitID + " AND (S.Is_Exception = 1 AND S.Has_Special_Range = 1) AND" 
        + " (S.Schedule_ID = SE.Schedule_ID AND (SE.Start_Date >= '" 
        + startDate + "' AND SE.End_Date <= '" + endDate + "'))" );

      if ( ( holiday + special ) == 0 )
        hasException = false;
      else
        hasException = true;
    }

    releaseConenction();
    return hasException;
  }

  public boolean isHasStandard()
  {
    int count;

    makeConenction();

    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

        count = 
          sql.queryForInt( 
          "SELECT count(Schedule_ID) AS periods FROM Library_Web.dbo.Schedule " 
          //"SELECT count(Schedule_ID) AS periods FROM Library_Web_Test.dbo.Schedule " 
          + "WHERE Unit_ID = " + unitID + " AND Period_ID = " + periodID 
          + " AND Is_Exception = 0" );

      if ( count == 0 )
        hasStandard = false;
      else
        hasStandard = true;
    }

    releaseConenction();
    return hasStandard;
  }

  public void setPeriodID( int periodID )
  {
    this.periodID = periodID;
  }

  public int getScheduleID()
  {
    makeConenction();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

        scheduleID = sql.queryForInt( 
          "SELECT Schedule_ID FROM Library_Web.dbo.Schedule WHERE Unit_ID = " 
          //"SELECT Schedule_ID FROM Library_Web_Test.dbo.Schedule WHERE Unit_ID = " 
          + unitID + " AND Period_ID = " + periodID + " AND Is_Exception = 0" );
    }

    releaseConenction();
    return scheduleID;
  }

  public void setUnitID( int unitID )
  {
    this.unitID = unitID;
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
  private void makeConenction()
  {
    //dataSource = DataSourceFactory.createDataSource();
    dataSource = DataSourceFactory.createDataSource( sourceName );
  }
  private void releaseConenction()
  {
    dataSource = null;
  }
}
