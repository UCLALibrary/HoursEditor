
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _DeleteStandard extends com.orionserver.http.OrionHttpJspPage {


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
    _DeleteStandard page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
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
                out.write(__oracle_jsp_text[3]);
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
                out.write(__oracle_jsp_text[4]);
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
                out.write(__oracle_jsp_text[5]);
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
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setUrl("show_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[7]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_5.setName("dayName");
                  __jsp_taghandler_5.setValue("Mon-Thurs");
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
                }
                out.write(__oracle_jsp_text[8]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_6.setName("schedule");
                  __jsp_taghandler_6.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.schedule}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
                }
                out.write(__oracle_jsp_text[9]);
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
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setUrl("show_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[11]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                  __jsp_taghandler_8.setName("dayName");
                  __jsp_taghandler_8.setValue("Fri");
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
                }
                out.write(__oracle_jsp_text[12]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                  __jsp_taghandler_9.setName("schedule");
                  __jsp_taghandler_9.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.schedule}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
                }
                out.write(__oracle_jsp_text[13]);
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
      out.write(__oracle_jsp_text[14]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setUrl("show_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[15]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                  __jsp_taghandler_11.setName("dayName");
                  __jsp_taghandler_11.setValue("Sat");
                  __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                  if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
                }
                out.write(__oracle_jsp_text[16]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                  __jsp_taghandler_12.setName("schedule");
                  __jsp_taghandler_12.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.schedule}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
                }
                out.write(__oracle_jsp_text[17]);
              } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_10.doCatch(th);
        } finally {
          __jsp_taghandler_10.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setUrl("show_day.jsp");
        try {
          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[19]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_14.setName("dayName");
                  __jsp_taghandler_14.setValue("Sun");
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
                }
                out.write(__oracle_jsp_text[20]);
                {
                  org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                  __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_15.setName("schedule");
                  __jsp_taghandler_15.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.schedule}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
                }
                out.write(__oracle_jsp_text[21]);
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
      out.write(__oracle_jsp_text[22]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.schedule}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[23]);


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
  private static final char __oracle_jsp_text[][]=new char[24][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n    <title>Set Library Hours: Deleting Standard Hours</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/display.css\"/>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffffff; \n}\n    </style>\n  </head>\n  <body>\n    <center>\n      <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n        <tr align=\"left\">\n          <td>\n            <a href=\"index.jsp\" class=\"menu\">Home</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectGroup.jsp\" class=\"menu\">Select New Library Group</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectLibrary.jsp\" class=\"menu\">Select New Library Unit</a>\n          </td>\n        </tr>\n        <tr align=\"left\">\n          <td>\n            <a href=\"SelectPeriod.jsp\" class=\"menu\">Select New Period</a>\n          </td>\n        </tr>\n      </table>\n      <form action=\"deleteSchedule\" method=\"post\">\n        ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr>\n            <th>Day(s) Of Week</th>\n            <th>Library Opens</th>\n            <th>Library Closes</th>\n            <th>Library is Closed</th>\n            <th>Comments</th>\n          </tr>\n\n          ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n\n          ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n          \n          ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          \n        </table>\n        <input type=\"hidden\" name=\"schedule\" value='".toCharArray();
    __oracle_jsp_text[23] = 
    "'>\n        <input type=\"hidden\" name=\"type\" value='delete'>\n        <table width=\"98%\" border=\"0\" cellpadding=\"2\">\n          <tr><td><hr size=\"1\"></td></tr>\n          <tr align=\"center\">\n            <td>\n              <input type=\"submit\" name=\"submit\" value=\"Delete\">\n              <img src=\"images/1pix.gif\" hspace=\"35\" height=\"1\" width=\"1\" border=\"0\" alt=\"\">\n              <input type=\"button\" value=\"Cancel\" name=\"cancel\" onClick=\"window.location='OptionsMenu.jsp'\">\n            </td>\n          </tr>\n        </table>\n      </form>\n    </center>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
