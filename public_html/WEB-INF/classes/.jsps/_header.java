
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _header extends com.orionserver.http.OrionHttpJspPage {


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
    _header page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean theUnit;
      synchronized (pageContext) {
        if ((theUnit = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) pageContext.getAttribute( "theUnit", PageContext.PAGE_SCOPE)) == null) {
          theUnit = (edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean();
          pageContext.setAttribute( "theUnit", theUnit, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[2]);
          theUnit.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[3]);
          {
            String[] __paramList = request.getParameterValues( "unit");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              theUnit.setUnitId(Integer.valueOf( __paramList[0]).intValue());
            }
          }
          out.write(__oracle_jsp_text[4]);
        }
      }
      out.write(__oracle_jsp_text[5]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean thePeriod;
      synchronized (pageContext) {
        if ((thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "thePeriod", PageContext.PAGE_SCOPE)) == null) {
          thePeriod = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
          pageContext.setAttribute( "thePeriod", thePeriod, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[6]);
          thePeriod.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
          out.write(__oracle_jsp_text[7]);
          {
            String[] __paramList = request.getParameterValues( "period");
            if ((__paramList != null) && (__paramList[0] != null) && (__paramList[0].length() > 0)) {
              thePeriod.setPeriodId(Integer.valueOf( __paramList[0]));
            }
          }
          out.write(__oracle_jsp_text[8]);
        }
      }
      out.write(__oracle_jsp_text[9]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${theUnit.unit.unit_title}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[10]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period.period_title}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[11]);
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
      out.write(__oracle_jsp_text[12]);
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
      out.write(__oracle_jsp_text[13]);


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
  private static final char __oracle_jsp_text[][]=new char[14][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n ".toCharArray();
    __oracle_jsp_text[3] = 
    "                   \n ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n ".toCharArray();
    __oracle_jsp_text[7] = 
    "                   \n ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\n\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr align=\"left\">\n            <td>\n              UCLA Libraries: ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n            </td>\n          </tr>\n          <tr align=\"left\">\n            <td>\n              Academic Period: ".toCharArray();
    __oracle_jsp_text[11] = 
    " &nbsp;\n              (".toCharArray();
    __oracle_jsp_text[12] = 
    "\n              -\n              ".toCharArray();
    __oracle_jsp_text[13] = 
    ")\n            </td>\n          </tr>\n          <tr><td><hr size=\"1\"></td></tr>\n        </table>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
