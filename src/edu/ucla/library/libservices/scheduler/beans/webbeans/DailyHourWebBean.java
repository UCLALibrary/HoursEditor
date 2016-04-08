package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.DailyHour;
import edu.ucla.library.libservices.scheduler.db.mapper.DailyHourMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class DailyHourWebBean
{
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private JdbcTemplate sql;
  private int scheduleID;
  private String dayOfWeek;
  private String sourceName;
  private DailyHour dailyHour;
  private List<DailyHour> allHours;

  public DailyHourWebBean()
  {
    scheduleID = -1;
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
  }

  public void setDayOfWeek( String dayOfWeek )
  {
    this.dayOfWeek = dayOfWeek;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public DailyHour getDailyHour()
  {
    makeConenction();

    if ( dayOfWeek != null && scheduleID != -1 && dataSource != null )
    {
      if ( isADay() )
      {
        sql = new JdbcTemplate( dataSource );
        
        dailyHour = ( DailyHour ) sql.queryForObject( 
          "SELECT Daily_ID, Schedule_ID, Day_Of_Week, convert(varchar, Opens, " 
          + "108) as Opens, convert(varchar, Closes, 108) as Closes, Is_Closed, " 
          + "Note FROM Library_Web.dbo.Daily_Hours WHERE Schedule_ID = " 
          //+ "Note FROM Library_Web_Test.dbo.Daily_Hours WHERE Schedule_ID = " 
          + scheduleID + " AND Day_Of_Week = '" + dayOfWeek + "'", new DailyHourMapper() );

        releaseConenction();
        return dailyHour;
      }
      else
      {
        releaseConenction();
        return null;
      }
    }
    else
      return null;
  }

  public List<DailyHour> getAllHours()
  {
    makeConenction();

    if ( scheduleID != -1 && dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      allHours = sql.query( 
        "SELECT Daily_ID, Schedule_ID, Day_Of_Week, convert(varchar, Opens, " 
        + "108) as Opens, convert(varchar, Closes, 108) as Closes, Is_Closed, " 
        + "Note FROM Library_Web.dbo.Daily_Hours WHERE Schedule_ID = " 
        //+ "Note FROM Library_Web_Test.dbo.Daily_Hours WHERE Schedule_ID = " 
        + scheduleID + " ORDER BY Daily_ID", new DailyHourMapper() );
      releaseConenction();

      return allHours;
    }
    else
    {
      releaseConenction();
      return null;
    }
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

  private boolean isADay()
  {
    boolean aDay = true;

    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      if ( sql.queryForInt( 
        "SELECT count(Schedule_ID) AS day FROM Library_Web.dbo.Daily_Hours" 
        //"SELECT count(Schedule_ID) AS day FROM Library_Web_Test.dbo.Daily_Hours" 
        + " WHERE Schedule_ID = " + scheduleID + " AND Day_Of_Week = '" 
        + dayOfWeek + "'" ) == 0 )
        aDay = false;
    }

    return aDay;
  }

}
