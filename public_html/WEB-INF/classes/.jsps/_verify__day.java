
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _verify__day extends com.orionserver.http.OrionHttpJspPage {


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
    _verify__day page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayName}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.isExcept}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[3]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.dayParam}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[4]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.opens eq '-1'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[6]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.opens ne '-1'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[8]);
            {
              org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
              __jsp_taghandler_4.setParent(__jsp_taghandler_3);
              __jsp_taghandler_4.setUrl("display_time.jsp");
              try {
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[9]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                        __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_5.setName("time");
                        __jsp_taghandler_5.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.opens}",java.lang.String.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                      }
                      out.write(__oracle_jsp_text[10]);
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
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[11]);
          } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[12]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.prefix}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[13]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.opens}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[14]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.closes eq '-1'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[15]);
          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.closes ne '-1'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[17]);
            {
              org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url");
              __jsp_taghandler_8.setParent(__jsp_taghandler_7);
              __jsp_taghandler_8.setUrl("display_time.jsp");
              try {
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[18]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                        __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                        __jsp_taghandler_9.setName("time");
                        __jsp_taghandler_9.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.closes}",java.lang.String.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                      }
                      out.write(__oracle_jsp_text[19]);
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
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            out.write(__oracle_jsp_text[20]);
          } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[21]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.prefix}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[22]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.closes}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[23]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty param.closed and param.closed}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[24]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.prefix}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[25]);
          } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[26]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.note}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[27]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.prefix}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[28]);
      out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.note}",java.lang.String.class, __ojsp_varRes, null));
      out.write(__oracle_jsp_text[29]);


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
  private static final char __oracle_jsp_text[][]=new char[30][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n\n            <tr>\n              <td align=\"center\">\n                ".toCharArray();
    __oracle_jsp_text[2] = 
    ".\n                ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n                  <input type=\"hidden\" name='".toCharArray();
    __oracle_jsp_text[4] = 
    "' value=\"1\">\n                ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n              </td>\n              <td align=\"center\">\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n                  N/A\n                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                <input type=\"hidden\" name='".toCharArray();
    __oracle_jsp_text[13] = 
    "_O' value='".toCharArray();
    __oracle_jsp_text[14] = 
    "'>\n              </td>\n              <td align=\"center\">\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                  N/A\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n                <input type=\"hidden\" name='".toCharArray();
    __oracle_jsp_text[22] = 
    "_C' value='".toCharArray();
    __oracle_jsp_text[23] = 
    "'>\n              </td>\n              <td align=\"center\">\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n                  Closed.\n                  <input type=\"hidden\" name='".toCharArray();
    __oracle_jsp_text[25] = 
    "_Closed' value=\"1\">\n                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n              </td>\n              <td align=\"center\">\n                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                <input type=\"hidden\" name='".toCharArray();
    __oracle_jsp_text[28] = 
    "_Note' value='".toCharArray();
    __oracle_jsp_text[29] = 
    "'>\n              </td>\n            </tr>  \n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
