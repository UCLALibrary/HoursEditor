package edu.ucla.library.libservices.scheduler.beans.tables;

public class Schedule
{
  private int schedule_id;
  private int unit_id;
  private int period_id;
  private boolean is_exception;
  private boolean has_special_range;

  public Schedule()
  {
  }

  public void setSchedule_id( int schedule_id )
  {
    this.schedule_id = schedule_id;
  }

  public int getSchedule_id()
  {
    return schedule_id;
  }

  public void setUnit_id( int unit_id )
  {
    this.unit_id = unit_id;
  }

  public int getUnit_id()
  {
    return unit_id;
  }

  public void setPeriod_id( int period_id )
  {
    this.period_id = period_id;
  }

  public int getPeriod_id()
  {
    return period_id;
  }

  public void setIs_exception( boolean is_exception )
  {
    this.is_exception = is_exception;
  }

  public boolean isIs_exception()
  {
    return is_exception;
  }

  public void setHas_special_range( boolean has_special_range )
  {
    this.has_special_range = has_special_range;
  }

  public boolean isHas_special_range()
  {
    return has_special_range;
  }
}
