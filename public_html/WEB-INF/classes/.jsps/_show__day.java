
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _show__day extends com.orionserver.http.OrionHttpJspPage {


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
    _show__day page = this;
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
        __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty theHours}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[8]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayName}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[9]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.opens}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[10]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.closes}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[11]);
            {
              org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.is_closed}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[12]);
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[13]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theHours.note}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[14]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }


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
  private static final char __oracle_jsp_text[][]=new char[15][];
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
    "\n\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n              <tr align=\"center\">\n                <td>".toCharArray();
    __oracle_jsp_text[9] = 
    ".</td>\n                <td>".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[12] = 
    "Closed".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\n              </tr>\n            ".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
