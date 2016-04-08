
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _OptionsMenu extends com.orionserver.http.OrionHttpJspPage {


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
    _OptionsMenu page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean units;
      synchronized (pageContext) {
        if ((units = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) pageContext.getAttribute( "units", PageContext.PAGE_SCOPE)) == null) {
          units = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean();
          pageContext.setAttribute( "units", units, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[4]);
          units.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[5]);
          units.setUnitIdList((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.unit}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[6]);
        }
      }
      out.write(__oracle_jsp_text[7]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean thePeriod;
      synchronized (pageContext) {
        if ((thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "thePeriod", PageContext.PAGE_SCOPE)) == null) {
          thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
          pageContext.setAttribute( "thePeriod", thePeriod, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[8]);
          thePeriod.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[9]);
          thePeriod.setPeriodId((java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.Integer.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[10]);
        }
      }
      out.write(__oracle_jsp_text[11]);
      edu.ucla.library.libservices.scheduler.beans.utility.UnitScheduleUtility unitSchedule;
      synchronized (pageContext) {
        if ((unitSchedule = (edu.ucla.library.libservices.scheduler.beans.utility.UnitScheduleUtility) pageContext.getAttribute( "unitSchedule", PageContext.PAGE_SCOPE)) == null) {
          unitSchedule = (edu.ucla.library.libservices.scheduler.beans.utility.UnitScheduleUtility) new edu.ucla.library.libservices.scheduler.beans.utility.UnitScheduleUtility();
          pageContext.setAttribute( "unitSchedule", unitSchedule, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[12]);
      unitSchedule.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
      out.write(__oracle_jsp_text[13]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.period_title}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[14]);
      {
        org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.start_date}",java.util.Date.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setPattern("MMM d, yyyy");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[15]);
      {
        org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.end_date}",java.util.Date.class, __ojsp_varRes,null));
        __jsp_taghandler_2.setPattern("MMM d, yyyy");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${units.someUnits}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_3.setVar("theUnit");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[17]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
                __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                __jsp_taghandler_4.setVar("unitID");
                __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_4.setScope("page");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[18]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[19]);
              unitSchedule.setEndDate((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.end_date}",java.lang.String.class, __ojsp_varRes,null));
              out.write(__oracle_jsp_text[20]);
              unitSchedule.setPeriodID(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.Integer.class, __ojsp_varRes,null)));
              out.write(__oracle_jsp_text[21]);
              unitSchedule.setStartDate((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.start_date}",java.lang.String.class, __ojsp_varRes,null));
              out.write(__oracle_jsp_text[22]);
              unitSchedule.setUnitID(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unitID}",java.lang.Integer.class, __ojsp_varRes,null)));
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not unitSchedule.hasStandard}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[25]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[26]);
                  } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unitSchedule.hasStandard}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[28]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[29]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[30]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unitSchedule.scheduleID}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[31]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[32]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[33]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unitSchedule.scheduleID}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[34]);
                  } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[35]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[36]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[37]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_7.setParent(__jsp_taghandler_3);
                __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unitSchedule.hasException}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[38]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[39]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[40]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit_id}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[41]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[42]);
                  } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[43]);
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
      out.write(__oracle_jsp_text[44]);


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
  private static final char __oracle_jsp_text[][]=new char[45][];
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
    "\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[12] = 
    "\n".toCharArray();
    __oracle_jsp_text[13] = 
    "                   \n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Options</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectLibrary.jsp\" class=\"menu\">Select New Library Unit</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectPeriod.jsp\" class=\"menu\">Select New Period</a>\n          </td>\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Click a link to set or update the standard or\n          exception hours for the listed library/period.</td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            Academic Period:\n            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n            &nbsp;\n            (".toCharArray();
    __oracle_jsp_text[15] = 
    "\n            -\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    ")\n          </td>\n        </tr>\n        <tr><td><hr size=\"1\"></td></tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n          <tr align=\"left\">\n            <td>\n              UCLA Libraries:&nbsp;".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            </td>\n          </tr>\n\n          ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n     \n          ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n            <tr align=\"left\">\n              <td>\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <a href='AddStandard.jsp?unit=".toCharArray();
    __oracle_jsp_text[25] = 
    "&period=".toCharArray();
    __oracle_jsp_text[26] = 
    "'>Add standard hours</a>\n              </td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n            <tr align=\"left\">\n              <td>\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <a href='EditStandard.jsp?unit=".toCharArray();
    __oracle_jsp_text[29] = 
    "&period=".toCharArray();
    __oracle_jsp_text[30] = 
    "&schedule=".toCharArray();
    __oracle_jsp_text[31] = 
    "'>Edit standard hours</a>\n              </td>\n            </tr>\n            <tr align=\"left\">\n              <td>\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <a href='DeleteStandard.jsp?unit=".toCharArray();
    __oracle_jsp_text[32] = 
    "&period=".toCharArray();
    __oracle_jsp_text[33] = 
    "&schedule=".toCharArray();
    __oracle_jsp_text[34] = 
    "'>Delete standard hours</a>\n              </td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n\n          <tr align=\"left\">\n            <td>\n              <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <a href='AddException.jsp?unit=".toCharArray();
    __oracle_jsp_text[36] = 
    "&period=".toCharArray();
    __oracle_jsp_text[37] = 
    "'>Add exception hours</a>\n            </td>\n          </tr>\n\n          ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n            <tr align=\"left\">\n              <td>\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <a href='EditException.jsp?unit=".toCharArray();
    __oracle_jsp_text[39] = 
    "&period=".toCharArray();
    __oracle_jsp_text[40] = 
    "'>Edit exception hours</a>\n              </td>\n            </tr>\n            <tr align=\"left\">\n              <td>\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <a href='DeleteException.jsp?unit=".toCharArray();
    __oracle_jsp_text[41] = 
    "&period=".toCharArray();
    __oracle_jsp_text[42] = 
    "'>Delete exception hours</a>\n              </td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n\n        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n      </table>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
