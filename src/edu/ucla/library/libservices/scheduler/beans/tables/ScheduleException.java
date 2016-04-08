package edu.ucla.library.libservices.scheduler.beans.tables;

public class ScheduleException
{
  private int exception_id;
  private String exception_title;

  public ScheduleException()
  {
  }

  public void setException_id( int exception_id )
  {
    this.exception_id = exception_id;
  }

  public int getException_id()
  {
    return exception_id;
  }

  public void setException_title( String exception_title )
  {
    this.exception_title = exception_title;
  }

  public String getException_title()
  {
    return exception_title;
  }
}
