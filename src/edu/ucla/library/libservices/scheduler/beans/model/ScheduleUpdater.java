package edu.ucla.library.libservices.scheduler.beans.model;

import edu.ucla.library.libservices.scheduler.db.procs.AddDailyHoursProcedure;
import edu.ucla.library.libservices.scheduler.db.procs.UpdateDailyHoursProcedure;
import edu.ucla.library.libservices.scheduler.db.procs.UpdateSpecialExceptionProc;
import edu.ucla.library.libservices.scheduler.db.utility.DbUtility;

public class ScheduleUpdater
{
  private int periodID;
  private int scheduleID;
  private String dayOfWeek;
  private String opens;
  private String closes;
  private boolean isClosed;
  private String note;
  private String sourceName;
  private int specialExceptionID;
  private String startDate;
  private String endDate;
  private String reason;

  public ScheduleUpdater()
  {
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

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void setSpecialExceptionID( int specialExceptionID )
  {
    this.specialExceptionID = specialExceptionID;
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

  public void updateHours()
  {
    UpdateDailyHoursProcedure udhp;
    udhp = new UpdateDailyHoursProcedure();
    udhp.setCloses( closes );
    udhp.setDayOfWeek( dayOfWeek );
    udhp.setIsClosed( isClosed );
    udhp.setNote( note );
    udhp.setOpens( opens );
    udhp.setScheduleID( scheduleID );
    udhp.setSourceName( sourceName );
    udhp.updateHours();
  }

  public void updateExceptionHours()
  {
    if ( DbUtility.isExistingDay(scheduleID, dayOfWeek, sourceName) )
      doUpdate();
    else
      doInsert();
  }

  private void doUpdate()
  {
    UpdateDailyHoursProcedure udhp;

    udhp = new UpdateDailyHoursProcedure();

    udhp.setCloses(closes);
    udhp.setDayOfWeek(dayOfWeek);
    udhp.setIsClosed(isClosed);
    udhp.setNote(note);
    udhp.setOpens(opens);
    udhp.setScheduleID(scheduleID);
    udhp.setSourceName(sourceName);

    udhp.updateHours();
  }

  private void doInsert()
  {
    AddDailyHoursProcedure adhp;

    adhp = new AddDailyHoursProcedure();

    adhp.setCloses(closes);
    adhp.setDayOfWeek(dayOfWeek);
    adhp.setIsClosed(isClosed);
    adhp.setNote(note);
    adhp.setOpens(opens);
    adhp.setScheduleID(scheduleID);
    adhp.setSourceName(sourceName);

    adhp.addHours();
  }

  public void updateSpecialException()
  {
    UpdateSpecialExceptionProc usep;

    usep = new UpdateSpecialExceptionProc();

    usep.setEndDate(endDate);
    usep.setNote(reason);
    usep.setSpecialExceptionID(specialExceptionID);
    usep.setStartDate(startDate);
    usep.setSourceName(sourceName);

    usep.updateException();
  }

  public int getScheduleID()
  {
    return scheduleID;
  }
}
