
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _EditPeriod extends com.orionserver.http.OrionHttpJspPage {


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
    _EditPeriod page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean periods;
      synchronized (pageContext) {
        if ((periods = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "periods", PageContext.PAGE_SCOPE)) == null) {
          periods = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
          pageContext.setAttribute( "periods", periods, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[4]);
          periods.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${periods.allPeriods}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setVar("thePeriod");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_id}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[8]);
              out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_title}",java.lang.String.class, __ojsp_varRes, null));
              out.write(__oracle_jsp_text[9]);
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
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty param.period_id}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[11]);
            edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean edited;
            synchronized (pageContext) {
              if ((edited = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "edited", PageContext.PAGE_SCOPE)) == null) {
                edited = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
                pageContext.setAttribute( "edited", edited, PageContext.PAGE_SCOPE);
                out.write(__oracle_jsp_text[12]);
                edited.setPeriodId((java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period_id}",java.lang.Integer.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[13]);
                edited.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
                out.write(__oracle_jsp_text[14]);
              }
            }
            out.write(__oracle_jsp_text[15]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.period_title}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[16]);
            {
              org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern var");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.start_date}",java.util.Date.class, __ojsp_varRes,null));
              __jsp_taghandler_3.setPattern("MM/dd/yy");
              __jsp_taghandler_3.setVar("start");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[17]);
            {
              org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value pattern var");
              __jsp_taghandler_4.setParent(__jsp_taghandler_2);
              __jsp_taghandler_4.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.end_date}",java.util.Date.class, __ojsp_varRes,null));
              __jsp_taghandler_4.setPattern("MM/dd/yy");
              __jsp_taghandler_4.setVar("end");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[18]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${start}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[19]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${end}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[20]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_2);
              __jsp_taghandler_5.setVar("isChecked");
              __jsp_taghandler_5.setValue("");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[21]);
            {
              org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
              __jsp_taghandler_6.setParent(__jsp_taghandler_2);
              __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.is_exception}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[22]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_7.setVar("isChecked");
                    __jsp_taghandler_7.setValue(" checked");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                  }
                  out.write(__oracle_jsp_text[23]);
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            out.write(__oracle_jsp_text[24]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${isChecked}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[25]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.falls_in_quarter}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[26]);
            {
              org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
              __jsp_taghandler_8.setParent(__jsp_taghandler_2);
              __jsp_taghandler_8.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${periods.quarters}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_taghandler_8.setVar("thePeriod");
              try {
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[27]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_9.setVar("isSelected");
                      __jsp_taghandler_9.setValue("");
                      __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                      if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.falls_in_quarter eq thePeriod.period_id}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[29]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                            __jsp_taghandler_11.setVar("isSelected");
                            __jsp_taghandler_11.setValue(" selected");
                            __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                            if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
                          }
                          out.write(__oracle_jsp_text[30]);
                        } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_12.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_id}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                      if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[32]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${isSelected}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_13.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_title}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[34]);
                  } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_8.doCatch(th);
              } finally {
                __jsp_taghandler_8.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            out.write(__oracle_jsp_text[35]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.falls_in_semester}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[36]);
            {
              org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
              __jsp_taghandler_14.setParent(__jsp_taghandler_2);
              __jsp_taghandler_14.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${periods.semesters}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_taghandler_14.setVar("thePeriod");
              try {
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[37]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                      __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_15.setVar("isSelected");
                      __jsp_taghandler_15.setValue("");
                      __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                      if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_16.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_16.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${edited.period.falls_in_semester eq thePeriod.period_id}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[39]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                            __jsp_taghandler_17.setVar("isSelected");
                            __jsp_taghandler_17.setValue(" selected");
                            __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                            if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                          }
                          out.write(__oracle_jsp_text[40]);
                        } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_18.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_id}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                      if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,3);
                    }
                    out.write(__oracle_jsp_text[42]);
                    out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${isSelected}",java.lang.String.class, __ojsp_varRes, null));
                    out.write(__oracle_jsp_text[43]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_19.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_19.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_title}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                      if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                    }
                    out.write(__oracle_jsp_text[44]);
                  } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_14.doCatch(th);
              } finally {
                __jsp_taghandler_14.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
            }
            out.write(__oracle_jsp_text[45]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.period_id}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[46]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[47]);


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
  private static final char __oracle_jsp_text[][]=new char[48][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Edit Period/Holiday</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n    <script language=\"JavaScript\" src=\"js/CalendarPopup.js\" type=\"text/javascript\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\">\n      var cal1 = new CalendarPopup();\n      cal1.showYearNavigation();\n    </script>\n  </head>\n  <body><table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"AdminMenu.jsp\" class=\"menu\">Admin Menu</a>\n        </td>\n      </tr>\n    </table><table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\" bgcolor=\"#FFEE00\">\n        <td>Select a period/holiday and click &quot;Edit&quot;.</td>\n      </tr>\n    </table><form action=\"EditPeriod.jsp\" method=\"POST\">\n      <table border=\"0\" width=\"98%\">\n        <tr>\n          <td>Period:</td>\n          <td>\n            <select name=\"period_id\">\n              ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n                <option value='".toCharArray();
    __oracle_jsp_text[8] = 
    "'>\n                  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                </option>\n              ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n            </select>\n          </td>\n        </tr>\n        <tr align=\"center\">\n          <td colspan=\"2\">\n            <input type=\"submit\" name=\"submit\" value=\"Edit\"></input>\n            <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\"\n                 border=\"0\" alt=\"\"></img>\n            <input type=\"Reset\" value=\"Reset\" name=\"Reset\"></input>\n          </td>\n        </tr>\n      </table>\n    </form>".toCharArray();
    __oracle_jsp_text[11] = 
    "\n      <br clear=\"all\"/>\n      ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\" bgcolor=\"#FFEE00\">\n          <td>Update as needed and click &quot;Update&quot;.</td>\n        </tr>\n      </table>\n      <form name=\"editPeriod\" action=\"editperiod\" method=\"POST\">\n        <table border=\"0\" width=\"98%\">\n          <tr>\n            <td>Period Name:</td>\n            <td>\n              <input type=\"text\" name=\"period_title\" size=\"30\" maxlength=\"50\"\n                     value='".toCharArray();
    __oracle_jsp_text[16] = 
    "'></input>\n            </td>\n          </tr>\n          <tr>\n            <td>\n              ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n              Start Date:&nbsp;\n              <input type=\"text\" name=\"start_date\" size=\"15\" value='".toCharArray();
    __oracle_jsp_text[19] = 
    "'></input>\n              <a href=\"#\"\n                 onclick=\"cal1.select(editPeriod.start_date,'anchor1','MM/dd/yy'); return false;\"\n                 title=\"cal1.select(editPeriod.start_date,'anchor1','MM/dd/yy'); return false;\"\n                 name=\"anchor1\" id=\"anchor1\">\n                <img src=\"images/show-calendar.gif\" width=\"24\" height=\"22\"\n                     border=\"0\" alt=\"calendar\"></img>\n              </a>\n            </td>\n            <td>\n              End Date:&nbsp;\n              <input type=\"text\" name=\"end_date\" size=\"15\" value='".toCharArray();
    __oracle_jsp_text[20] = 
    "'></input>\n              <a href=\"#\"\n                 onclick=\"cal1.select(editPeriod.end_date,'anchor2','MM/dd/yy',(editPeriod.end_date.value=='')?editPeriod.start_date.value:null); return false;\"\n                 title=\"cal1.select(editPeriod.end_date,'anchor2','MM/dd/yy',(editPeriod.end_date.value=='')?editPeriod.start_date.value:null); return false;\"\n                 name=\"anchor2\" id=\"anchor2\">\n                <img src=\"images/show-calendar.gif\" width=\"24\" height=\"22\"\n                     border=\"0\" alt=\"calendar\"></img>\n              </a>\n            </td>\n          </tr>\n          <tr>\n            <td colspan=\"2\">\n              ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n              Is Holiday?&nbsp;\n              <input type=\"checkbox\" name=\"is_exception\" value=\"true\"\n                     ".toCharArray();
    __oracle_jsp_text[25] = 
    "></input>\n            </td>\n          </tr>\n          <tr>\n            <td colspan=\"2\">Holiday Falls Within:</td>\n          </tr>\n          <tr>\n            <td>\n              <input type=\"hidden\" name=\"fiq\"\n                     value='".toCharArray();
    __oracle_jsp_text[26] = 
    "'></input>\n              Quarter:&nbsp;\n              <select name=\"falls_in_quarter\">\n                <option value=\"-1\"></option>\n                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n                  <option value='".toCharArray();
    __oracle_jsp_text[32] = 
    "'\n                          ".toCharArray();
    __oracle_jsp_text[33] = 
    ">\n                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n                  </option>\n                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n              </select>\n            </td>\n            <td>\n              <input type=\"hidden\" name=\"fis\"\n                     value='".toCharArray();
    __oracle_jsp_text[36] = 
    "'></input>\n              Semester:&nbsp;\n              <select name=\"falls_in_semester\">\n                <option value=\"-1\"></option>\n                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n                  <option value='".toCharArray();
    __oracle_jsp_text[42] = 
    "'\n                          ".toCharArray();
    __oracle_jsp_text[43] = 
    ">\n                    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n                  </option>\n                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n              </select>\n            </td>\n          </tr>\n        </table>\n        <input type=\"hidden\" name=\"period_id\" value='".toCharArray();
    __oracle_jsp_text[46] = 
    "'></input>\n      <input type=\"hidden\" name=\"type\" value=\"period\"/>\n      <input type=\"hidden\" name=\"method\" value=\"edit\"/>\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr align=\"center\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Update\"></input>\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\"\n                   border=\"0\" alt=\"\"></img>\n              <input type=\"Reset\" value=\"Reset\" name=\"Reset\"></input>\n            </td>\n          </tr>\n        </table>\n      </form>\n    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
