
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _AddException extends com.orionserver.http.OrionHttpJspPage {


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
    _AddException page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[2]);
            {
              org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty param.unit}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[3]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                    __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_3.setVar("unit_id");
                    __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.unit}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                    if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                  }
                  out.write(__oracle_jsp_text[4]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_4.setVar("period_id");
                    __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_taghandler_4.setScope("page");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                  }
                  out.write(__oracle_jsp_text[5]);
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[6]);
            {
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[7]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_6.setVar("unit_id");
                    __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.except_unit}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                  }
                  out.write(__oracle_jsp_text[8]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_7.setVar("period_id");
                    __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_taghandler_7.setScope("page");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                  }
                  out.write(__oracle_jsp_text[9]);
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[10]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[11]);
      edu.ucla.library.libservices.scheduler.beans.utility.HolidayUtility holidays;
      synchronized (pageContext) {
        if ((holidays = (edu.ucla.library.libservices.scheduler.beans.utility.HolidayUtility) pageContext.getAttribute( "holidays", PageContext.PAGE_SCOPE)) == null) {
          holidays = (edu.ucla.library.libservices.scheduler.beans.utility.HolidayUtility) new edu.ucla.library.libservices.scheduler.beans.utility.HolidayUtility();
          pageContext.setAttribute( "holidays", holidays, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[12]);
          holidays.setUnitID(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unit_id}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[13]);
          holidays.setPeriodID(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${period_id}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[14]);
          holidays.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[15]);
        }
      }
      out.write(__oracle_jsp_text[16]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean exceptions;
      synchronized (pageContext) {
        if ((exceptions = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean) pageContext.getAttribute( "exceptions", PageContext.PAGE_SCOPE)) == null) {
          exceptions = (edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean();
          pageContext.setAttribute( "exceptions", exceptions, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[17]);
          exceptions.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[18]);
        }
      }
      out.write(__oracle_jsp_text[19]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unit_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[20]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${period_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[21]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setUrl("header.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[22]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                  __jsp_taghandler_9.setName("unit");
                  __jsp_taghandler_9.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unit_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
                }
                out.write(__oracle_jsp_text[23]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                  __jsp_taghandler_10.setName("period");
                  __jsp_taghandler_10.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${period_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
                }
                out.write(__oracle_jsp_text[24]);
              } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_8.doCatch(th);
        } finally {
          __jsp_taghandler_8.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[25]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty holidays.openHolidays}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[26]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unit_id}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[27]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${period_id}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[28]);
          } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[29]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty holidays.openHolidays}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[30]);
            {
              org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
              __jsp_taghandler_13.setParent(__jsp_taghandler_12);
              __jsp_taghandler_13.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${holidays.openHolidays}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_taghandler_13.setVar("theHoliday");
              try {
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[31]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHoliday.period_id}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[32]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHoliday.period_title}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[33]);
                  } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_13.doCatch(th);
              } finally {
                __jsp_taghandler_13.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
            }
            out.write(__oracle_jsp_text[34]);
          } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[35]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptions.allExceptions}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_14.setVar("theException");
        try {
          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[36]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theException.exception_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[37]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theException.exception_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[38]);
            } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_14.doCatch(th);
        } finally {
          __jsp_taghandler_14.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[39]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${unit_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[40]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${period_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[41]);


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
  private static final char __oracle_jsp_text[][]=new char[42][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[12] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n".toCharArray();
    __oracle_jsp_text[16] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[17] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n".toCharArray();
    __oracle_jsp_text[19] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Add Exception Hours</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectLibrary.jsp\" class=\"menu\">Select New Library Unit</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectPeriod.jsp\" class=\"menu\">Select New Period</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href='EditException.jsp?unit=".toCharArray();
    __oracle_jsp_text[20] = 
    "&period=".toCharArray();
    __oracle_jsp_text[21] = 
    "'>Edit Exceptions</a> \n          </td>\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Select the reason (holiday <b><i>or</i></b> other) for \n          the schedule exception.</td>\n        </tr>\n      </table>\n      <form action=\"prepsession\" method=\"post\">\n        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            <tr align=\"left\">\n              <td>\n                Holidays:\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                All holidays in this period have been assigned for this unit.<br>\n                <img src=\"images/1pix.gif\" hspace=\"42\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                Please click \n                <a href='EditException.jsp?unit=".toCharArray();
    __oracle_jsp_text[27] = 
    "&period=".toCharArray();
    __oracle_jsp_text[28] = 
    "'>here</a> \n                to review/edit the holiday hours.\n                <input type=\"hidden\" name=\"holiday\" value=\"-1\">\n              </td>\n            </tr>\n            <tr>\n              <td align=\"left\"><b><i>OR</i></b></td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n            <tr align=\"left\">\n              <td>\n                Holidays:\n                <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n                <select name=\"holiday\">\n                  <option value=\"-1\"></option>\n                  ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n                    <option value='".toCharArray();
    __oracle_jsp_text[32] = 
    "'>\n                      ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n                    </option>\n                  ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n                </select>\n              </td>\n            </tr>\n            <tr>\n              <td align=\"left\"><b><i>OR</i></b></td>\n            </tr>\n          ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n          <tr align=\"left\">\n            <td>\n              Other Exception Reason:\n              <img src=\"images/1pix.gif\" hspace=\"15\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <select name=\"exception\">\n                <option value=\"-2\"></option>\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n                  <option value='".toCharArray();
    __oracle_jsp_text[37] = 
    "'>\n                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n                  </option>\n                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n                <option value=\"-1\">Other</option>\n              </select>\n            </td>\n          </tr>\n        </table>\n        <input type=\"hidden\" name=\"unit\" value='".toCharArray();
    __oracle_jsp_text[40] = 
    "'>\n        <input type=\"hidden\" name=\"period\" value='".toCharArray();
    __oracle_jsp_text[41] = 
    "'>\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"center\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Continue\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n            </td>\n          </tr>\n        </table>\n        <input type=\"hidden\" name=\"from\" value='excepts'>\n      </form>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
