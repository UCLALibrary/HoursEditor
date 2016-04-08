package edu.ucla.library.libservices.scheduler.web.servlets;

import edu.ucla.library.libservices.scheduler.beans.model.ScheduleAdder;
import edu.ucla.library.libservices.scheduler.beans.model.ScheduleUpdater;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HandleExceptionServlet
  extends HttpServlet
{
  private static final String CONTENT_TYPE = 
    "text/html; charset=utf-8";

  public void init( ServletConfig config )
    throws ServletException
  {
    super.init( config );
  }

  /**Process the HTTP doPost request.
   */
  public void doPost( HttpServletRequest request, 
                      HttpServletResponse response )
    throws ServletException, IOException
  {
    PrintWriter out;
    HttpSession session;
    String forward;

    response.setContentType( CONTENT_TYPE );
    out = response.getWriter();
    session = request.getSession( false );

    if ( request.getParameter( "addedit" ).equalsIgnoreCase( "add" ) )
      addException( request );
    else
      editSchedule( request );

    clearSession( session );

    if ( request.getParameter( "submit" ).equalsIgnoreCase( "Finish" ) )
    {
      forward = "OptionsMenu.jsp";
      session.removeAttribute( "except_unit" );
      session.removeAttribute( "except_period" );
    }
    else
    {
      if ( request.getParameter( "addedit" ).equalsIgnoreCase( "add" ) )
        forward = "AddException.jsp";
      else
        forward = "EditException.jsp";
      session.setAttribute( "except_unit", 
                            request.getParameter( "unit" ) );
      session.setAttribute( "except_period", 
                            request.getParameter( "period" ) );
    }

    response.sendRedirect( forward );
  }

  private void addException( HttpServletRequest request )
  {
    ScheduleAdder adder;

    adder = new ScheduleAdder();

    adder.setPeriodID( Integer.parseInt( request.getParameter( "except_period" ) ) );
    adder.setUnitID( Integer.parseInt( request.getParameter( "unit" ) ) );
    adder.setSourceName( getServletContext().getInitParameter( "db.source" ) );

    if ( request.getParameter( "type" ).equalsIgnoreCase( "holiday" ) )
    {
      adder.setException( "1" );
      adder.setRange( "0" );
      adder.addSchedule();
    }
    else
    {
      adder.setException( "1" );
      adder.setRange( "1" );
      adder.addSchedule();

      adder.setStartDate( request.getParameter( "start_date" ) );
      adder.setEndDate( request.getParameter( "end_date" ) );
      adder.setExceptionID( new Integer( request.getParameter( "except_id" ) ) );
      adder.setReason( request.getParameter( "reason" ) );

      adder.addSpecialException();
    }

    // System.out.print("monday = " + request.getParameter("monday"));
    if ( request.getParameter( "monday" ) != null )
      addDay( adder, "Mon-Thurs", request.getParameter( "MT_O" ), 
              request.getParameter( "MT_C" ), 
              ( request.getParameter( "MT_Closed" ) != null? true : 
                false ), request.getParameter( "MT_Note" ) );

    //System.out.print("friday = " + request.getParameter("friday"));
    if ( request.getParameter( "friday" ) != null )
      addDay( adder, "Fri", request.getParameter( "FR_O" ), 
              request.getParameter( "FR_C" ), 
              ( request.getParameter( "FR_Closed" ) != null? true : 
                false ), request.getParameter( "FR_Note" ) );

    //System.out.print("saturday = " + request.getParameter("saturday"));
    if ( request.getParameter( "saturday" ) != null )
      addDay( adder, "Sat", request.getParameter( "SA_O" ), 
              request.getParameter( "SA_C" ), 
              ( request.getParameter( "SA_Closed" ) != null? true : 
                false ), request.getParameter( "SA_Note" ) );

    //System.out.print("sunday = " + request.getParameter("sunday"));
    if ( request.getParameter( "sunday" ) != null )
      addDay( adder, "Sun", request.getParameter( "SU_O" ), 
              request.getParameter( "SU_C" ), 
              ( request.getParameter( "SU_Closed" ) != null? true : 
                false ), request.getParameter( "SU_Note" ) );
  }

  private void addDay( ScheduleAdder adder, String day, String opens, 
                       String closes, boolean closed, String note )
  {
    adder.setCloses( closes );
    adder.setDayOfWeek( day );
    adder.setIsClosed( closed );
    adder.setNote( note );
    adder.setOpens( opens );

    adder.addHours();
  }

  private void clearSession( HttpSession session )
  {
    session.removeAttribute( "monday" );
    session.removeAttribute( "friday" );
    session.removeAttribute( "saturday" );
    session.removeAttribute( "sunday" );
    session.removeAttribute( "monday_bean" );
    session.removeAttribute( "friday_bean" );
    session.removeAttribute( "saturday_bean" );
    session.removeAttribute( "sunday_bean" );
    session.removeAttribute( "unit_id" );
    session.removeAttribute( "period_id" );
    session.removeAttribute( "type" );
    session.removeAttribute( "except_period" );
    session.removeAttribute( "except_id" );
    session.removeAttribute( "reason" );
    session.removeAttribute( "title" );
    session.removeAttribute( "start_date" );
    session.removeAttribute( "end_date" );
  }

  private void editSchedule( HttpServletRequest request )
  {
    ScheduleUpdater updater;

    updater = new ScheduleUpdater();

    updater.setScheduleID( Integer.parseInt( request.getParameter( "except_id" ) ) );
    updater.setSourceName( getServletContext().getInitParameter( "db.source" ) );

    if ( request.getParameter( "monday" ) != null )
      updateDay( updater, updater.getScheduleID(), "Mon-Thurs", 
                 request.getParameter( "MT_O" ), 
                 request.getParameter( "MT_C" ), 
                 ( request.getParameter( "MT_Closed" ) != null? true : 
                   false ), request.getParameter( "MT_Note" ) );

    //System.out.print("friday = " + request.getParameter("friday"));
    if ( request.getParameter( "friday" ) != null )
      updateDay( updater, updater.getScheduleID(), "Fri", 
                 request.getParameter( "FR_O" ), 
                 request.getParameter( "FR_C" ), 
                 ( request.getParameter( "FR_Closed" ) != null? true : 
                   false ), request.getParameter( "FR_Note" ) );

    //System.out.print("saturday = " + request.getParameter("saturday"));
    if ( request.getParameter( "saturday" ) != null )
      updateDay( updater, updater.getScheduleID(), "Sat", 
                 request.getParameter( "SA_O" ), 
                 request.getParameter( "SA_C" ), 
                 ( request.getParameter( "SA_Closed" ) != null? true : 
                   false ), request.getParameter( "SA_Note" ) );

    //System.out.print("sunday = " + request.getParameter("sunday"));
    if ( request.getParameter( "sunday" ) != null )
      updateDay( updater, updater.getScheduleID(), "Sun", 
                 request.getParameter( "SU_O" ), 
                 request.getParameter( "SU_C" ), 
                 ( request.getParameter( "SU_Closed" ) != null? true : 
                   false ), request.getParameter( "SU_Note" ) );

    if ( request.getParameter( "type" ).equalsIgnoreCase( "except" ) )
      updateSpecial( updater, 
                     new Integer( request.getParameter( "special_id" ) ), 
                     request.getParameter( "start_date" ), 
                     request.getParameter( "end_date" ), 
                     request.getParameter( "reason" ) );
  }

  private void updateDay( ScheduleUpdater updater, Integer schedule, 
                          String day, String opens, String closes, 
                          boolean closed, String note )
  {
    updater.setCloses( closes );
    updater.setDayOfWeek( day );
    updater.setIsClosed( Boolean.valueOf( ( closed ) ) );
    updater.setNote( note );
    updater.setOpens( opens );
    updater.setScheduleID( schedule );

    updater.updateExceptionHours();
  }

  private void updateSpecial( ScheduleUpdater updater, Integer exceptionID, 
                              String start, String end, String note )
  {
    updater.setSpecialExceptionID( exceptionID );
    updater.setStartDate( start );
    updater.setEndDate( end );
    updater.setReason( note );

    updater.updateSpecialException();
  }
}
