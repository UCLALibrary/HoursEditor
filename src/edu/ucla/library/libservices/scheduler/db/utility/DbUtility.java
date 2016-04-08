package edu.ucla.library.libservices.scheduler.db.utility;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DbUtility
{
  //private static DriverManagerDataSource dataSource;
  private static DataSource dataSource;
  private static JdbcTemplate sql;

  public static boolean isExistingDay(Integer schedule, String day, String sourceName)
  {
    boolean existingDay;
    int count;

    existingDay = false;
     makeConnection(sourceName);
     if ( dataSource != null )
     {
       sql = new JdbcTemplate(dataSource);
       count = sql.queryForInt(
        "SELECT count(Daily_ID) AS days FROM Library_Web.dbo.Daily_Hours WHERE" 
        //"SELECT count(Daily_ID) AS days FROM Library_Web_Test.dbo.Daily_Hours WHERE" 
        + " Schedule_ID = " + schedule + " AND Day_Of_Week = '" + day + "'");     

       if ( count > 0 )
         existingDay = true;
     }
     releaseConnection();

    return existingDay;
  }
  private static void makeConnection(String name)
  {
    //dataSource = DataSourceFactory.createDataSource();
    dataSource = DataSourceFactory.createDataSource( name );
  }
  private static void releaseConnection()
  {
    dataSource = null;
  }
}
