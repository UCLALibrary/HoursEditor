
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _AddExcept extends com.orionserver.http.OrionHttpJspPage {


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
    _AddExcept page = this;
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
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Add Exception Reason</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n    <script type=\"text/javascript\">\n      function trimText(formObj) \n      { \n        /* \n        Rajender Singh \n        29-12-2003 \n        \n        This function trims all the text field on the form object \n        */ \n        for (var i = 0; i < formObj.elements.length; i++)  \n        { \n          if(formObj.elements[i].type == \"text\" || formObj.elements[i].type == \"textarea\") \n          { \n            var textvalue =formObj.elements[i].value ; \n            formObj.elements[i].value = textvalue.replace(/^(\\s+)/,\"\").replace(/(\\s+)$/,\"\");\t \n          } \n        } \n      }\n      \n      function validate(formObj)\n      {\n        trimText(formObj);\n        if ( formObj.title.value == '' )\n        {\n          alert(\"Please enter a name for the exception\");\n        }\n      }\n    </script>\n  </head>\n  <body>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"AdminMenu.jsp\" class=\"menu\">Admin Menu</a>\n        </td>\n      </tr>\n    </table>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\" bgcolor=\"#FFEE00\">\n        <td>Enter the name for a new exception reason</td>\n      </tr>\n    </table>\n    <form name=\"addExcept\" action=\"addexcept\" method=\"POST\" onsubmit=\"return validate(addExcept)\">\n      <table>\n        <tr align=\"left\">\n          <td align=\"right\">\n            Exception Title:\n          </td>\n          <td align=\"left\">\n            <input type=\"text\" name=\"exception_title\" size=\"40\" maxlength=\"255\" value=\"\">\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td colspan=\"2\">\n            <input type=\"submit\" name=\"submit\" value=\"Enter\">\n            <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n            <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n          </td>\n        </tr>\n      </table>\n      <input type=\"hidden\" name=\"type\" value=\"except\"/>\n      <input type=\"hidden\" name=\"method\" value=\"add\"/>\n    </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
