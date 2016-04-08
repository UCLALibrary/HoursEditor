package edu.ucla.library.libservices.scheduler.beans.forms;

public class ScheduleForm
{
  private String MT_O, MT_C, MT_Note;
  private String FR_O, FR_C, FR_Note;
  private String SA_O, SA_C, SA_Note;
  private String SU_O, SU_C, SU_Note;
  private boolean MT_Closed, FR_Closed, SA_Closed, SU_Closed;
  private String start_date, end_date;
  private String monday, friday, saturday, sunday;
  private String type, reason;

  public ScheduleForm()
  {
  }

  public void setMT_O( String mT_O )
  {
    this.MT_O = mT_O;
  }

  public String getMT_O()
  {
    return MT_O;
  }

  public void setMT_C( String mT_C )
  {
    this.MT_C = mT_C;
  }

  public String getMT_C()
  {
    return MT_C;
  }

  public void setMT_Note( String mT_Note )
  {
    this.MT_Note = mT_Note;
  }

  public String getMT_Note()
  {
    return MT_Note;
  }

  public void setFR_O( String fR_O )
  {
    this.FR_O = fR_O;
  }

  public String getFR_O()
  {
    return FR_O;
  }

  public void setFR_C( String fR_C )
  {
    this.FR_C = fR_C;
  }

  public String getFR_C()
  {
    return FR_C;
  }

  public void setFR_Note( String fR_Note )
  {
    this.FR_Note = fR_Note;
  }

  public String getFR_Note()
  {
    return FR_Note;
  }

  public void setSA_O( String sA_O )
  {
    this.SA_O = sA_O;
  }

  public String getSA_O()
  {
    return SA_O;
  }

  public void setSA_C( String sA_C )
  {
    this.SA_C = sA_C;
  }

  public String getSA_C()
  {
    return SA_C;
  }

  public void setSA_Note( String sA_Note )
  {
    this.SA_Note = sA_Note;
  }

  public String getSA_Note()
  {
    return SA_Note;
  }

  public void setSU_O( String sU_O )
  {
    this.SU_O = sU_O;
  }

  public String getSU_O()
  {
    return SU_O;
  }

  public void setSU_C( String sU_C )
  {
    this.SU_C = sU_C;
  }

  public String getSU_C()
  {
    return SU_C;
  }

  public void setSU_Note( String sU_Note )
  {
    this.SU_Note = sU_Note;
  }

  public String getSU_Note()
  {
    return SU_Note;
  }

  public void setMT_Closed( boolean mT_Closed )
  {
    this.MT_Closed = mT_Closed;
  }

  public boolean isMT_Closed()
  {
    return MT_Closed;
  }

  public void setFR_Closed( boolean fR_Closed )
  {
    this.FR_Closed = fR_Closed;
  }

  public boolean isFR_Closed()
  {
    return FR_Closed;
  }

  public void setSA_Closed( boolean sA_Closed )
  {
    this.SA_Closed = sA_Closed;
  }

  public boolean isSA_Closed()
  {
    return SA_Closed;
  }

  public void setSU_Closed( boolean sU_Closed )
  {
    this.SU_Closed = sU_Closed;
  }

  public boolean isSU_Closed()
  {
    return SU_Closed;
  }

  public void setStart_date( String start_date )
  {
    this.start_date = start_date;
  }

  public String getStart_date()
  {
    return start_date;
  }

  public void setEnd_date( String end_date )
  {
    this.end_date = end_date;
  }

  public String getEnd_date()
  {
    return end_date;
  }

  public void setMonday( String monday )
  {
    this.monday = monday;
  }

  public String getMonday()
  {
    return monday;
  }

  public void setFriday( String friday )
  {
    this.friday = friday;
  }

  public String getFriday()
  {
    return friday;
  }

  public void setSaturday( String saturday )
  {
    this.saturday = saturday;
  }

  public String getSaturday()
  {
    return saturday;
  }

  public void setSunday( String sunday )
  {
    this.sunday = sunday;
  }

  public String getSunday()
  {
    return sunday;
  }

  public void setType( String type )
  {
    this.type = type;
  }

  public String getType()
  {
    return type;
  }

  public void setReason( String reason )
  {
    this.reason = reason;
  }

  public String getReason()
  {
    return reason;
  }
}
