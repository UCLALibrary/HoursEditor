package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.Unit;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UnitMapper
  implements RowMapper
{
  public UnitMapper()
  {
  }

  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Unit bean = new Unit();

    bean.setUnit_id( rs.getInt( "unit_id" ) );
    bean.setUnit_code( rs.getString( "unit_code" ) );
    bean.setUnit_group( rs.getInt( "unit_group" ) );
    bean.setUnit_title( rs.getString( "unit_title" ) );
    bean.setSort_order( rs.getInt( "sort_order" ) );
    bean.setPhone( rs.getString( "phone" ) );

    return bean;
  }
}
