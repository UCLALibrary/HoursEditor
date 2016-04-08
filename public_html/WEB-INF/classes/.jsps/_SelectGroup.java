
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SelectGroup extends com.orionserver.http.OrionHttpJspPage {


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
    _SelectGroup page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean unitGroups;
      synchronized (pageContext) {
        if ((unitGroups = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean) pageContext.getAttribute( "unitGroups", PageContext.PAGE_SCOPE)) == null) {
          unitGroups = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean();
          pageContext.setAttribute( "unitGroups", unitGroups, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[3]);
      unitGroups.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unitGroups.allUnits}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setVar("theGroup");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theGroup.unit_group_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[7]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theGroup.unit_group_title}",java.lang.String.class, __ojsp_varRes, null));
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
  private static final char __oracle_jsp_text[][]=new char[10][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Select Library Group</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n    </table>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\" bgcolor=\"#FFEE00\">\n        <td>Select a library and click &quot;Continue&quot;</td>\n      </tr>\n    </table>\n    <form action=\"unitcount\" method=\"post\">\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\"><td>UCLA Libraries</td></tr>\n        <tr><td><hr size=\"1\"></td></tr>\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n          <tr align=\"left\">\n            <td>\n              <input type=\"radio\" name=\"unit_group_id\" value='".toCharArray();
    __oracle_jsp_text[7] = 
    "'>\n              ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n            </td>\n          </tr>\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n        <tr><td><hr size=\"1\"></td></tr>\n        <tr align=\"left\">\n          <td>\n            <input type=\"submit\" name=\"submit\" value=\"Continue\">\n            <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n            <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n          </td>\n        </tr>\n      </table>\n    </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
