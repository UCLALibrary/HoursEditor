<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
  <c:when test="${not empty param.unit}">
    <c:set var="unit_id" value="${param.unit}"/>
    <c:set var="period_id" value="${param.period}" scope="page"/>
  </c:when>
  <c:otherwise>
    <c:set var="unit_id" value="${sessionScope.except_unit}"/>
    <c:set var="period_id" value="${sessionScope.period}" scope="page"/>
  </c:otherwise>
</c:choose>

<jsp:useBean id="holidays" class="edu.ucla.library.libservices.scheduler.beans.utility.HolidayUtility">
  <jsp:setProperty name="holidays" property="unitID" value="${unit_id}"/>
  <jsp:setProperty name="holidays" property="periodID" value="${period_id}"/>
  <jsp:setProperty name="holidays" property="sourceName" value="${initParam['db.source']}"/>
</jsp:useBean>

<jsp:useBean id="exceptions" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean">
  <jsp:setProperty name="exceptions" property="sourceName" value="${initParam['db.source']}"/>
</jsp:useBean>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Add Exception Hours</title>
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
            <a href='EditException.jsp?unit=${unit_id}&period=${period_id}'>Edit Exceptions</a> 
          </td>
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Select the reason (holiday <b><i>or</i></b> other) for 
          the schedule exception.</td>
        </tr>
      </table>
      <form action="prepsession" method="post">
        <c:import url="header.jsp">
          <c:param name="unit" value="${unit_id}"/>
          <c:param name="period" value="${period_id}"/>
        </c:import>
        <table width="98%" border="0" cellpadding="2">
          <c:if test="${empty holidays.openHolidays}">
            <tr align="left">
              <td>
                Holidays:
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                All holidays in this period have been assigned for this unit.<br>
                <img src="images/1pix.gif" hspace="42" height="1" width="1" border="0" alt="">
                Please click 
                <a href='EditException.jsp?unit=${unit_id}&period=${period_id}'>here</a> 
                to review/edit the holiday hours.
                <input type="hidden" name="holiday" value="-1">
              </td>
            </tr>
            <tr>
              <td align="left"><b><i>OR</i></b></td>
            </tr>
          </c:if>
          <c:if test="${not empty holidays.openHolidays}">
            <tr align="left">
              <td>
                Holidays:
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <select name="holiday">
                  <option value="-1"></option>
                  <c:forEach var="theHoliday" items="${holidays.openHolidays}">
                    <option value='${theHoliday.period_id}'>
                      ${theHoliday.period_title}
                    </option>
                  </c:forEach>
                </select>
              </td>
            </tr>
            <tr>
              <td align="left"><b><i>OR</i></b></td>
            </tr>
          </c:if>
          <tr align="left">
            <td>
              Other Exception Reason:
              <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
              <select name="exception">
                <option value="-2"></option>
                <c:forEach var="theException" items="${exceptions.allExceptions}">
                  <option value='${theException.exception_id}'>
                    ${theException.exception_title}
                  </option>
                </c:forEach>
                <option value="-1">Other</option>
              </select>
            </td>
          </tr>
        </table>
        <input type="hidden" name="unit" value='${unit_id}'>
        <input type="hidden" name="period" value='${period_id}'>
        <table width="98%" border="0" cellpadding="2">
          <tr><td><hr size="1"></td></tr>
          <tr align="center">
            <td>
              <input type="submit" name="submit" value="Continue">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="Reset" value="Reset" name="Reset">
            </td>
          </tr>
        </table>
        <input type="hidden" name="from" value='excepts'>
      </form>
    </center>
  </body>
</html>