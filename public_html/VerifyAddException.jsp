<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="monday_bean" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>
<jsp:useBean id="friday_bean" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>
<jsp:useBean id="saturday_bean" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>
<jsp:useBean id="sunday_bean" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>

<c:set value="${sessionScope.title}" var="title"/>
<c:if test="${not empty sessionScope.reason}">
  <c:set value="${title}(${sessionScope.reason})" var="title"/>
</c:if>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Verify Add Exception Hours</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
    </style>
  </head>
  <body>
    <center>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left">
          <td>
            <a href="index.jsp" class="menu">Home</a>
          </td>
        </tr>
        <tr align="left">
          <td>
            <a href="SelectGroup.jsp" class="menu">Select New Library Group</a>
          </td>
        </tr>
        <tr align="left">
          <td>
            <a href="SelectLibrary.jsp" class="menu">Select New Library Unit</a>
          </td>
        </tr>
        <tr align="left">
          <td>
            <a href="SelectPeriod.jsp" class="menu">Select New Period</a>
          </td>
        </tr>
        <tr align="left">
          <td>
            <a href='EditException.jsp?unit=<c:out value="${sessionScope.unit_id}"/>&period=<c:out value="${sessionScope.period_id}"/>'>Edit Exceptions</a> 
          </td>
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Please review the exception hours
          you have set for this library and period.
          <br>
          If the hours are correct, click &quot;Continue&quot; to
          submit these hours and return to the &quot;Add Exception&quot;
          screen; <i>or</i> click &quot;Finish&quot; to submit these
          hours and return to the options menu.
          Otherwise, click &quot;Edit&quot; to return to the
          prior page and change them.</td>
        </tr>
      </table>
      <form action="addexception" method="post">
        <c:import url="header.jsp">
          <c:param name="unit" value="${sessionScope.unit_id}"/>
          <c:param name="period" value="${sessionScope.period_id}"/>
        </c:import>
        <table width="98%" border="0" cellpadding="2">
          <tr align="left"><td>Exception: <c:out value="${title}"/></td></tr>
          <c:if test="${sessionScope.start_date eq sessionScope.end_date}">
            <tr align="left"><td>Exception Hours for ${sessionScope.start_date}</td></tr>
          </c:if>
          <c:if test="${sessionScope.start_date ne sessionScope.end_date}">
            <tr align="left">
              <td>
                Exception Hours for ${sessionScope.start_date} - ${sessionScope.end_date}
              </td>
            </tr>
          </c:if>
          <tr><td><hr size="1"></td></tr>
        </table>
        <input type="hidden" name="start_date" value='${sessionScope.start_date}'>
        <input type="hidden" name="end_date" value='${sessionScope.end_date}'>
        <table width="98%" border="0" cellpadding="2">
          <tr>
            <th>Day(s) Of Week</th>
            <th>Library Opens</th>
            <th>Library Closes</th>
            <th>Library is Closed</th>
            <th>Comments</th>
          </tr>
          <c:if test="${not empty sessionScope.monday}">
            <c:import url="verify_day.jsp">
              <c:param name="dayName" value="Mon-Thurs"/>
              <c:param name="isExcept" value="true"/>
              <c:param name="dayParam" value="monday"/>
              <c:param name="opens" value="${monday_bean.opens}"/>
              <c:param name="closes" value="${monday_bean.closes}"/>
              <c:param name="closed" value="${monday_bean.is_closed}"/>
              <c:param name="note" value="${monday_bean.note}"/>
              <c:param name="prefix" value="MT"/>
            </c:import>
          </c:if>
          <c:if test="${not empty sessionScope.friday}">
            <c:import url="verify_day.jsp">
              <c:param name="dayName" value="Fri"/>
              <c:param name="isExcept" value="true"/>
              <c:param name="dayParam" value="friday"/>
              <c:param name="opens" value="${friday_bean.opens}"/>
              <c:param name="closes" value="${friday_bean.closes}"/>
              <c:param name="closed" value="${friday_bean.is_closed}"/>
              <c:param name="note" value="${friday_bean.note}"/>
              <c:param name="prefix" value="FR"/>
            </c:import>
          </c:if>
          <c:if test="${not empty sessionScope.saturday}">
            <c:import url="verify_day.jsp">
              <c:param name="dayName" value="Sat"/>
              <c:param name="isExcept" value="true"/>
              <c:param name="dayParam" value="saturday"/>
              <c:param name="opens" value="${saturday_bean.opens}"/>
              <c:param name="closes" value="${saturday_bean.closes}"/>
              <c:param name="closed" value="${saturday_bean.is_closed}"/>
              <c:param name="note" value="${saturday_bean.note}"/>
              <c:param name="prefix" value="SA"/>
            </c:import>
          </c:if>
          <c:if test="${not empty sessionScope.sunday}">
            <c:import url="verify_day.jsp">
              <c:param name="dayName" value="Sun"/>
              <c:param name="isExcept" value="true"/>
              <c:param name="dayParam" value="sunday"/>
              <c:param name="opens" value="${sunday_bean.opens}"/>
              <c:param name="closes" value="${sunday_bean.closes}"/>
              <c:param name="closed" value="${sunday_bean.is_closed}"/>
              <c:param name="note" value="${sunday_bean.note}"/>
              <c:param name="prefix" value="SU"/>
            </c:import>
          </c:if>
          <tr align="left">
            <td align="right" colspan="2">Exception Reason:</td>
            <td colspan="3" align="left">
              <c:out value="${sessionScope.reason}"/>
              <input type="hidden" name="reason" value='${sessionScope.reason}'>
            </td>
          </tr>
        </table>
        <input type="hidden" name="unit" value='${sessionScope.unit_id}'>
        <input type="hidden" name="period" value='${sessionScope.period_id}'>
        <input type="hidden" name="type" value='${sessionScope.type}'>
        <input type="hidden" name="except_period" value='${sessionScope.except_period}'>
        <input type="hidden" name="except_id" value='${sessionScope.except_id}'>
        <input type="hidden" name="addedit" value='add'>
        <table width="98%" border="0" cellpadding="2">
          <tr><td><hr size="1"></td></tr>
          <tr align="center">
            <td>
              <input type="submit" name="submit" value="Finish">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="submit" name="submit" value="Continue">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="button" value="Edit" name="edit" onClick="history.back()">
            </td>
          </tr>
        </table>
      </form>
    </center>
  </body>
</html>