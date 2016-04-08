<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Editing Standard Hours</title>
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
          <td>Set the standard weekday/weekend hours for the
          library for the selected period and click &quot;Continue&quot;
          <br>
          Select <b><i>either</i></b> opening and closing hours
          for each day <b><i>or</i></b> &quot;Closed&quot;.  If
          there are special conditions related to operating hours
          (e.g., a collection that is only viewable by appointment),
          please add them in the "Comments" field.</td>
        </tr>
      </table>
      <form action="prepschedule" method="post">
        <c:import url="header.jsp">
          <c:param name="unit" value="${param.unit}"/>
          <c:param name="period" value="${param.period}"/>
        </c:import>
        <table width="98%" border="0" cellpadding="2">
          <tr>
            <th>Day(s) Of Week</th>
            <th>Library Opens</th>
            <th>Library Closes</th>
            <th>Library is Closed</th>
            <th>Comments</th>
          </tr>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="false"/>
            <c:param name="dayValue" value="monday"/>
            <c:param name="dayName" value="Mon-Thurs"/>
            <c:param name="dayPrefix" value="MT"/>
            <c:param name="schedule" value="${param.schedule}"/>
          </c:import>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="false"/>
            <c:param name="dayValue" value="friday"/>
            <c:param name="dayName" value="Fri"/>
            <c:param name="dayPrefix" value="FR"/>
            <c:param name="schedule" value="${param.schedule}"/>
          </c:import>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="false"/>
            <c:param name="dayValue" value="saturday"/>
            <c:param name="dayName" value="Sat"/>
            <c:param name="dayPrefix" value="SA"/>
            <c:param name="schedule" value="${param.schedule}"/>
          </c:import>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="false"/>
            <c:param name="dayValue" value="sunday"/>
            <c:param name="dayName" value="Sun"/>
            <c:param name="dayPrefix" value="SU"/>
            <c:param name="schedule" value="${param.schedule}"/>
          </c:import>

        </table>
        <input type="hidden" name="unit" value='${param.unit}'>
        <input type="hidden" name="period" value='${param.period}'>
        <input type="hidden" name="schedule" value='${param.schedule}'>
        <input type="hidden" name="type" value='edit'>
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
      </form>
    </center>
  </body>
</html>