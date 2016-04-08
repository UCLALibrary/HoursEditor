package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.ExceptionReason;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ExceptionReasonMapper
  implements RowMapper
{
  public ExceptionReasonMapper()
  {
  }

  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    ExceptionReason eb = new ExceptionReason();

    eb.setException_id( rs.getInt( "exception_id" ) );
    eb.setException_title( rs.getString( "exception_title" ) );

    return eb;
  }
}
