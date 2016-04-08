package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.ScheduleSpecialException;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ScheduleSpecialExceptionMapper
  implements RowMapper
{
  public ScheduleSpecialExceptionMapper()
  {
  }

  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    ScheduleSpecialException bean = new ScheduleSpecialException();

    bean.setEnd_date( rs.getDate( "end_date" ) );
    bean.setException_id( rs.getInt( "exception_id" ) );
    bean.setNote( rs.getString( "note" ) );
    bean.setSchedule_id( rs.getInt( "schedule_id" ) );
    bean.setSpecial_exception_id( rs.getInt( "special_exception_id" ) );
    bean.setStart_date( rs.getDate( "start_date" ) );

    return bean;
  }
}
