package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.UnitGroup;
import edu.ucla.library.libservices.scheduler.db.mapper.UnitGroupMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UnitGroupWebBean
{
  private List<UnitGroup> allUnits;
  private UnitGroup unitGroup;
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private int unitGroupId;
  private String sourceName;

  public UnitGroupWebBean()
  {
    allUnits = null;
    unitGroup = null;
    unitGroupId = -1;
    sourceName = null;
  }

  public List<UnitGroup> getAllUnits()
  {
    JdbcTemplate sql;
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      allUnits = sql.query( 
        "SELECT * FROM Library_Web.dbo.Unit_Group ORDER BY Unit_Group_Title",
        //"SELECT * FROM Library_Web_Test.dbo.Unit_Group ORDER BY Unit_Group_Title",
        new UnitGroupMapper() );
    }
    releaseConnection();

    return allUnits;
  }

  public UnitGroup getUnitGroup()
  {
    makeConnection();
     if ( unitGroupId != -1 && dataSource != null )
     {
      JdbcTemplate sql;
      sql = new JdbcTemplate( dataSource );

      unitGroup = ( UnitGroup ) sql.queryForObject(
        "SELECT * FROM Library_Web.dbo.Unit_Group WHERE Unit_Group_ID = " +
        //"SELECT * FROM Library_Web_Test.dbo.Unit_Group WHERE Unit_Group_ID = " +
        unitGroupId, new UnitGroupMapper() );
      releaseConnection();
      return unitGroup;
     }
     else
     {
       releaseConnection();
       return null;
     }
  }

  public void setUnitGroupId( int unitGroupId )
  {
    this.unitGroupId = unitGroupId;
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
}
