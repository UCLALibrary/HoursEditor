
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _AddStandard extends com.orionserver.http.OrionHttpJspPage {


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
    _AddStandard page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean theUnit;
      synchronized (pageContext) {
        if ((theUnit = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) pageContext.getAttribute( "theUnit", PageContext.PAGE_SCOPE)) == null) {
          theUnit = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean();
          pageContext.setAttribute( "theUnit", theUnit, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[3]);
          theUnit.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[4]);
          {
            String[] __paramList = request.getParameterValues( "unit");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              theUnit.setUnitId(Integer.valueOf( __paramList[0]).intValue());
            }
          }
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean thePeriod;
      synchronized (pageContext) {
        if ((thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "thePeriod", PageContext.PAGE_SCOPE)) == null) {
          thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
          pageContext.setAttribute( "thePeriod", thePeriod, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[7]);
          thePeriod.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[8]);
          {
            String[] __paramList = request.getParameterValues( "period");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              thePeriod.setPeriodId(Integer.valueOf( __paramList[0]));
            }
          }
          out.write(__oracle_jsp_text[9]);
        }
      }
      out.write(__oracle_jsp_text[10]);
      edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm addStandard;
      synchronized (request) {
        if ((addStandard = (edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm) pageContext.getAttribute( "addStandard", PageContext.REQUEST_SCOPE)) == null) {
          addStandard = (edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm) new edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm();
          pageContext.setAttribute( "addStandard", addStandard, PageContext.REQUEST_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setUrl("header.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[12]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                  __jsp_taghandler_2.setName("unit");
                  __jsp_taghandler_2.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.unit}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
                }
                out.write(__oracle_jsp_text[13]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                  __jsp_taghandler_3.setName("period");
                  __jsp_taghandler_3.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
                }
                out.write(__oracle_jsp_text[14]);
              } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
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
      out.write(__oracle_jsp_text[15]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[16]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_5.setName("isException");
                  __jsp_taghandler_5.setValue("false");
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
                }
                out.write(__oracle_jsp_text[17]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_6.setName("dayValue");
                  __jsp_taghandler_6.setValue("monday");
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
                }
                out.write(__oracle_jsp_text[18]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_7.setName("day");
                  __jsp_taghandler_7.setValue("Mon-Thurs");
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
                }
                out.write(__oracle_jsp_text[19]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_8.setName("prefix");
                  __jsp_taghandler_8.setValue("MT");
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
                }
                out.write(__oracle_jsp_text[20]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_9.setName("opens");
                  __jsp_taghandler_9.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.MT_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
                }
                out.write(__oracle_jsp_text[21]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_10.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_10.setName("closes");
                  __jsp_taghandler_10.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.MT_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
                }
                out.write(__oracle_jsp_text[22]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_11.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_11.setName("isClosed");
                  __jsp_taghandler_11.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.MT_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                  if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
                }
                out.write(__oracle_jsp_text[23]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_12.setName("note");
                  __jsp_taghandler_12.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.MT_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
                }
                out.write(__oracle_jsp_text[24]);
              } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_4.doCatch(th);
        } finally {
          __jsp_taghandler_4.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[25]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[26]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_14.setName("isException");
                  __jsp_taghandler_14.setValue("false");
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
                }
                out.write(__oracle_jsp_text[27]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_15.setName("dayValue");
                  __jsp_taghandler_15.setValue("friday");
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
                }
                out.write(__oracle_jsp_text[28]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_16.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_16.setName("day");
                  __jsp_taghandler_16.setValue("Fri");
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
                }
                out.write(__oracle_jsp_text[29]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_17.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_17.setName("prefix");
                  __jsp_taghandler_17.setValue("FR");
                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
                }
                out.write(__oracle_jsp_text[30]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_18.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_18.setName("opens");
                  __jsp_taghandler_18.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.FR_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
                }
                out.write(__oracle_jsp_text[31]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_19.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_19.setName("closes");
                  __jsp_taghandler_19.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.FR_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
                }
                out.write(__oracle_jsp_text[32]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_20.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_20.setName("isClosed");
                  __jsp_taghandler_20.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.FR_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
                }
                out.write(__oracle_jsp_text[33]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_21.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_21.setName("note");
                  __jsp_taghandler_21.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.FR_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
                }
                out.write(__oracle_jsp_text[34]);
              } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_13.doCatch(th);
        } finally {
          __jsp_taghandler_13.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
      }
      out.write(__oracle_jsp_text[35]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_22.setParent(null);
        __jsp_taghandler_22.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_22,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[36]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_23.setName("isException");
                  __jsp_taghandler_23.setValue("false");
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
                }
                out.write(__oracle_jsp_text[37]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_24.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_24.setName("dayValue");
                  __jsp_taghandler_24.setValue("saturday");
                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
                }
                out.write(__oracle_jsp_text[38]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_25.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_25.setName("day");
                  __jsp_taghandler_25.setValue("Sat");
                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
                }
                out.write(__oracle_jsp_text[39]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_26.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_26.setName("prefix");
                  __jsp_taghandler_26.setValue("SA");
                  __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                  if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
                }
                out.write(__oracle_jsp_text[40]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_27.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_27.setName("opens");
                  __jsp_taghandler_27.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SA_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
                }
                out.write(__oracle_jsp_text[41]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_28.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_28.setName("closes");
                  __jsp_taghandler_28.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SA_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
                }
                out.write(__oracle_jsp_text[42]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_29.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_29.setName("isClosed");
                  __jsp_taghandler_29.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SA_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                  if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,2);
                }
                out.write(__oracle_jsp_text[43]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_30.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_30.setName("note");
                  __jsp_taghandler_30.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SA_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
                }
                out.write(__oracle_jsp_text[44]);
              } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_22.doCatch(th);
        } finally {
          __jsp_taghandler_22.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,1);
      }
      out.write(__oracle_jsp_text[45]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_31.setParent(null);
        __jsp_taghandler_31.setUrl("add_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[46]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_32.setName("isException");
                  __jsp_taghandler_32.setValue("false");
                  __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                  if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
                }
                out.write(__oracle_jsp_text[47]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_33.setName("dayValue");
                  __jsp_taghandler_33.setValue("sunday");
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
                }
                out.write(__oracle_jsp_text[48]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_34.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_34.setName("day");
                  __jsp_taghandler_34.setValue("Sun");
                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
                }
                out.write(__oracle_jsp_text[49]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_35.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_35.setName("prefix");
                  __jsp_taghandler_35.setValue("SU");
                  __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                  if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,2);
                }
                out.write(__oracle_jsp_text[50]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_36.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_36.setName("opens");
                  __jsp_taghandler_36.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SU_O}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                  if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
                }
                out.write(__oracle_jsp_text[51]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_37.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_37.setName("closes");
                  __jsp_taghandler_37.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SU_C}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                  if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,2);
                }
                out.write(__oracle_jsp_text[52]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_38.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_38.setName("isClosed");
                  __jsp_taghandler_38.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SU_Closed}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
                }
                out.write(__oracle_jsp_text[53]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_39.setParent(__jsp_taghandler_31);
                  __jsp_taghandler_39.setName("note");
                  __jsp_taghandler_39.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${addStandard.SU_Note}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                  if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
                }
                out.write(__oracle_jsp_text[54]);
              } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_31.doCatch(th);
        } finally {
          __jsp_taghandler_31.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,1);
      }
      out.write(__oracle_jsp_text[55]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.unit}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[56]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[57]);


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
  private static final char __oracle_jsp_text[][]=new char[58][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n ".toCharArray();
    __oracle_jsp_text[4] = 
    "                   \n ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n ".toCharArray();
    __oracle_jsp_text[8] = 
    "                   \n ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Adding Standard Hours</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectLibrary.jsp\" class=\"menu\">Select New Library Unit</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectPeriod.jsp\" class=\"menu\">Select New Period</a>\n          </td>\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr bgcolor=\"#FFEE00\">\n          <td>Set the standard weekday/weekend hours for the\n          library for the selected period and click &quot;Continue&quot;\n          <br>\n          Select <b><i>either</i></b> opening and closing hours\n          for each day <b><i>or</i></b> &quot;Closed&quot;.  If\n          there are special conditions related to operating hours\n          (e.g., a collection that is only viewable by appointment),\n          please add them in the \"Comments\" field.</td>\n        </tr>\n      </table>\n      <form action=\"prepschedule\" method=\"post\">\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr>\n            <th>Day(s) Of Week</th>\n            <th>Library Opens</th>\n            <th>Library Closes</th>\n            <th>Library is Closed</th>\n            <th>Comments</th>\n          </tr>\n\n          ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[48] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[50] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[51] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[52] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[54] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[55] = 
    "\n\n        </table>\n        <input type=\"hidden\" name=\"unit\" value='".toCharArray();
    __oracle_jsp_text[56] = 
    "'>\n        <input type=\"hidden\" name=\"period\" value='".toCharArray();
    __oracle_jsp_text[57] = 
    "'>\n        <input type=\"hidden\" name=\"type\" value='add'>\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"center\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Continue\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n            </td>\n          </tr>\n        </table>\n      </form>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
