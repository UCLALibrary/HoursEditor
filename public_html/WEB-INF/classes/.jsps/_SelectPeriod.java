
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SelectPeriod extends com.orionserver.http.OrionHttpJspPage {


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
    _SelectPeriod page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      java.util.Date today;
      synchronized (pageContext) {
        if ((today = (java.util.Date) pageContext.getAttribute( "today", PageContext.PAGE_SCOPE)) == null) {
          today = (java.util.Date) new java.util.Date();
          pageContext.setAttribute( "today", today, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern var scope");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${today}",java.util.Date.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setPattern("MM/dd/yy");
        __jsp_taghandler_1.setVar("thisDate");
        __jsp_taghandler_1.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean units;
      synchronized (pageContext) {
        if ((units = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) pageContext.getAttribute( "units", PageContext.PAGE_SCOPE)) == null) {
          units = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean();
          pageContext.setAttribute( "units", units, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[6]);
          units.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[7]);
          units.setUnitIdList((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.unit}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[8]);
        }
      }
      out.write(__oracle_jsp_text[9]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean periods;
      synchronized (pageContext) {
        if ((periods = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "periods", PageContext.PAGE_SCOPE)) == null) {
          periods = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
          pageContext.setAttribute( "periods", periods, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[10]);
          periods.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[11]);
          periods.setTheDate((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thisDate}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[12]);
        }
      }
      out.write(__oracle_jsp_text[13]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${units.someUnits}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_2.setVar("theUnit");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[14]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[15]);
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
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${periods.allStandardPeriods}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_3.setVar("thePeriod");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[17]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[18]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[19]);
              {
                org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern");
                __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                __jsp_taghandler_4.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.start_date}",java.util.Date.class, __ojsp_varRes,null));
                __jsp_taghandler_4.setPattern("MMM d, yyyy");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern");
                __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                __jsp_taghandler_5.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.end_date}",java.util.Date.class, __ojsp_varRes,null));
                __jsp_taghandler_5.setPattern("MMM d, yyyy");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[21]);
            } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_3.doCatch(th);
        } finally {
          __jsp_taghandler_3.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[22]);


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
  private static final char __oracle_jsp_text[][]=new char[23][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n".toCharArray();
    __oracle_jsp_text[13] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Select Academic Period</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Select a period and click &quot;Continue&quot;</td>\n        </tr>\n      </table>\n      <form action=\"prepsession\" method=\"post\">\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr align=\"left\">\n            <td>UCLA Libraries: \n              ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "&#059;&nbsp;&nbsp;\n              ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n            </td>\n          </tr>\n          <tr align=\"left\"><td>Current and Future Academic Periods</td></tr>\n          <tr><td><hr size=\"1\"></td></tr>\n          ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n            <tr align=\"left\">\n              <td>\n                <input type=\"radio\" name=\"period\" value='".toCharArray();
    __oracle_jsp_text[18] = 
    "'>\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n                &nbsp;\n                (".toCharArray();
    __oracle_jsp_text[20] = 
    "\n                -\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    ")\n              </td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"left\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Continue\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n            </td>\n          </tr>\n        </table>\n        <input type=\"hidden\" name=\"from\" value='periods'>\n      </form>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
