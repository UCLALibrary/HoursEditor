
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _EditExcept extends com.orionserver.http.OrionHttpJspPage {


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
    _EditExcept page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean exceptions;
      synchronized (pageContext) {
        if ((exceptions = (edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean) pageContext.getAttribute( "exceptions", PageContext.PAGE_SCOPE)) == null) {
          exceptions = (edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean();
          pageContext.setAttribute( "exceptions", exceptions, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[3]);
          exceptions.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[4]);
        }
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptions.allExceptions}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setVar("theExcept");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theExcept.exception_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[7]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theExcept.exception_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[8]);
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty param.exception_id}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[10]);
            edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean edited;
            synchronized (pageContext) {
              if ((edited = (edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean) pageContext.getAttribute( "edited", PageContext.PAGE_SCOPE)) == null) {
                edited = (edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean();
                pageContext.setAttribute( "edited", edited, PageContext.PAGE_SCOPE);
                out.write(__oracle_jsp_text[11]);
                {
                  String[] __paramList = request.getParameterValues( "exception_id");
                  if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
                    edited.setExceptionID(Integer.valueOf( __paramList[0]).intValue());
                  }
                }
                out.write(__oracle_jsp_text[12]);
                edited.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[13]);
              }
            }
            out.write(__oracle_jsp_text[14]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.exception.exception_title}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[15]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.exception_id}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[16]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[17]);


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
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[18][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Edit Exception Reason</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"AdminMenu.jsp\" class=\"menu\">Admin Menu</a>\n        </td>\n      </tr>\n    </table>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\" bgcolor=\"#FFEE00\">\n        <td>Select an exception and press &quot;Edit&quot;</td>\n      </tr>\n    </table>\n    <form name=\"selectExcept\" action=\"EditExcept.jsp\" method=\"POST\">\n      <table>\n        <tr align=\"left\">\n          <td align=\"right\">\n            Exception Reason:\n          </td>\n          <td align=\"left\">\n            <select name=\"exception_id\">\n              ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n                <option value='".toCharArray();
    __oracle_jsp_text[7] = 
    "'>\n                  ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                </option>\n              ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n            </select>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td colspan=\"2\">\n            <input type=\"submit\" name=\"submit\" value=\"Edit\">\n            <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n            <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n          </td>\n        </tr>\n      </table>\n    </form>\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Enter the name for the exception reason</td>\n        </tr>\n      </table>\n      <form name=\"editExcept\" action=\"editexcept\" method=\"POST\"><!-- onsubmit=\"return validate(editExcept)\"-->\n        <table>\n          <tr align=\"left\">\n            <td align=\"right\">\n              Exception Title:\n            </td>\n            <td align=\"left\">\n              <input type=\"text\" name=\"exception_title\" size=\"40\" maxlength=\"255\" value='".toCharArray();
    __oracle_jsp_text[15] = 
    "'>\n            </td>\n          </tr>\n          <tr align=\"left\">\n            <td colspan=\"2\">\n              <input type=\"submit\" name=\"submit\" value=\"Update\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n            </td>\n          </tr>\n        </table>\n        <input type=\"hidden\" name=\"exception_id\" value='".toCharArray();
    __oracle_jsp_text[16] = 
    "'>\n        <input type=\"hidden\" name=\"type\" value=\"except\"/>\n        <input type=\"hidden\" name=\"method\" value=\"edit\"/>\n      </form>\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
