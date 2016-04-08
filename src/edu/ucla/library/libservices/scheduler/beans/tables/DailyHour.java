package edu.ucla.library.libservices.scheduler.beans.tables;

public class DailyHour
{
  private int daily_id;
  private int schedule_id;
  private String day_of_week;
  private String opens;
  private String closes;
  private boolean is_closed;
  private String note;
  
  public DailyHour()
  {
  }

  public void setDaily_id( int daily_id )
  {
    this.daily_id = daily_id;
  }

  public int getDaily_id()
  {
    return daily_id;
  }

  public void setSchedule_id( int schedule_id )
  {
    this.schedule_id = schedule_id;
  }

  public int getSchedule_id()
  {
    return schedule_id;
  }

  public void setDay_of_week( String day_of_week )
  {
    this.day_of_week = day_of_week;
  }

  public String getDay_of_week()
  {
    return day_of_week;
  }

  public void setOpens( String opens )
  {
    this.opens = opens;
  }

  public String getOpens()
  {
    return opens;
  }

  public void setCloses( String closes )
  {
    this.closes = closes;
  }

  public String getCloses()
  {
    return closes;
  }

  public void setIs_closed( boolean is_closed )
  {
    this.is_closed = is_closed;
  }

  public boolean isIs_closed()
  {
    return is_closed;
  }

  public void setNote( String note )
  {
    this.note = note;
  }

  public String getNote()
  {
    return note;
  }
  
  public String toString()
  {
    return "day = " + day_of_week + "\topens = " + opens + "\tcloses = " + closes + "\tisClosed = " + is_closed + "\tnote = " + note;
  }
}
