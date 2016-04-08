<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="monday" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>
<jsp:useBean id="friday" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>
<jsp:useBean id="saturday" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>
<jsp:useBean id="sunday" class="edu.ucla.library.libservices.scheduler.beans.tables.DailyHour"
             scope="session"/>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Verify Edit Standard Hours</title>
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
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr bgcolor="#FFEE00">
          <td>Please review the standard weekday/weekend hours
          you have set for this library and period.
          <br>
          If the hours are correct, click &quot;Continue&quot;.
          Otherwise, click &quot;Edit&quot; to return to the
          prior page and change them</td>
        </tr>
      </table>
      <form action="updateschedule" method="post">
        <c:import url="header.jsp">
          <c:param name="unit" value="${sessionScope.unit_id}"/>
          <c:param name="period" value="${sessionScope.period_id}"/>
        </c:import>
        <table width="98%" border="0" cellpadding="2">
          <tr>
            <th>Day(s) Of Week</th>
            <th>Library Opens</th>
            <th>Library Closes</th>
            <th>Library is Closed</th>
            <th>Comments</th>
          </tr>

          <c:import url="verify_day.jsp">
            <c:param name="dayName" value="Mon-Thurs"/>
            <c:param name="isExcept" value="false"/>
            <c:param name="opens" value="${monday.opens}"/>
            <c:param name="closes" value="${monday.closes}"/>
            <c:param name="closed" value="${monday.is_closed}"/>
            <c:param name="note" value="${monday.note}"/>
            <c:param name="prefix" value="MT"/>
          </c:import>

          <c:import url="verify_day.jsp">
            <c:param name="dayName" value="Fri"/>
            <c:param name="isExcept" value="false"/>
            <c:param name="opens" value="${friday.opens}"/>
            <c:param name="closes" value="${friday.closes}"/>
            <c:param name="closed" value="${friday.is_closed}"/>
            <c:param name="note" value="${friday.note}"/>
            <c:param name="prefix" value="FR"/>
          </c:import>

          <c:import url="verify_day.jsp">
            <c:param name="dayName" value="Sat"/>
            <c:param name="isExcept" value="false"/>
            <c:param name="opens" value="${saturday.opens}"/>
            <c:param name="closes" value="${saturday.closes}"/>
            <c:param name="closed" value="${saturday.is_closed}"/>
            <c:param name="note" value="${saturday.note}"/>
            <c:param name="prefix" value="SA"/>
          </c:import>

          <c:import url="verify_day.jsp">
            <c:param name="dayName" value="Sun"/>
            <c:param name="isExcept" value="false"/>
            <c:param name="opens" value="${sunday.opens}"/>
            <c:param name="closes" value="${sunday.closes}"/>
            <c:param name="closed" value="${sunday.is_closed}"/>
            <c:param name="note" value="${sunday.note}"/>
            <c:param name="prefix" value="SU"/>
          </c:import>

        </table>
        <input type="hidden" name="unit" value='${sessionScope.unit_id}'>
        <input type="hidden" name="period" value='${sessionScope.period_id}'>
        <input type="hidden" name="schedule" value='${sessionScope.schedule_id}'>
        <input type="hidden" name="type" value='edit'>
        <table width="98%" border="0" cellpadding="2">
          <tr><td><hr size="1"></td></tr>
          <tr align="center">
            <td>
              <input type="submit" name="submit" value="Update">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="button" value="Edit" name="edit" onClick="history.back()">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="button" value="Cancel" name="cancel" onClick="window.location='OptionsMenu.jsp'">
            </td>
          </tr>
        </table>
      </form>
    </center>
  </body>
</html>