package edu.ucla.library.libservices.scheduler.web.servlets;

import edu.ucla.library.libservices.scheduler.beans.model.UnitCounter;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import java.io.PrintWriter;

public class UnitCountServlet
  extends HttpServlet
{
  private static final String CONTENT_TYPE = "text/html; charset=utf-8";

  public void init( ServletConfig config )
    throws ServletException
  {
    super.init(config);
  }

  /**Process the HTTP doPost request.
   */
  public void doPost( HttpServletRequest request, 
                      HttpServletResponse response )
    throws ServletException, IOException
  {
    HttpSession session;
    String forward;
    UnitCounter counter;

    response.setContentType(CONTENT_TYPE);
    //PrintWriter out = response.getWriter();
    session = request.getSession( true );
    counter = new UnitCounter();
    
    counter.setUnit_group_id( Integer.parseInt( request.getParameter("unit_group_id") ) );
    counter.setSourceName(getServletContext().getInitParameter("db.source"));

    if ( counter.getCount() > 1 )
    {
      forward = "SelectLibrary.jsp";
    }
    else
    {
      forward = "SelectPeriod.jsp";
      session.setAttribute("unit", counter.getUnit());
    }

    session.setAttribute( "group", request.getParameter("unit_group_id") );
    
    response.sendRedirect(forward);
  }
}
