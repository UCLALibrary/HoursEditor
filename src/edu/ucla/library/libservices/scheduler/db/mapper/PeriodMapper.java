package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.Period;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PeriodMapper implements RowMapper
{
  public PeriodMapper()
  {
  }
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Period bean = new Period();

    bean.setEnd_date(rs.getDate("end_date"));
    bean.setStart_date(rs.getDate("start_date"));
    bean.setFalls_in_quarter( rs.getInt("falls_in_quarter"));
    bean.setFalls_in_semester( rs.getInt("falls_in_semester"));
    bean.setPeriod_id( rs.getInt("period_id"));
    bean.setPeriod_title(rs.getString("period_title"));
    bean.setIs_exception(rs.getBoolean("is_exception"));

    return bean;
  }
}
