package edu.ucla.library.libservices.scheduler.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrepSessionServlet
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
    
    if ( request.getParameter("from").equalsIgnoreCase("periods") )
    {
      session.setAttribute( "units", session.getAttribute( "unit" ) );
      session.setAttribute( "period", request.getParameter( "period" ) );

      response.sendRedirect( "OptionsMenu.jsp" );
    }
    else
    {
      session.setAttribute("unit_id", request.getParameter("unit"));
      session.setAttribute("period_id", request.getParameter("period"));
      session.setAttribute("holiday_id", request.getParameter("holiday"));
      session.setAttribute("exception_id", request.getParameter("exception"));
      
      response.sendRedirect( "AddExceptionHours.jsp" );
    }
  }
}
