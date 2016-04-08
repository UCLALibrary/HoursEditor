package edu.ucla.library.libservices.scheduler.beans.tables;

import java.util.Date;

public class ScheduleSpecialException
{
  private int special_exception_id;
  private int schedule_id;
  private int exception_id;
  private Date start_date;
  private Date end_date;
  private String note;

  public ScheduleSpecialException()
  {
  }

  public void setSpecial_exception_id( int special_exception_id )
  {
    this.special_exception_id = special_exception_id;
  }

  public int getSpecial_exception_id()
  {
    return special_exception_id;
  }

  public void setSchedule_id( int schedule_id )
  {
    this.schedule_id = schedule_id;
  }

  public int getSchedule_id()
  {
    return schedule_id;
  }

  public void setException_id( int exception_id )
  {
    this.exception_id = exception_id;
  }

  public int getException_id()
  {
    return exception_id;
  }

  public void setStart_date( Date start_date )
  {
    this.start_date = start_date;
  }

  public Date getStart_date()
  {
    return start_date;
  }

  public void setEnd_date( Date end_date )
  {
    this.end_date = end_date;
  }

  public Date getEnd_date()
  {
    return end_date;
  }

  public void setNote( String note )
  {
    this.note = note;
  }

  public String getNote()
  {
    return note;
  }
}
