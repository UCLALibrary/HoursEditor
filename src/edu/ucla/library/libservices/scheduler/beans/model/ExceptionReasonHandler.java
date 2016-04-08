package edu.ucla.library.libservices.scheduler.beans.model;

import edu.ucla.library.libservices.scheduler.db.procs.AddExceptionReasonProcedure;
import edu.ucla.library.libservices.scheduler.db.procs.EditExceptionReasonProcedure;

public class ExceptionReasonHandler
{
  private String exception_title;
  private int exception_id;
  private String sourceName;
  
  public ExceptionReasonHandler()
  {
  }

  public void addExceptionReason()
  {
    AddExceptionReasonProcedure aep;
    
    aep = new AddExceptionReasonProcedure();
    aep.setException_title(exception_title);
    aep.setSourceName(sourceName);
    
    aep.addReason();
  }

  public void editExceptionReason()
  {
    EditExceptionReasonProcedure eep;
    
    eep = new EditExceptionReasonProcedure();
    eep.setException_id(exception_id);
    eep.setException_title(exception_title);
    eep.setSourceName(sourceName);
    
    eep.editReason();
  }

  public void setException_title( String exception_title )
  {
    this.exception_title = exception_title;
  }

  public void setException_id( int exception_id )
  {
    this.exception_id = exception_id;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }
}
