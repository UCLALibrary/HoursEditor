package edu.ucla.library.libservices.scheduler.beans.model;

import edu.ucla.library.libservices.scheduler.db.procs.AddDailyHoursProcedure;
import edu.ucla.library.libservices.scheduler.db.procs.AddScheduleProcedure;
import edu.ucla.library.libservices.scheduler.db.procs.AddSpecialExceptionProcedure;

public class ScheduleAdder
{
  private int unitID;
  private int periodID;
  private int scheduleID;
  private String dayOfWeek;
  private String opens;
  private String closes;
  private boolean isClosed;
  private String note;
  private String exception;
  private String range;
  private int exceptionID;
  private String startDate;
  private String endDate;
  private String reason;
  private String sourceName;

  public ScheduleAdder()
  {
  }

  public void setUnitID( int unitID )
  {
    this.unitID = unitID;
  }

  public void setPeriodID( int periodID )
  {
    this.periodID = periodID;
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
  }

  public void setDayOfWeek( String dayOfWeek )
  {
    this.dayOfWeek = dayOfWeek;
  }

  public void setOpens( String opens )
  {
    this.opens = opens;
  }

  public void setCloses( String closes )
  {
    this.closes = closes;
  }

  public void setIsClosed( boolean isClosed )
  {
    this.isClosed = isClosed;
  }

  public void setNote( String note )
  {
    this.note = note;
  }

  public void setException( String exception )
  {
    this.exception = exception;
  }

  public void setRange( String range )
  {
    this.range = range;
  }

  public void setExceptionID( int exceptionID )
  {
    this.exceptionID = exceptionID;
  }

  public void setStartDate( String startDate )
  {
    this.startDate = startDate;
  }

  public void setEndDate( String endDate )
  {
    this.endDate = endDate;
  }

  public void setReason( String reason )
  {
    this.reason = reason;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void addSchedule()
  {
    AddScheduleProcedure asp;

    asp = new AddScheduleProcedure();

    asp.setPeriod( periodID );
    asp.setUnit( unitID );
    asp.setException( exception );
    asp.setRange( range );
    asp.setSourceName( sourceName );

    setScheduleID( asp.addSchedule() );
  }

  public void addHours()
  {
    AddDailyHoursProcedure adhp;

    adhp = new AddDailyHoursProcedure();

    adhp.setCloses( closes );
    adhp.setDayOfWeek( dayOfWeek );
    adhp.setIsClosed( isClosed );
    adhp.setNote( note );
    adhp.setOpens( opens );
    adhp.setScheduleID( scheduleID );
    adhp.setSourceName( sourceName );

    adhp.addHours();
  }

  public void addSpecialException()
  {
    AddSpecialExceptionProcedure asep;

    asep = new AddSpecialExceptionProcedure();

    asep.setEndDate( endDate );
    asep.setExceptionID( exceptionID );
    asep.setNote( reason );
    asep.setScheduleID( scheduleID );
    asep.setStartDate( startDate );
    asep.setSourceName( sourceName );

    asep.addException();
  }

}
