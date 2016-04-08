package edu.ucla.library.libservices.scheduler.web.servlets;

import edu.ucla.library.libservices.scheduler.beans.model.LibraryPrepper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrepLibraryServlet
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
    HttpSession session;
    LibraryPrepper libprep;
    PrintWriter out;

    response.setContentType( CONTENT_TYPE );
    out = response.getWriter();
    session = request.getSession( false );
    libprep = new LibraryPrepper();

    if ( request.getParameter( "all_or_some" ).equalsIgnoreCase( "all" ) )
      libprep.setUnitsIn( request.getParameterValues( "unit_all" ) );
    else
      libprep.setUnitsIn( request.getParameterValues( "unit" ) );

    session.setAttribute( "unit", libprep.getUnitsOut() );

    response.sendRedirect( "SelectPeriod.jsp" );
  }
}
