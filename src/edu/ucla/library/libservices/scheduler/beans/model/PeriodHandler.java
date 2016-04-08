package edu.ucla.library.libservices.scheduler.beans.model;

import edu.ucla.library.libservices.scheduler.db.procs.AddPeriodProcedure;
import edu.ucla.library.libservices.scheduler.db.procs.EditPeriodProcedure;

public class PeriodHandler
{
  private String period_title, start_date, end_date;
  private boolean is_exception;
  private int falls_in_semester, falls_in_quarter, period_id;
  private String sourceName;

  public PeriodHandler()
  {
  }
  
  public void addPeriod()
  {
    AddPeriodProcedure app;
    
    app = new AddPeriodProcedure();

    app.setEnd_date(end_date);
    app.setFalls_in_quarter(falls_in_quarter);
    app.setFalls_in_semester(falls_in_semester);
    app.setIs_exception(is_exception);
    app.setPeriod_title(period_title);
    app.setStart_date(start_date);
    app.setSourceName(sourceName);

    app.addPeriod();
  }

  public void editPeriod()
  {
    EditPeriodProcedure epp;
    
    epp = new EditPeriodProcedure();

    epp.setEnd_date(end_date);
    epp.setFalls_in_quarter(falls_in_quarter);
    epp.setFalls_in_semester(falls_in_semester);
    epp.setIs_exception(is_exception);
    epp.setPeriod_title(period_title);
    epp.setStart_date(start_date);
    epp.setPeriod_id(period_id);
    epp.setSourceName(sourceName);

    epp.editPeriod();
  }

  public void setPeriod_title( String period_title )
  {
    this.period_title = period_title;
  }

  public void setStart_date( String start_date )
  {
    this.start_date = start_date;
  }

  public void setEnd_date( String end_date )
  {
    this.end_date = end_date;
  }

  public void setIs_exception( boolean is_exception )
  {
    this.is_exception = is_exception;
  }

  public void setFalls_in_semester( int falls_in_semester )
  {
    this.falls_in_semester = falls_in_semester;
  }

  public void setFalls_in_quarter( int falls_in_quarter )
  {
    this.falls_in_quarter = falls_in_quarter;
  }

  public void setPeriod_id( int period_id )
  {
    this.period_id = period_id;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }
}
