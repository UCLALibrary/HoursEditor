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

public class PrepExceptionServlet
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

    clearSession( session );
    handleDays( request, session );
    updateSession( request, session );

    if ( request.getParameter( "addedit" ).equalsIgnoreCase( "add" ) )
      response.sendRedirect( "VerifyAddException.jsp" );
    else
      response.sendRedirect( "VerifyEditException.jsp" );
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

  private void updateSession( HttpServletRequest request, 
                              HttpSession session )
  {
    session.setAttribute( "unit_id", request.getParameter( "unit" ) );
    session.setAttribute( "period_id", request.getParameter( "period" ) );
    session.setAttribute( "type", request.getParameter( "type" ) );
    session.setAttribute( "except_period", 
                          request.getParameter( "except_period" ) );
    session.setAttribute( "except_id", 
                          request.getParameter( "except_id" ) );
    session.setAttribute( "reason", request.getParameter( "reason" ) );
    session.setAttribute( "title", request.getParameter( "title" ) );
    session.setAttribute( "start_date", 
                          request.getParameter( "start_date" ) );
    session.setAttribute( "end_date", request.getParameter( "end_date" ) );
    session.setAttribute( "special_id", 
                          request.getParameter( "special_id" ) );
  }

  private void handleDays( HttpServletRequest request, 
                           HttpSession session )
  {
    if ( request.getParameter( "monday" ) != null )
    {
      session.setAttribute( "monday_bean", 
                            makeDay( "Mon-Thurs", request.getParameter( "MT_O" ), 
                                     request.getParameter( "MT_C" ), 
                                     request.getParameter( "MT_Closed" ), 
                                     request.getParameter( "MT_Note" ) ) );
      session.setAttribute( "monday", request.getParameter( "monday" ) );
    }

    //System.out.println("friday = " + request.getParameter("friday"));
    if ( request.getParameter( "friday" ) != null )
    {
      session.setAttribute( "friday_bean", 
                            makeDay( "Fri", request.getParameter( "FR_O" ), 
                                     request.getParameter( "FR_C" ), 
                                     request.getParameter( "FR_Closed" ), 
                                     request.getParameter( "FR_Note" ) ) );
      session.setAttribute( "friday", request.getParameter( "friday" ) );
    }

    //System.out.println("saturday = " + request.getParameter("saturday"));
    if ( request.getParameter( "saturday" ) != null )
    {
      session.setAttribute( "saturday_bean", 
                            makeDay( "Sat", request.getParameter( "SA_O" ), 
                                     request.getParameter( "SA_C" ), 
                                     request.getParameter( "SA_Closed" ), 
                                     request.getParameter( "SA_Note" ) ) );
      session.setAttribute( "saturday", 
                            request.getParameter( "saturday" ) );
    }

    //System.out.println("sunday = " + request.getParameter("sunday"));
    if ( request.getParameter( "sunday" ) != null )
    {
      session.setAttribute( "sunday_bean", 
                            makeDay( "Sun", request.getParameter( "SU_O" ), 
                                     request.getParameter( "SU_C" ), 
                                     request.getParameter( "SU_Closed" ), 
                                     request.getParameter( "SU_Note" ) ) );
      session.setAttribute( "sunday", request.getParameter( "sunday" ) );
    }
  }
}
