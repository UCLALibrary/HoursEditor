package edu.ucla.library.libservices.scheduler.web.servlets;

import edu.ucla.library.libservices.scheduler.beans.tables.DailyHour;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrepScheduleServlet
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
      clearSession( session );

    session.setAttribute( "monday", 
                          makeDay( "Mon-Thurs", request.getParameter( "MT_O" ), 
                                   request.getParameter( "MT_C" ), 
                                   request.getParameter( "MT_Closed" ), 
                                   request.getParameter( "MT_Note" ) ) );
    session.setAttribute( "friday", 
                          makeDay( "Fri", request.getParameter( "FR_O" ), 
                                   request.getParameter( "FR_C" ), 
                                   request.getParameter( "FR_Closed" ), 
                                   request.getParameter( "FR_Note" ) ) );
    session.setAttribute( "saturday", 
                          makeDay( "Sat", request.getParameter( "SA_O" ), 
                                   request.getParameter( "SA_C" ), 
                                   request.getParameter( "SA_Closed" ), 
                                   request.getParameter( "SA_Note" ) ) );
    session.setAttribute( "sunday", 
                          makeDay( "Sun", request.getParameter( "SU_O" ), 
                                   request.getParameter( "SU_C" ), 
                                   request.getParameter( "SU_Closed" ), 
                                   request.getParameter( "SU_Note" ) ) );

    session.setAttribute( "unit_id", request.getParameter( "unit" ) );
    session.setAttribute( "period_id", request.getParameter( "period" ) );
    if ( request.getParameter( "type" ).equalsIgnoreCase( "edit" ) )
      session.setAttribute( "schedule_id", 
                            request.getParameter( "schedule" ) );
    
    if ( request.getParameter( "type" ).equalsIgnoreCase( "add" ) )
      response.sendRedirect("VerifyAddStandard.jsp");
    else
      response.sendRedirect("VerifyEditStandard.jsp");
  }

  private DailyHour makeDay( String day, String opens, String closes, 
                             String isClosed, String note )
  {
    DailyHour bean;

    bean = new DailyHour();

    bean.setCloses( closes );
    bean.setDay_of_week( day );
    if ( isClosed != null )
      bean.setIs_closed( true );
    else
      bean.setIs_closed( false );
    bean.setNote( note );
    bean.setOpens( opens );
    
    return bean;
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
}
