package edu.ucla.library.libservices.scheduler.beans.utility;

import edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean;
import edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean;

import java.text.SimpleDateFormat;

public class ScheduleExceptionUtility
{
  private int holiday;
  private int exception;
  private int except_period;
  private int except_id;
  private int period;
  private String exceptTitle;
  private String exceptStart;
  private String exceptEnd;
  private String type;
  private PeriodWebBean theHoliday;
  private ScheduleExceptionWebBean theException;
  private static final SimpleDateFormat PLAIN_DATE = new SimpleDateFormat("MM/dd/yy");
  private String sourceName;

  public ScheduleExceptionUtility()
  {
    except_period = -1;
    except_id = -1;
    holiday = -1;
    exceptTitle = "";
    exceptStart = "";
    exceptEnd = "";
    type = "";
  }

  public void setHoliday( int holiday )
  {
    this.holiday = holiday;
    if ( holiday != -1 )
    {
      theHoliday = new PeriodWebBean();
      theHoliday.setPeriodId(holiday);
      theHoliday.setSourceName(sourceName);
    }
  }

  public void setException( int exception )
  {
    this.exception = exception;
    if ((exception != -2) &&
        (exception != -1) )
    {
      theException = new ScheduleExceptionWebBean();
      theException.setExceptionID(exception);
      theException.setSourceName(sourceName);
    }
  }

  public void setExcept_period( int except_period )
  {
    this.except_period = except_period;
  }

  public void setExcept_id( int except_id )
  {
    this.except_id = except_id;
  }

  public void setPeriod( int period )
  {
    this.period = period;
  }

  public void setExceptTitle( String exceptTitle )
  {
    this.exceptTitle = exceptTitle;
  }

  public void setExceptStart( String exceptStart )
  {
    this.exceptStart = exceptStart;
  }

  public void setExceptEnd( String exceptEnd )
  {
    this.exceptEnd = exceptEnd;
  }

  public void setType( String type )
  {
    this.type = type;
  }

  public PeriodWebBean getTheHoliday()
  {
    return theHoliday;
  }

  public ScheduleExceptionWebBean getTheException()
  {
    return theException;
  }

  public void setSourceName( String sourceName )
  {
    this.sourceName = sourceName;
  }
  public String getExceptTitle()
  {
    if ( holiday != -1 )
      return getTitleByHoliday();
    else
      return getTitleByException();
  }

  private String getTitleByHoliday()
  {
    String titleByHoliday;

    titleByHoliday = "";

    if ( theHoliday != null )
    {
      titleByHoliday = theHoliday.getPeriod().getPeriod_title();
    }

    return titleByHoliday;
  }

  private String getTitleByException()
  {
    String titleByException;

    titleByException = "";

    if ( theException != null )
    {
      titleByException = theException.getException().getException_title();
    }

    return titleByException;
  }

  public String getExceptStart()
  {
    if ( holiday != -1 )
      return getStartByHoliday();
    else
      return "";
  }

  private String getStartByHoliday()
  {
    String startByHoliday;

    startByHoliday = "";

    if ( theHoliday != null )
    {
      startByHoliday = PLAIN_DATE.format( theHoliday.getPeriod().getStart_date() );
    }

    return startByHoliday;
  }

  public String getExceptEnd()
  {
    if ( holiday != -1 )
      return getEndByHoliday();
    else
      return "";
  }

  private String getEndByHoliday()
  {
    String endByHoliday;

    endByHoliday = "";

    if ( theHoliday != null )
    {
      endByHoliday = PLAIN_DATE.format( theHoliday.getPeriod().getEnd_date() );
    }

    return endByHoliday;
  }

  public Integer getExcept_period()
  {
    if ( holiday != -1 )
      return getHoliday();
    else
      return getPeriod();
  }

  public Integer getExcept_id()
  {
    return getException();
  }

  public String getType()
  {
    if ( holiday != -1 )
      return "holiday";
    else
      return "except";
  }

  public int getHoliday()
  {
    return holiday;
  }

  public int getException()
  {
    return exception;
  }

  public int getPeriod()
  {
    return period;
  }

}
