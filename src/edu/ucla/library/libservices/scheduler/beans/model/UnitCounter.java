package edu.ucla.library.libservices.scheduler.beans.model;

import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UnitCounter
{
  private int unit_group_id;
  private int count;
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private String sourceName;

  public UnitCounter()
  {
  }

  public void setUnit_group_id( int unit_group_id )
  {
    this.unit_group_id = unit_group_id;
  }

  public int getCount()
  {
    JdbcTemplate sql;

    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      count = sql.queryForInt(
        "SELECT count(Unit_ID) AS units FROM Library_Web.dbo.Unit WHERE" +
        //"SELECT count(Unit_ID) AS units FROM Library_Web_Test.dbo.Unit WHERE" +
        " Unit_Group = " + unit_group_id);
    }
    releaseConnection();
    return count;
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

  public int getUnit()
  {
    JdbcTemplate sql;
    int unit;
    
    unit = 0;
    
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );
      
      unit = sql.queryForInt(
        "SELECT unit_id FROM Library_Web.dbo.unit WHERE unit_group = " 
        //"SELECT unit_id FROM Library_Web_Test.dbo.unit WHERE unit_group = "
        + unit_group_id );
    }
    releaseConnection();
    
    return unit;
  }
}
