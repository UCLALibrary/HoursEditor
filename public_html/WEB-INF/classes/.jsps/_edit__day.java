
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _edit__day extends com.orionserver.http.OrionHttpJspPage {


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
    _edit__day page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean theDay;
      synchronized (pageContext) {
        if ((theDay = (edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean) pageContext.getAttribute( "theDay", PageContext.PAGE_SCOPE)) == null) {
          theDay = (edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean();
          pageContext.setAttribute( "theDay", theDay, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[2]);
          {
            String[] __paramList = request.getParameterValues( "dayName");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              theDay.setDayOfWeek(__paramList[0]);
            }
          }
          out.write(__oracle_jsp_text[3]);
          {
            String[] __paramList = request.getParameterValues( "schedule");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              theDay.setScheduleID(Integer.valueOf( __paramList[0]).intValue());
            }
          }
          out.write(__oracle_jsp_text[4]);
          theDay.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("theHours");
        __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theDay.dailyHour}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.isException}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[8]);
            {
              org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[9]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty theHours and (not empty theHours.opens or theHours.is_closed)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[10]);
                        out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayParamName}",java.lang.String.class, __ojsp_varRes, null));
                        out.write(__oracle_jsp_text[11]);
                      } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                  }
                  out.write(__oracle_jsp_text[12]);
                  {
                    org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[13]);
                        out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayParamName}",java.lang.String.class, __ojsp_varRes, null));
                        out.write(__oracle_jsp_text[14]);
                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                  }
                  out.write(__oracle_jsp_text[15]);
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[16]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${! param.isException}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[18]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayValue}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[19]);
          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[20]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayName}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[21]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayPrefix}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[22]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setUrl("hours_list_edit.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[23]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                  __jsp_taghandler_8.setName("time");
                  __jsp_taghandler_8.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.opens}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
                }
                out.write(__oracle_jsp_text[24]);
              } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_7.doCatch(th);
        } finally {
          __jsp_taghandler_7.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[25]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayPrefix}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[26]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setUrl("hours_list_edit.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[27]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_10.setName("time");
                  __jsp_taghandler_10.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.closes}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
                }
                out.write(__oracle_jsp_text[28]);
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
      out.write(__oracle_jsp_text[29]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_11.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[30]);
            {
              org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
              __jsp_taghandler_12.setParent(__jsp_taghandler_11);
              __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.is_closed}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[31]);
                  out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayPrefix}",java.lang.String.class, __ojsp_varRes, null));
                  out.write(__oracle_jsp_text[32]);
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
            }
            out.write(__oracle_jsp_text[33]);
            {
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
              __jsp_taghandler_13.setParent(__jsp_taghandler_11);
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[34]);
                  out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayPrefix}",java.lang.String.class, __ojsp_varRes, null));
                  out.write(__oracle_jsp_text[35]);
                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
            }
            out.write(__oracle_jsp_text[36]);
          } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[37]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayPrefix}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[38]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.note}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[39]);


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
  private static final char __oracle_jsp_text[][]=new char[40][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n ".toCharArray();
    __oracle_jsp_text[5] = 
    "                   \n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n\n            <tr align=\"center\">\n              ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                <td>\n                  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                      <input type=\"checkbox\" name='".toCharArray();
    __oracle_jsp_text[11] = 
    "' value=\"1\" checked>\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n                      <input type=\"checkbox\" name='".toCharArray();
    __oracle_jsp_text[14] = 
    "' value=\"1\">\n                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                </td>\n              ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                <input type=\"hidden\" name='".toCharArray();
    __oracle_jsp_text[19] = 
    "' value=\"1\">\n              ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n              <td>".toCharArray();
    __oracle_jsp_text[21] = 
    ".</td>\n              <td>\n                <select name='".toCharArray();
    __oracle_jsp_text[22] = 
    "_O'>\n                  <option value=\"-1\"></option>\n                  ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n                </select>\n              </td>\n              <td>\n                <select name='".toCharArray();
    __oracle_jsp_text[26] = 
    "_C'>\n                  <option value=\"-1\"></option>\n                  ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                </select>\n              </td>\n              <td>\n                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n                   ".toCharArray();
    __oracle_jsp_text[31] = 
    " \n                    <input type=\"checkbox\" name='".toCharArray();
    __oracle_jsp_text[32] = 
    "_Closed' value=\"1\" checked/>\n                   ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n                   ".toCharArray();
    __oracle_jsp_text[34] = 
    " \n                    <input type=\"checkbox\" name='".toCharArray();
    __oracle_jsp_text[35] = 
    "_Closed' value=\"1\"/>\n                   ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n              </td>\n              <td>\n                <input type=\"text\" name='".toCharArray();
    __oracle_jsp_text[38] = 
    "_Note' size=\"30\" maxlength=\"255\" value='".toCharArray();
    __oracle_jsp_text[39] = 
    "'>\n              </td>\n            </tr>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
