
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SelectLibrary extends com.orionserver.http.OrionHttpJspPage {


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
    _SelectLibrary page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean theGroup;
      synchronized (pageContext) {
        if ((theGroup = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean) pageContext.getAttribute( "theGroup", PageContext.PAGE_SCOPE)) == null) {
          theGroup = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean();
          pageContext.setAttribute( "theGroup", theGroup, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[3]);
          theGroup.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[4]);
          theGroup.setUnitGroupId(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.group}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean units;
      synchronized (pageContext) {
        if ((units = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) pageContext.getAttribute( "units", PageContext.PAGE_SCOPE)) == null) {
          units = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean();
          pageContext.setAttribute( "units", units, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[7]);
          units.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[8]);
          units.setUnitGroupId(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.group}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[9]);
        }
      }
      out.write(__oracle_jsp_text[10]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theGroup.unitGroup.unit_group_title}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${units.unitsByGroup}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setVar("theUnit");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[12]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[13]);
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
      out.write(__oracle_jsp_text[14]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${units.unitsByGroup}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_2.setVar("theUnit");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[15]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[16]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[17]);
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[18]);


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
  private static final char __oracle_jsp_text[][]=new char[19][];
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
    "\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Select Library Unit</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n    <script language=\"JavaScript\" type=\"text/javascript\">\n      function switchRadio(formObj)\n      {\n        var checkCount = 0;\n        for ( i = 0; i < formObj.unit.length; i++)\n        {\n          if ( formObj.unit[ i ].checked )\n            checkCount++;\n        }\n        if ( checkCount == 0 )\n        {\n          for ( j = 0; j < formObj.all_or_some.length; j++ )\n          {\n            if ( formObj.all_or_some[ j ].value == 'all' )\n            {\n              formObj.all_or_some[ j ].checked = true;\n            }\n          }\n        }\n        else\n        {\n          for ( k = 0; k < formObj.all_or_some.length; k++ )\n          {\n            if ( formObj.all_or_some[ k ].value == 'some' )\n            {\n              formObj.all_or_some[ k ].checked = true;\n            }\n          }\n        }\n      }\n  \n      function switchChecks(formObj)\n      {\n        for ( i = 0; i < formObj.unit.length; i++)\n        {\n          formObj.unit[ i ].checked = false;\n        }\n      }\n    </script>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Select &quot;All Units&quot; to assign the same hours\n          to all library units; or &quot;Individual Units&quot; to\n          assign hours to particular unit(s) (check the units to assign\n          hours); and then click &quot;Continue&quot;</td>\n        </tr>\n      </table>\n      <form name=\"selectUnit\" action=\"preplibrary\" method=\"post\">\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr align=\"left\">\n            <td>\n              UCLA Libraries: \n              ".toCharArray();
    __oracle_jsp_text[11] = 
    " Units\n            </td>\n          </tr>\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"left\">\n            <td>\n              <input type=\"radio\" name=\"all_or_some\" value=\"all\" checked onClick=\"switchChecks(selectUnit)\">All Units\n              ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                <input type=\"hidden\" name=\"unit_all\" value='".toCharArray();
    __oracle_jsp_text[13] = 
    "'>\n              ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n            </td>\n          </tr>\n          <tr align=\"left\"><td><b><i>OR</i></b></td></tr>\n          <tr align=\"left\">\n            <td>\n              <input type=\"radio\" name=\"all_or_some\" value=\"some\">Individual Units\n            </td>\n          </tr>\n          ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n            <tr align=\"left\">\n              <td>\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <input type=\"checkbox\" name=\"unit\" value='".toCharArray();
    __oracle_jsp_text[16] = 
    "' onClick=\"switchRadio(selectUnit)\">\n                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n              </td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"left\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Continue\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n            </td>\n          </tr>\n        </table>\n      </form>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
