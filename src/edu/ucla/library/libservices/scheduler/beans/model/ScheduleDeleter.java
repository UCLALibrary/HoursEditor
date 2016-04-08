package edu.ucla.library.libservices.scheduler.beans.model;

import edu.ucla.library.libservices.scheduler.db.procs.DeleteScheduleProcedure;

public class ScheduleDeleter
{
  private int scheduleID;
  private String sourceName;

  public ScheduleDeleter()
  {
  }

  public void setScheduleID( int scheduleID )
  {
    this.scheduleID = scheduleID;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }

  public void deleteHours()
  {
    DeleteScheduleProcedure dsp;
    dsp = new DeleteScheduleProcedure();
    dsp.setScheduleID( scheduleID );
    dsp.setSourceName( sourceName );
    dsp.deleteSchedule();
  }

}
