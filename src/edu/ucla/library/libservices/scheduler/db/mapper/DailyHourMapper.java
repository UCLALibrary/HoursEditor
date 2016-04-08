package edu.ucla.library.libservices.scheduler.db.mapper;

import edu.ucla.library.libservices.scheduler.beans.tables.DailyHour;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DailyHourMapper
  implements RowMapper
{
  public DailyHourMapper()
  {
  }

  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    DailyHour bean = new DailyHour();

    bean.setCloses( rs.getString( "closes" ) );
    bean.setOpens( rs.getString( "opens" ) );
    bean.setDaily_id( new Integer( rs.getInt( "daily_id" ) ) );
    bean.setSchedule_id( new Integer( rs.getInt( "schedule_id" ) ) );
    bean.setDay_of_week( rs.getString( "day_of_week" ) );
    bean.setNote( rs.getString( "note" ) );
    bean.setIs_closed( Boolean.valueOf( rs.getBoolean( "is_closed" ) ) );

    return bean;
  }
}
