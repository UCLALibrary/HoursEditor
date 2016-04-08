package edu.ucla.library.libservices.scheduler.web.servlets;

import edu.ucla.library.libservices.scheduler.beans.model.ExceptionReasonHandler;
import edu.ucla.library.libservices.scheduler.beans.model.PeriodHandler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlePeriodServlet
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

    response.setContentType( CONTENT_TYPE );
    out = response.getWriter();

    if ( request.getParameter( "type" ).equalsIgnoreCase( "period" ) )
    {
      if ( request.getParameter( "method" ).equalsIgnoreCase( "add" ) )
        doAddPeriod( request );
      else
        doEditPeriod( request );
    }
    else
    {
      if ( request.getParameter( "method" ).equalsIgnoreCase( "add" ) )
        doAddException( request );
      else
        doEditException( request );
    }

    response.sendRedirect( "AdminMenu.jsp" );
  }

  private void doAddPeriod( HttpServletRequest request )
  {
    PeriodHandler adder;

    adder = new PeriodHandler();

    adder.setEnd_date( request.getParameter( "end_date" ) );
    adder.setFalls_in_quarter( Integer.parseInt( request.getParameter( "falls_in_quarter" ) ) );
    adder.setFalls_in_semester( Integer.parseInt( request.getParameter( "falls_in_semester" ) ) );
    adder.setIs_exception( ( request.getParameter( "is_exception" ) != 
                             null? true : false ) );
    adder.setPeriod_title( request.getParameter( "period_title" ) );
    adder.setStart_date( request.getParameter( "start_date" ) );
    adder.setSourceName( getServletContext().getInitParameter( "db.source" ) );

    adder.addPeriod();
  }

  private void doEditPeriod( HttpServletRequest request )
  {
    PeriodHandler updater;

    updater = new PeriodHandler();
    updater.setEnd_date( request.getParameter( "end_date" ) );
    updater.setFalls_in_quarter( Integer.parseInt( request.getParameter( "falls_in_quarter" ) ) );
    updater.setFalls_in_semester( Integer.parseInt( request.getParameter( "falls_in_semester" ) ) );
    updater.setIs_exception( ( request.getParameter( "is_exception" ) != 
                               null? true : false ) );
    updater.setPeriod_id( Integer.parseInt( request.getParameter( "period_id" ) ) );
    updater.setPeriod_title( request.getParameter( "period_title" ) );
    updater.setStart_date( request.getParameter( "start_date" ) );
    updater.setSourceName( getServletContext().getInitParameter( "db.source" ) );
    
    updater.editPeriod();
  }
  
  private void doAddException(HttpServletRequest request)
  {
    ExceptionReasonHandler adder;

    adder = new ExceptionReasonHandler();
    adder.setException_title(request.getParameter( "exception_title"));
    adder.setSourceName(getServletContext().getInitParameter( "db.source" ));

    adder.addExceptionReason();
  }
  
  private void doEditException(HttpServletRequest request)
  {
    ExceptionReasonHandler updater;

    updater = new ExceptionReasonHandler();
    updater.setException_id( Integer.parseInt( request.getParameter( "exception_id")));
    updater.setException_title(request.getParameter( "exception_title"));
    updater.setSourceName(getServletContext().getInitParameter( "db.source" ));
    
    updater.editExceptionReason();
  }
}
