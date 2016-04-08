package edu.ucla.library.libservices.scheduler.beans.tables;

import java.util.Date;

public class Period
{
  private int period_id;
  private String period_title;
  private Date start_date;
  private Date end_date;
  private boolean is_exception;
  private int falls_in_quarter;
  private int falls_in_semester;

  public Period()
  {
  }

  public void setPeriod_id( int period_id )
  {
    this.period_id = period_id;
  }

  public int getPeriod_id()
  {
    return period_id;
  }

  public void setPeriod_title( String period_title )
  {
    this.period_title = period_title;
  }

  public String getPeriod_title()
  {
    return period_title;
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

  public void setIs_exception( boolean is_exception )
  {
    this.is_exception = is_exception;
  }

  public boolean isIs_exception()
  {
    return is_exception;
  }

  public void setFalls_in_quarter( int falls_in_quarter )
  {
    this.falls_in_quarter = falls_in_quarter;
  }

  public int getFalls_in_quarter()
  {
    return falls_in_quarter;
  }

  public void setFalls_in_semester( int falls_in_semester )
  {
    this.falls_in_semester = falls_in_semester;
  }

  public int getFalls_in_semester()
  {
    return falls_in_semester;
  }
}
