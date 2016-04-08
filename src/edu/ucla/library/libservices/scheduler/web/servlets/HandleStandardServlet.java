package edu.ucla.library.libservices.scheduler.web.servlets;

import edu.ucla.library.libservices.scheduler.beans.model.ScheduleAdder;
import edu.ucla.library.libservices.scheduler.beans.model.ScheduleDeleter;
import edu.ucla.library.libservices.scheduler.beans.model.ScheduleUpdater;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HandleStandardServlet
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

    response.setContentType( CONTENT_TYPE );
    out = response.getWriter();
    session = request.getSession( false );

    if ( request.getParameter( "type" ).equalsIgnoreCase( "add" ) )
      addSchedule( request );
    else if ( request.getParameter( "type" ).equalsIgnoreCase( "edit" ) )
      editSchedule( request );
    else
      deleteSchedule( request );

    if ( request.getParameter( "type" ).equalsIgnoreCase( "add" ) )
      clearSession( session );

    response.sendRedirect( "OptionsMenu.jsp" );
  }

  private void clearSession( HttpSession session )
  {
    session.removeAttribute( "monday" );
    session.removeAttribute( "friday" );
    session.removeAttribute( "saturday" );
    session.removeAttribute( "sunday" );
    session.removeAttribute( "unit_id" );
    session.removeAttribute( "period_id" );
  }

  private void addSchedule( HttpServletRequest request )
  {
    ScheduleAdder adder;

    adder = new ScheduleAdder();
    adder.setPeriodID( Integer.parseInt( request.getParameter( "period" ) ) );
    adder.setUnitID( Integer.parseInt( request.getParameter( "unit" ) ) );
    adder.setException( "0" );
    adder.setRange( "0" );
    adder.setSourceName( getServletContext().getInitParameter( "db.source" ) );

    adder.addSchedule();

    addDay( adder, "Mon-Thurs", request.getParameter( "MT_O" ), 
            request.getParameter( "MT_C" ), 
            ( request.getParameter( "MT_Closed" ) != null? true : false ), 
            request.getParameter( "MT_Note" ) );

    addDay( adder, "Fri", request.getParameter( "FR_O" ), 
            request.getParameter( "FR_C" ), 
            ( request.getParameter( "FR_Closed" ) != null? true : false ), 
            request.getParameter( "FR_Note" ) );

    addDay( adder, "Sat", request.getParameter( "SA_O" ), 
            request.getParameter( "SA_C" ), 
            ( request.getParameter( "SA_Closed" ) != null? true : false ), 
            request.getParameter( "SA_Note" ) );

    addDay( adder, "Sun", request.getParameter( "SU_O" ), 
            request.getParameter( "SU_C" ), 
            ( request.getParameter( "SU_Closed" ) != null? true : false ), 
            request.getParameter( "SU_Note" ) );

  }

  private void editSchedule( HttpServletRequest request )
  {
    ScheduleUpdater updater;

    updater = new ScheduleUpdater();
    updater.setSourceName( getServletContext().getInitParameter( "db.source" ) );

    updateDay( updater, new Integer( request.getParameter( "schedule" ) ), 
               "Mon-Thurs", request.getParameter( "MT_O" ), 
               request.getParameter( "MT_C" ), 
               ( request.getParameter( "MT_Closed" ) != null? true : 
                 false ), request.getParameter( "MT_Note" ) );

    updateDay( updater, new Integer( request.getParameter( "schedule" ) ), 
               "Fri", request.getParameter( "FR_O" ), 
               request.getParameter( "FR_C" ), 
               ( request.getParameter( "FR_Closed" ) != null? true : 
                 false ), request.getParameter( "FR_Note" ) );

    updateDay( updater, new Integer( request.getParameter( "schedule" ) ), 
               "Sat", request.getParameter( "SA_O" ), 
               request.getParameter( "SA_C" ), 
               ( request.getParameter( "SA_Closed" ) != null? true : 
                 false ), request.getParameter( "SA_Note" ) );

    updateDay( updater, new Integer( request.getParameter( "schedule" ) ), 
               "Sun", request.getParameter( "SU_O" ), 
               request.getParameter( "SU_C" ), 
               ( request.getParameter( "SU_Closed" ) != null? true : 
                 false ), request.getParameter( "SU_Note" ) );
  }

  private void addDay( ScheduleAdder adder, String day, String opens, 
                       String closes, boolean closed, String note )
  {
    adder.setCloses( closes );
    adder.setDayOfWeek( day );
    adder.setIsClosed( Boolean.valueOf( ( closed ) ) );
    adder.setNote( note );
    adder.setOpens( opens );

    adder.addHours();
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

    updater.updateHours();
  }

  private void deleteSchedule( HttpServletRequest request )
  {
    ScheduleDeleter sd;
    String[] scheds;

    sd = new ScheduleDeleter();
    sd.setSourceName( getServletContext().getInitParameter( "db.source" ) );

    scheds = request.getParameterValues( "schedule" );
    for ( int i = 0; i < scheds.length; i++ )
    {
      sd.setScheduleID( Integer.parseInt( scheds[ i ] ) );
      sd.deleteHours();
    }
  }
}
