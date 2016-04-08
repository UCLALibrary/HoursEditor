package edu.ucla.library.libservices.scheduler.beans.webbeans;

import edu.ucla.library.libservices.scheduler.beans.tables.Unit;
import edu.ucla.library.libservices.scheduler.db.mapper.UnitMapper;
import edu.ucla.library.libservices.scheduler.db.utility.DataSourceFactory;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UnitWebBean
{
  private List<Unit> allUnits;
  private List<Unit> unitsByGroup;
  private List<Unit> someUnits;
  private Unit unit;
  //private DriverManagerDataSource dataSource;
  private DataSource dataSource;
  private int unitGroupId;
  private int unitId;
  private JdbcTemplate sql;
  private String sourceName;
  private String unitIdList;

  public UnitWebBean()
  {
    allUnits = null;
    unitsByGroup = null;
    someUnits = null;
    unit = null;
    unitGroupId = -1;
    unitId = -1;
    sourceName = null;
    unitIdList = null;
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

  public List<Unit> getAllUnits()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      allUnits = sql.query(
        "SELECT * FROM Library_Web.dbo.Unit ORDER BY Unit_Group, Sort_Order",
        //"SELECT * FROM Library_Web_Test.dbo.Unit ORDER BY Unit_Group, Sort_Order",
        new UnitMapper() );
    }
    releaseConnection();

    return allUnits;
  }

  public List<Unit> getUnitsByGroup()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      unitsByGroup = sql.query(
        "SELECT * FROM Library_Web.dbo.Unit WHERE Unit_Group = "
        //"SELECT * FROM Library_Web_Test.dbo.Unit WHERE Unit_Group = "
        + unitGroupId + " ORDER BY Sort_Order", new UnitMapper() );
    }
    releaseConnection();

    return unitsByGroup;
  }

  public List<Unit> getSomeUnits()
  {
    makeConnection();
    if ( dataSource != null )
    {
      sql = new JdbcTemplate( dataSource );

      someUnits = sql.query(
        "SELECT * FROM Library_Web.dbo.Unit WHERE Unit_ID IN ( "
        //"SELECT * FROM Library_Web_Test.dbo.Unit WHERE Unit_ID IN ( "
        + unitIdList + ") ORDER BY Sort_Order", new UnitMapper() );
    }
    releaseConnection();

    return someUnits;
  }

  public Unit getUnit()
  {
    makeConnection();
    if ( unitId != -1 && dataSource != null )
    {
    sql = new JdbcTemplate( dataSource );

    unit = ( Unit ) sql.queryForObject(
      "SELECT * FROM Library_Web.dbo.Unit WHERE Unit_ID =" +
      //"SELECT * FROM Library_Web_Test.dbo.Unit WHERE Unit_ID =" +
      unitId, new UnitMapper() );

     releaseConnection();
     return unit;
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

  public void setUnitId( int unitId )
  {
    this.unitId = unitId;
  }

  public void setUnitIdList( String unitIdList )
  {
    this.unitIdList = unitIdList;
  }
}
