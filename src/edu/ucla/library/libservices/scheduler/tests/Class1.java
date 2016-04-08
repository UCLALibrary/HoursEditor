package edu.ucla.library.libservices.scheduler.tests;

//import edu.ucla.library.libservices.scheduler.beans.tables.DailyHour;
//import edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean;
//import edu.ucla.library.libservices.scheduler.beans.utility.HolidayUtility;

import edu.ucla.library.libservices.scheduler.beans.utility.ScheduleExceptionUtility;

public class Class1
{
  public Class1()
  {
  }

  public static void main( String[] args )
  {
    ScheduleExceptionUtility exceptUtil;
    exceptUtil = new ScheduleExceptionUtility();
    exceptUtil.setException(1);
    exceptUtil.setHoliday(-1);
    exceptUtil.setPeriod(46);
    exceptUtil.setSourceName("java:/scheduleDS");
    System.out.println( exceptUtil.getExceptTitle() );
  }
}
/*
 <jsp:setProperty name="exceptUtil" property="sourceName"
                  value="${initParam['db.source']}"/>


 * unit=5&period=46
 DailyHourWebBean theDay;
 //DailyHour theHours;
 
 theDay = new DailyHourWebBean();
 theDay.setDayOfWeek("Mon-Thurs");
 theDay.setScheduleID(2417);
 theDay.setSourceName("java:/scheduleDS");
 
 //theHours = theDay.getDailyHour();
 System.out.println("opens at: " + theDay.getDailyHour().getOpens()); 
 System.out.println("closes at: " + theDay.getDailyHour().getCloses()); 
 System.out.println(( theDay.getDailyHour().isIs_closed() ? "is closed" : "" )); 
 System.out.println("note: " + theDay.getDailyHour().getNote()); 

 HolidayUtility holidays;
 holidays = new HolidayUtility();
 holidays.setPeriodID(46);
 holidays.setSourceName("java:/scheduleDS");
 holidays.setUnitID(5);
 
 holidays.getOpenHolidays();
 */