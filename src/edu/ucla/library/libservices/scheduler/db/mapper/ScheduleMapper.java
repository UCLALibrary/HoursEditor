package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.Schedule;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ScheduleMapper implements RowMapper
{
  public ScheduleMapper()
  {
  }
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Schedule sb = new Schedule();

    sb.setIs_exception( rs.getBoolean("is_exception") );
    sb.setPeriod_id( rs.getInt("period_id") );
    sb.setSchedule_id( rs.getInt("schedule_id") );
    sb.setUnit_id( rs.getInt("unit_id") );
    sb.setHas_special_range( rs.getBoolean("has_special_range") );

    return sb;
  }
}
