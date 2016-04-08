
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _AddExceptionHours extends com.orionserver.http.OrionHttpJspPage {


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
    _AddExceptionHours page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      edu.ucla.library.libservices.scheduler.beans.utility.ScheduleExceptionUtility exceptUtil;
      synchronized (pageContext) {
        if ((exceptUtil = (edu.ucla.library.libservices.scheduler.beans.utility.ScheduleExceptionUtility) pageContext.getAttribute( "exceptUtil", PageContext.PAGE_SCOPE)) == null) {
          exceptUtil = (edu.ucla.library.libservices.scheduler.beans.utility.ScheduleExceptionUtility) new edu.ucla.library.libservices.scheduler.beans.utility.ScheduleExceptionUtility();
          pageContext.setAttribute( "exceptUtil", exceptUtil, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[2]);
          exceptUtil.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[3]);
          exceptUtil.setException(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.exception_id}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[4]);
          exceptUtil.setHoliday(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.holiday_id}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[5]);
          exceptUtil.setPeriod(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period_id}",java.lang.Integer.class, __ojsp_varRes,null)));
          out.write(__oracle_jsp_text[6]);
        }
      }
      out.write(__oracle_jsp_text[7]);
      edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm addException;
      synchronized (request) {
        if ((addException = (edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm) pageContext.getAttribute( "addException", PageContext.REQUEST_SCOPE)) == null) {
          addException = (edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm) new edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm();
          pageContext.setAttribute( "addException", addException, PageContext.REQUEST_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[8]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.unit_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[9]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.type eq 'except'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[11]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setUrl("header.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[13]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setName("unit");
                  __jsp_taghandler_3.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.unit_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
                }
                out.write(__oracle_jsp_text[14]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_4.setName("period");
                  __jsp_taghandler_4.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
                }
                out.write(__oracle_jsp_text[15]);
              } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
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
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.exceptTitle}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[17]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.exceptTitle}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[18]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.type eq 'holiday'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[19]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.exceptStart}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[20]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.exceptStart}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[21]);
          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[22]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.type eq 'except'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[23]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.start_date}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[24]);
          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[25]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.type eq 'holiday'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[26]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.exceptEnd}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[27]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.exceptEnd}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[28]);
          } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[29]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.type eq 'except'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[30]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.end_date}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[31]);
          } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[32]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[33]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_10.setName("isException");
                  __jsp_taghandler_10.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
                }
                out.write(__oracle_jsp_text[34]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_11.setName("dayValue");
                  __jsp_taghandler_11.setValue("monday");
                  __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                  if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
                }
                out.write(__oracle_jsp_text[35]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_12.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_12.setName("day");
                  __jsp_taghandler_12.setValue("Mon-Thurs");
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
                }
                out.write(__oracle_jsp_text[36]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_13.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_13.setName("prefix");
                  __jsp_taghandler_13.setValue("MT");
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
                }
                out.write(__oracle_jsp_text[37]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_14.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_14.setName("selected");
                  __jsp_taghandler_14.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.monday}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
                }
                out.write(__oracle_jsp_text[38]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_15.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_15.setName("opens");
                  __jsp_taghandler_15.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.MT_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
                }
                out.write(__oracle_jsp_text[39]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_16.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_16.setName("closes");
                  __jsp_taghandler_16.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.MT_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
                }
                out.write(__oracle_jsp_text[40]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_17.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_17.setName("isClosed");
                  __jsp_taghandler_17.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.MT_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
                }
                out.write(__oracle_jsp_text[41]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_18.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_18.setName("note");
                  __jsp_taghandler_18.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.MT_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
                }
                out.write(__oracle_jsp_text[42]);
              } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_9.doCatch(th);
        } finally {
          __jsp_taghandler_9.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[43]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_19.setParent(null);
        __jsp_taghandler_19.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[44]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_20.setName("isException");
                  __jsp_taghandler_20.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
                }
                out.write(__oracle_jsp_text[45]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_21.setName("dayValue");
                  __jsp_taghandler_21.setValue("friday");
                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
                }
                out.write(__oracle_jsp_text[46]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_22.setName("day");
                  __jsp_taghandler_22.setValue("Fri");
                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
                }
                out.write(__oracle_jsp_text[47]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_23.setName("prefix");
                  __jsp_taghandler_23.setValue("FR");
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
                }
                out.write(__oracle_jsp_text[48]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_24.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_24.setName("selected");
                  __jsp_taghandler_24.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.friday}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
                }
                out.write(__oracle_jsp_text[49]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_25.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_25.setName("opens");
                  __jsp_taghandler_25.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.FR_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
                }
                out.write(__oracle_jsp_text[50]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_26.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_26.setName("closes");
                  __jsp_taghandler_26.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.FR_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                  if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
                }
                out.write(__oracle_jsp_text[51]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_27.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_27.setName("isClosed");
                  __jsp_taghandler_27.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.FR_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
                }
                out.write(__oracle_jsp_text[52]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_28.setParent(__jsp_taghandler_19);
                  __jsp_taghandler_28.setName("note");
                  __jsp_taghandler_28.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.FR_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
                }
                out.write(__oracle_jsp_text[53]);
              } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_19.doCatch(th);
        } finally {
          __jsp_taghandler_19.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
      }
      out.write(__oracle_jsp_text[54]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_29.setParent(null);
        __jsp_taghandler_29.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[55]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_30.setName("isException");
                  __jsp_taghandler_30.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
                }
                out.write(__oracle_jsp_text[56]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_31.setName("dayValue");
                  __jsp_taghandler_31.setValue("saturday");
                  __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                  if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
                }
                out.write(__oracle_jsp_text[57]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_32.setName("day");
                  __jsp_taghandler_32.setValue("Sat");
                  __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                  if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
                }
                out.write(__oracle_jsp_text[58]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_33.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_33.setName("prefix");
                  __jsp_taghandler_33.setValue("SA");
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
                }
                out.write(__oracle_jsp_text[59]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_34.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_34.setName("selected");
                  __jsp_taghandler_34.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.saturday}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
                }
                out.write(__oracle_jsp_text[60]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_35.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_35.setName("opens");
                  __jsp_taghandler_35.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SA_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                  if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,2);
                }
                out.write(__oracle_jsp_text[61]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_36.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_36.setName("closes");
                  __jsp_taghandler_36.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SA_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                  if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
                }
                out.write(__oracle_jsp_text[62]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_37.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_37.setName("isClosed");
                  __jsp_taghandler_37.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SA_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                  if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,2);
                }
                out.write(__oracle_jsp_text[63]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_38.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_38.setName("note");
                  __jsp_taghandler_38.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SA_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
                }
                out.write(__oracle_jsp_text[64]);
              } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_29.doCatch(th);
        } finally {
          __jsp_taghandler_29.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,1);
      }
      out.write(__oracle_jsp_text[65]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_39.setParent(null);
        __jsp_taghandler_39.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[66]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_40.setName("isException");
                  __jsp_taghandler_40.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                  if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
                }
                out.write(__oracle_jsp_text[67]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_41.setName("dayValue");
                  __jsp_taghandler_41.setValue("sunday");
                  __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                  if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,2);
                }
                out.write(__oracle_jsp_text[68]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_42.setName("day");
                  __jsp_taghandler_42.setValue("Sun");
                  __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                  if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,2);
                }
                out.write(__oracle_jsp_text[69]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_43.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_43.setName("prefix");
                  __jsp_taghandler_43.setValue("SU");
                  __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                  if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
                }
                out.write(__oracle_jsp_text[70]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_44.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_44.setName("selected");
                  __jsp_taghandler_44.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.sunday}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                  if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,2);
                }
                out.write(__oracle_jsp_text[71]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_45.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_45.setName("opens");
                  __jsp_taghandler_45.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SU_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                  if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
                }
                out.write(__oracle_jsp_text[72]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_46.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_46.setName("closes");
                  __jsp_taghandler_46.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SU_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                  if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,2);
                }
                out.write(__oracle_jsp_text[73]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_47.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_47.setName("isClosed");
                  __jsp_taghandler_47.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SU_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                  if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,2);
                }
                out.write(__oracle_jsp_text[74]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_48.setParent(__jsp_taghandler_39);
                  __jsp_taghandler_48.setName("note");
                  __jsp_taghandler_48.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.SU_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                  if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
                }
                out.write(__oracle_jsp_text[75]);
              } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_39.doCatch(th);
        } finally {
          __jsp_taghandler_39.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,1);
      }
      out.write(__oracle_jsp_text[76]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addException.reason}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[77]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.unit_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[78]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.period_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[79]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.type}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[80]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.except_period}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[81]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptUtil.except_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[82]);


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
  private static final char __oracle_jsp_text[][]=new char[83][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Add Exception Hours</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n    <script language=\"JavaScript\" src=\"js/CalendarPopup.js\"\n            type=\"text/javascript\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\">\n      var cal1 = new CalendarPopup();\n      cal1.showYearNavigation();\n      var cal2 = new CalendarPopup();\n      cal2.showYearNavigation();\n    </script>\n  </head>\n  <body><table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"SelectLibrary.jsp\" class=\"menu\">Select New Library Unit</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"SelectPeriod.jsp\" class=\"menu\">Select New Period</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href='EditException.jsp?unit=".toCharArray();
    __oracle_jsp_text[9] = 
    "&period=".toCharArray();
    __oracle_jsp_text[10] = 
    "'>\n            Edit Exceptions\n          </a>\n        </td>\n      </tr>\n    </table><table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\" bgcolor=\"#FFEE00\">\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n            Enter the start and end dates of the exception period.\n          ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n          Select the operating hours for the library unit during this exception.\n          Click the &quot;Day Affected?&quot; button for each day (or day range)\n          covered by the exception.\n        </td>\n      </tr>\n    </table>\n    <form name=\"selectRange\" action=\"prepexception\" method=\"post\">\n      ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td colspan=\"2\">\n            Exception Reason:&nbsp;".toCharArray();
    __oracle_jsp_text[17] = 
    "\n            <input type=\"hidden\" name=\"title\" value='".toCharArray();
    __oracle_jsp_text[18] = 
    "'>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>Start Date:</td>\n          ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            <td align=\"left\">\n              ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n              <input type=\"hidden\" name=\"start_date\" value='".toCharArray();
    __oracle_jsp_text[21] = 
    "'>\n            </td>\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            <td>\n              <input type=\"text\" name=\"start_date\" size=\"15\" value='".toCharArray();
    __oracle_jsp_text[24] = 
    "'>\n              <a href=\"#\" onClick=\"cal1.select(selectRange.start_date,'anchor1','MM/dd/yy'); return false;\" title=\"cal1.select(selectRange.start_date,'anchor1','MM/dd/yy'); return false;\" name=\"anchor1\" id=\"anchor1\">\n                <img src=\"images/show-calendar.gif\" width=24 height=22 border=0 alt=\"\">\n              </a>\n            </td>\n          ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n        </tr>\n        <tr align=\"left\">\n          <td>End Date:</td>\n          ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            <td align=\"left\">\n              ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n              <input type=\"hidden\" name=\"end_date\" value='".toCharArray();
    __oracle_jsp_text[28] = 
    "'>\n            </td>\n          ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n            <td align=\"left\">\n              <input type=\"text\" name=\"end_date\" size=\"15\" value='".toCharArray();
    __oracle_jsp_text[31] = 
    "'>\n              <a href=\"#\" onClick=\"cal2.select(selectRange.end_date,'anchor2','MM/dd/yy'); return false;\" title=\"cal2.select(selectRange.end_date,'anchor2','MM/dd/yy'); return false;\" name=\"anchor2\" id=\"anchor2\">\n                <img src=\"images/show-calendar.gif\" width=24 height=22 border=0 alt=\"\">\n              </a>\n            </td>\n          ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr>\n          <th>Day Affected?</th>\n          <th>Day(s) Of Week</th>\n          <th>Library Opens</th>\n          <th>Library Closes</th>\n          <th>Library is Closed</th>\n          <th>Comments</th>\n        </tr>\n\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n\n        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[48] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[49] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[50] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[51] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[52] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[54] = 
    "\n\n        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[56] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[57] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[58] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[59] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[60] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[61] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[62] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[63] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[64] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[65] = 
    "\n\n        ".toCharArray();
    __oracle_jsp_text[66] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[67] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[68] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[69] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[70] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[71] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[72] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[73] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[74] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[75] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[76] = 
    "\n\n        <tr>\n          <td align=\"right\" colspan=\"3\">Please provide an explanation for the exception:</td>\n          <td colspan=\"3\" align=\"left\">\n            <input name=\"reason\" type=\"text\" size=\"30\" maxlength=\"50\" value='".toCharArray();
    __oracle_jsp_text[77] = 
    "'>\n          </td>\n        </tr>\n      </table>\n      <input type=\"hidden\" name=\"unit\" value='".toCharArray();
    __oracle_jsp_text[78] = 
    "'>\n      <input type=\"hidden\" name=\"period\" value='".toCharArray();
    __oracle_jsp_text[79] = 
    "'>\n      <input type=\"hidden\" name=\"type\" value='".toCharArray();
    __oracle_jsp_text[80] = 
    "'>\n      <input type=\"hidden\" name=\"except_period\" value='".toCharArray();
    __oracle_jsp_text[81] = 
    "'>\n      <input type=\"hidden\" name=\"except_id\" value='".toCharArray();
    __oracle_jsp_text[82] = 
    "'>\n      <input type=\"hidden\" name=\"addedit\" value='add'>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr><td><hr size=\"1\"></td></tr>\n        <tr align=\"center\">\n          <td>\n            <input type=\"submit\" name=\"submit\" value=\"Continue\">\n            <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n            <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n          </td>\n        </tr>\n      </table>\n    </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
