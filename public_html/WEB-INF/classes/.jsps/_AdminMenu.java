
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _AdminMenu extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=utf-8");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, "/errors.jsp", true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _AdminMenu page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);


    }
    catch( Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch( Exception clearException) {
        }
        pageContext.handlePageException( e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,false);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[2][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Administration Menu</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n      .title {\n        font-family: Verdana, Arial, Helvetica, sans-serif;\n        font-weight: bold;\n        font-style: oblique;\n        font-size: medium;\n      }\n      .section {\n        background-color: #FFEE00;\n        font-family: Verdana, Arial, Helvetica, sans-serif;\n        font-weight: bold;\n        font-size: small;\n      }\n      .link {\n        font-family: Verdana, Arial, Helvetica, sans-serif;\n        font-weight: bold;\n        font-size: x-small;\n      }\n    </style>\n  </head>\n  <body>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n    </table>\n    <table width=\"98%\">\n      <tr>\n        <td class=\"title\">\n          Library Schedule Administration\n        </td>\n      </tr>\n      <!--tr>\n        <td class=\"section\">\n          ADD/EDIT GROUPS:\n        </td>\n      </tr>\n      <tr>\n        <td>\n          <a href=\"AddGroup.jsp\" class=\"link\">ADD LIBRARY GROUP</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"3\" height=\"1\" width=\"1\" border=\"0\" alt=\"\"><br>\n          <a href=\"EditGroup.jsp\" class=\"link\">EDIT LIBRARY GROUP</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"10\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n        </td>\n      </tr>\n      <tr>\n        <td class=\"section\">\n          ADD/EDIT UNITS:\n        </td>\n      </tr>\n      <tr>\n        <td>\n          <a href=\"AddLibrary.jsp\" class=\"link\">ADD LIBRARY UNIT</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"3\" height=\"1\" width=\"1\" border=\"0\" alt=\"\"><br>\n          <a href=\"EditLibrary.jsp\" class=\"link\">EDIT LIBRARY UNIT</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"10\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n        </td>\n      </tr-->\n      <tr>\n        <td class=\"section\">\n          ADD/EDIT PERIODS:\n        </td>\n      </tr>\n      <tr>\n        <td>\n          <a href=\"AddPeriod.jsp\" class=\"link\">ADD PERIOD/HOLIDAY</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"3\" height=\"1\" width=\"1\" border=\"0\" alt=\"\"><br>\n          <a href=\"EditPeriod.jsp\" class=\"link\">EDIT PERIOD/HOLIDAY</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"10\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n        </td>\n      </tr>\n      <tr>\n        <td class=\"section\">\n          ADD/EDIT EXCEPTIONS:\n        </td>\n      </tr>\n      <tr>\n        <td>\n          <a href=\"AddExcept.jsp\" class=\"link\">ADD EXCEPTION</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"3\" height=\"1\" width=\"1\" border=\"0\" alt=\"\"><br>\n          <a href=\"EditExcept.jsp\" class=\"link\">EDIT EXCEPTION</a><br>\n          <img src=\"images/1pix.gif\" vspace=\"10\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n        </td>\n      </tr>\n    </table>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
