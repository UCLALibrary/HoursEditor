
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _exception__title__edit extends com.orionserver.http.OrionHttpJspPage {


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
    _exception__title__edit page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean theException;
      synchronized (pageContext) {
        if ((theException = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean) pageContext.getAttribute( "theException", PageContext.PAGE_SCOPE)) == null) {
          theException = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean();
          pageContext.setAttribute( "theException", theException, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[3]);
          {
            String[] __paramList = request.getParameterValues( "except_id");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              theException.setScheduleID(Integer.valueOf( __paramList[0]).intValue());
            }
          }
          out.write(__oracle_jsp_text[4]);
          theException.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("title");
        __jsp_taghandler_1.setValue("");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("start_date");
        __jsp_taghandler_2.setValue("");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setVar("end_date");
        __jsp_taghandler_3.setValue("");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${! theException.schedule.has_special_range}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[10]);
            edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean thePeriod;
            synchronized (pageContext) {
              if ((thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "thePeriod", PageContext.PAGE_SCOPE)) == null) {
                thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
                pageContext.setAttribute( "thePeriod", thePeriod, PageContext.PAGE_SCOPE);
                out.write(__oracle_jsp_text[11]);
                thePeriod.setPeriodId((java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theException.schedule.period_id}",java.lang.Integer.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[12]);
                thePeriod.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[13]);
                thePeriod.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[14]);
              }
            }
            out.write(__oracle_jsp_text[15]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_4);
              __jsp_taghandler_5.setVar("title");
              __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.period_title}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[16]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_4);
              __jsp_taghandler_6.setVar("start_date");
              __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.start_date}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            out.write(__oracle_jsp_text[17]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_4);
              __jsp_taghandler_7.setVar("end_date");
              __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.end_date}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
            }
            out.write(__oracle_jsp_text[18]);
          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[19]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theException.schedule.has_special_range}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[20]);
            edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean theSpecial;
            synchronized (pageContext) {
              if ((theSpecial = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean) pageContext.getAttribute( "theSpecial", PageContext.PAGE_SCOPE)) == null) {
                theSpecial = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean();
                pageContext.setAttribute( "theSpecial", theSpecial, PageContext.PAGE_SCOPE);
                out.write(__oracle_jsp_text[21]);
                theSpecial.setScheduleId(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theException.schedule.schedule_id}",java.lang.Integer.class, __ojsp_varRes,null)));
                out.write(__oracle_jsp_text[22]);
                theSpecial.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[23]);
              }
            }
            out.write(__oracle_jsp_text[24]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_9.setParent(__jsp_taghandler_8);
              __jsp_taghandler_9.setVar("start_date");
              __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theSpecial.exception.start_date}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
            }
            out.write(__oracle_jsp_text[25]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_8);
              __jsp_taghandler_10.setVar("end_date");
              __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theSpecial.exception.end_date}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
            }
            out.write(__oracle_jsp_text[26]);
            edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean theReason;
            synchronized (pageContext) {
              if ((theReason = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean) pageContext.getAttribute( "theReason", PageContext.PAGE_SCOPE)) == null) {
                theReason = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean();
                pageContext.setAttribute( "theReason", theReason, PageContext.PAGE_SCOPE);
                out.write(__oracle_jsp_text[27]);
                theReason.setExceptionID(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theSpecial.exception.exception_id}",java.lang.Integer.class, __ojsp_varRes,null)));
                out.write(__oracle_jsp_text[28]);
                theReason.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[29]);
              }
            }
            out.write(__oracle_jsp_text[30]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_8);
              __jsp_taghandler_11.setVar("title");
              __jsp_taghandler_11.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theReason.exception.exception_title}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
            }
            out.write(__oracle_jsp_text[31]);
          } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[32]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${title}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[33]);
      {
        org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern var");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${start_date}",java.util.Date.class, __ojsp_varRes,null));
        __jsp_taghandler_13.setPattern("MM/dd/yy");
        __jsp_taghandler_13.setVar("start_value");
        __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
        if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
      }
      out.write(__oracle_jsp_text[34]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${start_value}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[35]);
      {
        org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern var");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${end_date}",java.util.Date.class, __ojsp_varRes,null));
        __jsp_taghandler_15.setPattern("MM/dd/yy");
        __jsp_taghandler_15.setVar("end_value");
        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
      }
      out.write(__oracle_jsp_text[36]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_16.setParent(null);
        __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${end_value}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
      }
      out.write(__oracle_jsp_text[37]);


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
  private static final char __oracle_jsp_text[][]=new char[38][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "                   \n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n".toCharArray();
    __oracle_jsp_text[19] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[20] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[23] = 
    "                   \n  ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "                   \n  ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n".toCharArray();
    __oracle_jsp_text[32] = 
    "\n\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr align=\"left\">\n            <td colspan=\"2\">Exception Reason:&nbsp;".toCharArray();
    __oracle_jsp_text[33] = 
    "</td>\n          </tr>\n          <tr>\n            <td>Start Date:</td>\n            <td>\n              ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n              <input type=\"text\" name=\"start_date\" size=\"15\" value='".toCharArray();
    __oracle_jsp_text[35] = 
    "'>\n              <a href=\"##\" onClick=\"cal1.select(editHours.start_date,'anchor1','MM/dd/yy'); return false;\" title=\"cal1.select(editHours.start_date,'anchor1','MM/dd/yy'); return false;\" name=\"anchor1\" id=\"anchor1\">\n                <img src=\"images/show-calendar.gif\" width=24 height=22 border=0 alt=\"\">\n              </a>\n            </td>\n          </tr>\n          <tr>\n            <td>End Date:</td>\n            <td>\n              ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n              <input type=\"text\" name=\"end_date\" size=\"15\" value='".toCharArray();
    __oracle_jsp_text[37] = 
    "'>\n              <a href=\"##\" onClick=\"cal2.select(editHours.end_date,'anchor2','MM/dd/yy'); return false;\" title=\"cal2.select(editHours.end_date,'anchor2','MM/dd/yy'); return false;\" name=\"anchor2\" id=\"anchor2\">\n                <img src=\"images/show-calendar.gif\" width=24 height=22 border=0 alt=\"\">\n              </a>\n            </td>\n          </tr>\n        </table>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
