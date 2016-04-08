<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="exceptions" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean">
  <jsp:setProperty name="exceptions" property="sourceName" value="${initParam['db.source']}"/>
</jsp:useBean>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Edit Exception Reason</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
    </style>
  </head>
  <body>
    <table width="98%" border="0" cellpadding="2">
      <tr align="left">
        <td>
          <a href="index.jsp" class="menu">Home</a>
        </td>
      </tr>
      <tr align="left">
        <td>
          <a href="AdminMenu.jsp" class="menu">Admin Menu</a>
        </td>
      </tr>
    </table>
    <table width="98%" border="0" cellpadding="2">
      <tr align="left" bgcolor="#FFEE00">
        <td>Select an exception and press &quot;Edit&quot;</td>
      </tr>
    </table>
    <form name="selectExcept" action="EditExcept.jsp" method="POST">
      <table>
        <tr align="left">
          <td align="right">
            Exception Reason:
          </td>
          <td align="left">
            <select name="exception_id">
              <c:forEach var="theExcept" items="${exceptions.allExceptions}">
                <option value='${theExcept.exception_id}'>
                  ${theExcept.exception_title}
                </option>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr align="left">
          <td colspan="2">
            <input type="submit" name="submit" value="Edit">
            <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
            <input type="Reset" value="Reset" name="Reset">
          </td>
        </tr>
      </table>
    </form>
    <c:if test="${not empty param.exception_id}">
      <jsp:useBean id="edited" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ExceptionReasonWebBean">
        <jsp:setProperty name="edited" property="exceptionID" param="exception_id"/>
        <jsp:setProperty name="edited" property="sourceName" value="${initParam['db.source']}"/>
      </jsp:useBean>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Enter the name for the exception reason</td>
        </tr>
      </table>
      <form name="editExcept" action="editexcept" method="POST"><!-- onsubmit="return validate(editExcept)"-->
        <table>
          <tr align="left">
            <td align="right">
              Exception Title:
            </td>
            <td align="left">
              <input type="text" name="exception_title" size="40" maxlength="255" value='${edited.exception.exception_title}'>
            </td>
          </tr>
          <tr align="left">
            <td colspan="2">
              <input type="submit" name="submit" value="Update">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="Reset" value="Reset" name="Reset">
            </td>
          </tr>
        </table>
        <input type="hidden" name="exception_id" value='${param.exception_id}'>
        <input type="hidden" name="type" value="except"/>
        <input type="hidden" name="method" value="edit"/>
      </form>
    </c:if>
  </body>
</html>