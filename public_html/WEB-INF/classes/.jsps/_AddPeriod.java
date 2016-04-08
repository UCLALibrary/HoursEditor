
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _AddPeriod extends com.orionserver.http.OrionHttpJspPage {


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
    _AddPeriod page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean periods;
      synchronized (pageContext) {
        if ((periods = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) pageContext.getAttribute( "periods", PageContext.PAGE_SCOPE)) == null) {
          periods = (edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean) new edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean();
          pageContext.setAttribute( "periods", periods, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[3]);
      periods.setSourceName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${initParam['db.source']}",java.lang.String.class, __ojsp_varRes,null));
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${periods.quarters}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_1.setVar("thePeriod");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setVar("isSelected");
                __jsp_taghandler_2.setValue("");
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[8]);
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_id}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[10]);
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_title}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[12]);
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
      out.write(__oracle_jsp_text[13]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${periods.semesters}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_5.setVar("thePeriod");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[14]);
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_id}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[16]);
              out.write(__oracle_jsp_text[17]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${thePeriod.period_title}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[18]);
            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[19]);


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
  private static final char __oracle_jsp_text[][]=new char[20][];
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
    "                   \n\n".toCharArray();
    __oracle_jsp_text[5] = 
    "                   \n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Add Period Or Holiday</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n    <script language=\"JavaScript\" src=\"js/CalendarPopup.js\" type=\"text/javascript\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\">\n      var cal1 = new CalendarPopup();\n      cal1.showYearNavigation();\n    </script>\n  </head>\n  <body>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\">\n        <td>\n          <a href=\"index.jsp\" class=\"menu\">Home</a>\n        </td>\n      </tr>\n      <tr align=\"left\">\n        <td>\n          <a href=\"AdminMenu.jsp\" class=\"menu\">Admin Menu</a>\n        </td>\n      </tr>\n    </table>\n    <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n      <tr align=\"left\" bgcolor=\"#FFEE00\">\n        <td>\n          Enter a name for the new period and set the start and\n          end dates (the end date must be on or after the start \n          date).  If the period is a holiday, check &quot;Is \n          Holiday&quot; and indicate which existing period it \n          falls within.\n        </td>\n      </tr>\n    </table>\n    <form name=\"addPeriod\" action=\"addperiod\" method=\"POST\">\n      <table border=\"0\" width=\"98%\">\n        <tr>\n          <td>Period Name:</td>\n          <td><input type=\"text\" name=\"period_title\" size=\"30\" maxlength=\"50\" value=''></td>\n        </tr>\n        <tr>\n          <td>\n            Start Date:&nbsp;\n            <input type=\"text\" name=\"start_date\" size=\"15\" value=''>\n            <a href=\"#\" onClick=\"cal1.select(addPeriod.start_date,'anchor1','MM/dd/yy'); return false;\" title=\"cal1.select(addPeriod.start_date,'anchor1','MM/dd/yy'); return false;\" name=\"anchor1\" id=\"anchor1\">\n              <img src=\"images/show-calendar.gif\" width=24 height=22 border=0 alt=\"calendar\">\n            </a>\n          </td>\n          <td>\n            End Date:&nbsp;\n            <input type=\"text\" name=\"end_date\" size=\"15\" value=''>\n            <a href=\"#\" onClick=\"cal1.select(addPeriod.end_date,'anchor2','MM/dd/yy',(addPeriod.end_date.value=='')?addPeriod.start_date.value:null); return false;\" title=\"cal1.select(addPeriod.end_date,'anchor2','MM/dd/yy',(addPeriod.end_date.value=='')?addPeriod.start_date.value:null); return false;\" name=\"anchor2\" id=\"anchor2\">\n              <img src=\"images/show-calendar.gif\" width=24 height=22 border=0 alt=\"calendar\">\n            </a>\n          </td>\n        </tr>\n        <tr>\n          <td colspan=\"2\">\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n            Is Holiday?&nbsp;\n            <input type=\"checkbox\" name=\"is_exception\" value=\"true\">\n          </td>\n        </tr>\n        <tr><td colspan=\"2\">Holiday Falls Within:</td></tr>\n        <tr>\n          <td>\n            Quarter:&nbsp;\n            <select name=\"falls_in_quarter\">\n              <option value=\"-1\"></option>\n              ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                <option value='".toCharArray();
    __oracle_jsp_text[10] = 
    "'>".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                </option>              \n              ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n            </select>\n          </td>\n          <td>\n            Semester:&nbsp;\n            <select name=\"falls_in_semester\">\n              <option value=\"-1\"></option>\n              ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                <option value='".toCharArray();
    __oracle_jsp_text[16] = 
    "'>".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                </option>              \n              ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            </select>\n          </td>\n        </tr>\n      </table>\n      <input type=\"hidden\" name=\"type\" value=\"period\"/>\n      <input type=\"hidden\" name=\"method\" value=\"add\"/>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"center\">\n          <td>\n            <input type=\"submit\" name=\"submit\" value=\"Add\">\n            <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n            <input type=\"Reset\" value=\"Reset\" name=\"Reset\">\n          </td>\n        </tr>\n      </table>\n    </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
