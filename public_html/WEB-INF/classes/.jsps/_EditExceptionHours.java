
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _EditExceptionHours extends com.orionserver.http.OrionHttpJspPage {


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
    _EditExceptionHours page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("special_id");
        __jsp_taghandler_1.setValue("");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("type");
        __jsp_taghandler_2.setValue("holiday");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setVar("reason");
        __jsp_taghandler_3.setValue("");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.unit}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setUrl("header.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[8]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                  __jsp_taghandler_7.setName("unit");
                  __jsp_taghandler_7.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.unit}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
                }
                out.write(__oracle_jsp_text[9]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                  __jsp_taghandler_8.setName("period");
                  __jsp_taghandler_8.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
                }
                out.write(__oracle_jsp_text[10]);
              } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setUrl("exception_title_edit.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[12]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_10.setName("except_id");
                  __jsp_taghandler_10.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.except_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
                }
                out.write(__oracle_jsp_text[13]);
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
      out.write(__oracle_jsp_text[14]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setUrl("edit_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[15]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                  __jsp_taghandler_12.setName("isException");
                  __jsp_taghandler_12.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
                }
                out.write(__oracle_jsp_text[16]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_13.setParent(__jsp_taghandler_11);
                  __jsp_taghandler_13.setName("dayName");
                  __jsp_taghandler_13.setValue("Mon-Thurs");
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
                }
                out.write(__oracle_jsp_text[17]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_14.setParent(__jsp_taghandler_11);
                  __jsp_taghandler_14.setName("dayParamName");
                  __jsp_taghandler_14.setValue("monday");
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
                }
                out.write(__oracle_jsp_text[18]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_15.setParent(__jsp_taghandler_11);
                  __jsp_taghandler_15.setName("dayPrefix");
                  __jsp_taghandler_15.setValue("MT");
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
                }
                out.write(__oracle_jsp_text[19]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_16.setParent(__jsp_taghandler_11);
                  __jsp_taghandler_16.setName("schedule");
                  __jsp_taghandler_16.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.except_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
                }
                out.write(__oracle_jsp_text[20]);
              } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_11.doCatch(th);
        } finally {
          __jsp_taghandler_11.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[21]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_17.setParent(null);
        __jsp_taghandler_17.setUrl("edit_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[22]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                  __jsp_taghandler_18.setName("isException");
                  __jsp_taghandler_18.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
                }
                out.write(__oracle_jsp_text[23]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                  __jsp_taghandler_19.setName("dayName");
                  __jsp_taghandler_19.setValue("Fri");
                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
                }
                out.write(__oracle_jsp_text[24]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_20.setParent(__jsp_taghandler_17);
                  __jsp_taghandler_20.setName("dayParamName");
                  __jsp_taghandler_20.setValue("friday");
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
                }
                out.write(__oracle_jsp_text[25]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_21.setParent(__jsp_taghandler_17);
                  __jsp_taghandler_21.setName("dayPrefix");
                  __jsp_taghandler_21.setValue("FR");
                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
                }
                out.write(__oracle_jsp_text[26]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_22.setParent(__jsp_taghandler_17);
                  __jsp_taghandler_22.setName("schedule");
                  __jsp_taghandler_22.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.except_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
                }
                out.write(__oracle_jsp_text[27]);
              } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_17.doCatch(th);
        } finally {
          __jsp_taghandler_17.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
      }
      out.write(__oracle_jsp_text[28]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_23.setParent(null);
        __jsp_taghandler_23.setUrl("edit_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[29]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                  __jsp_taghandler_24.setName("isException");
                  __jsp_taghandler_24.setValue("true");
                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
                }
                out.write(__oracle_jsp_text[30]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                  __jsp_taghandler_25.setName("dayName");
                  __jsp_taghandler_25.setValue("Sat");
                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
                }
                out.write(__oracle_jsp_text[31]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_26.setParent(__jsp_taghandler_23);
                  __jsp_taghandler_26.setName("dayParamName");
                  __jsp_taghandler_26.setValue("saturday");
                  __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                  if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
                }
                out.write(__oracle_jsp_text[32]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_27.setParent(__jsp_taghandler_23);
                  __jsp_taghandler_27.setName("dayPrefix");
                  __jsp_taghandler_27.setValue("SA");
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
                }
                out.write(__oracle_jsp_text[33]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_28.setParent(__jsp_taghandler_23);
                  __jsp_taghandler_28.setName("schedule");
                  __jsp_taghandler_28.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.except_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
                }
                out.write(__oracle_jsp_text[34]);
              } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_23.doCatch(th);
        } finally {
          __jsp_taghandler_23.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,1);
      }
      out.write(__oracle_jsp_text[35]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_29.setParent(null);
        __jsp_taghandler_29.setUrl("edit_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[36]);
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
                out.write(__oracle_jsp_text[37]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_31.setName("dayName");
                  __jsp_taghandler_31.setValue("Sun");
                  __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                  if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
                }
                out.write(__oracle_jsp_text[38]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_32.setName("dayParamName");
                  __jsp_taghandler_32.setValue("sunday");
                  __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                  if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
                }
                out.write(__oracle_jsp_text[39]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_33.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_33.setName("dayPrefix");
                  __jsp_taghandler_33.setValue("SU");
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
                }
                out.write(__oracle_jsp_text[40]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_34.setParent(__jsp_taghandler_29);
                  __jsp_taghandler_34.setName("schedule");
                  __jsp_taghandler_34.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.except_id}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
                }
                out.write(__oracle_jsp_text[41]);
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
      out.write(__oracle_jsp_text[42]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_35.setParent(null);
        __jsp_taghandler_35.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reason}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
        if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,1);
      }
      out.write(__oracle_jsp_text[43]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.unit}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[44]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[45]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.except_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[46]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${special_id}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[47]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${type}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[48]);


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
  private static final char __oracle_jsp_text[][]=new char[49][];
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
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Editing Exception Hours</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n    <script language=\"JavaScript\" src=\"js/CalendarPopup.js\" type=\"text/javascript\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\">\n      var cal1 = new CalendarPopup();\n      cal1.showYearNavigation();\n      var cal2 = new CalendarPopup();\n      cal2.showYearNavigation();\n    </script>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectLibrary.jsp\" class=\"menu\">Select New Library Unit</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectPeriod.jsp\" class=\"menu\">Select New Period</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href='AddException.jsp?unit=".toCharArray();
    __oracle_jsp_text[6] = 
    "&period=".toCharArray();
    __oracle_jsp_text[7] = 
    "'>Add Exceptions</a> \n          </td>\n        </tr>\n      </table>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Click an exception to edit the dates/hours.</td>\n        </tr>\n      </table>\n      ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n      <form name=\"editHours\" action=\"prepexception\" method=\"post\">\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr>\n            <th>Day Affected?</th>\n            <th>Day(s) Of Week</th>\n            <th>Library Opens</th>\n            <th>Library Closes</th>\n            <th>Library is Closed</th>\n            <th>Comments</th>\n          </tr>\n          \n          ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n\n          ".toCharArray();
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
    "\n          ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n\n          <tr>\n            <td align=\"right\" colspan=\"3\">Please provide an explanation for the exception:</td>\n            <td colspan=\"3\" align=\"left\">\n              <input name=\"reason\" type=\"text\" size=\"30\" maxlength=\"50\" value='".toCharArray();
    __oracle_jsp_text[43] = 
    "'>\n            </td>\n          </tr>\n        </table>\n        <input type=\"hidden\" name=\"unit\" value='".toCharArray();
    __oracle_jsp_text[44] = 
    "'>\n        <input type=\"hidden\" name=\"period\" value='".toCharArray();
    __oracle_jsp_text[45] = 
    "'>\n        <input type=\"hidden\" name=\"except_id\" value='".toCharArray();
    __oracle_jsp_text[46] = 
    "'>\n        <input type=\"hidden\" name=\"special_id\" value='".toCharArray();
    __oracle_jsp_text[47] = 
    "'>\n        <input type=\"hidden\" name=\"type\" value='".toCharArray();
    __oracle_jsp_text[48] = 
    "'>\n        <input type=\"hidden\" name=\"addedit\" value='edit'>\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"center\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Continue\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n            </td>\n          </tr>\n        </table>\n      </form>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
