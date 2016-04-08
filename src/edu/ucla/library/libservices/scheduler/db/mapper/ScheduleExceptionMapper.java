package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.ScheduleException;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ScheduleExceptionMapper
  implements RowMapper
{
  public ScheduleExceptionMapper()
  {
  }

  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    ScheduleException bean = new ScheduleException();

    bean.setException_id( rs.getInt( "exception_id" ) );
    bean.setException_title( rs.getString( "exception_title" ) );

    return bean;
  }
}
