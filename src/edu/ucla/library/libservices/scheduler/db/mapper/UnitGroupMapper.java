package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.UnitGroup;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UnitGroupMapper implements RowMapper
{
  public UnitGroupMapper()
  {
  }
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    UnitGroup bean = new UnitGroup();

    bean.setUnit_group_id(rs.getInt("Unit_Group_ID"));
    bean.setUnit_group_title(rs.getString("Unit_Group_Title"));

    return bean;
  }
}
