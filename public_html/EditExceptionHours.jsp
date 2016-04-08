<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set value="" var="special_id"/>
<c:set value="holiday" var="type"/>
<c:set value="" var="reason"/>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Editing Exception Hours</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
    </style>
    <script language="JavaScript" src="js/CalendarPopup.js" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
      var cal1 = new CalendarPopup();
      cal1.showYearNavigation();
      var cal2 = new CalendarPopup();
      cal2.showYearNavigation();
    </script>
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
            <a href='AddException.jsp?unit=<c:out value="${param.unit}"/>&period=<c:out value="${param.period}"/>'>Add Exceptions</a> 
          </td>
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Click an exception to edit the dates/hours.</td>
        </tr>
      </table>
      <c:import url="header.jsp">
        <c:param name="unit" value="${param.unit}"/>
        <c:param name="period" value="${param.period}"/>
      </c:import>
      <form name="editHours" action="prepexception" method="post">
        <c:import url="exception_title_edit.jsp">
          <c:param name="except_id" value="${param.except_id}"/>
        </c:import>
        <table width="98%" border="0" cellpadding="2">
          <tr>
            <th>Day Affected?</th>
            <th>Day(s) Of Week</th>
            <th>Library Opens</th>
            <th>Library Closes</th>
            <th>Library is Closed</th>
            <th>Comments</th>
          </tr>
          
          <c:import url="edit_day.jsp">
            <c:param name="isException" value="true"/>
            <c:param name="dayName" value="Mon-Thurs"/>
            <c:param name="dayParamName" value="monday"/>
            <c:param name="dayPrefix" value="MT"/>
            <c:param name="schedule" value="${param.except_id}"/>
          </c:import>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="true"/>
            <c:param name="dayName" value="Fri"/>
            <c:param name="dayParamName" value="friday"/>
            <c:param name="dayPrefix" value="FR"/>
            <c:param name="schedule" value="${param.except_id}"/>
          </c:import>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="true"/>
            <c:param name="dayName" value="Sat"/>
            <c:param name="dayParamName" value="saturday"/>
            <c:param name="dayPrefix" value="SA"/>
            <c:param name="schedule" value="${param.except_id}"/>
          </c:import>

          <c:import url="edit_day.jsp">
            <c:param name="isException" value="true"/>
            <c:param name="dayName" value="Sun"/>
            <c:param name="dayParamName" value="sunday"/>
            <c:param name="dayPrefix" value="SU"/>
            <c:param name="schedule" value="${param.except_id}"/>
          </c:import>

          <tr>
            <td align="right" colspan="3">Please provide an explanation for the exception:</td>
            <td colspan="3" align="left">
              <input name="reason" type="text" size="30" maxlength="50" value='<c:out value="${reason}"/>'>
            </td>
          </tr>
        </table>
        <input type="hidden" name="unit" value='${param.unit}'>
        <input type="hidden" name="period" value='${param.period}'>
        <input type="hidden" name="except_id" value='${param.except_id}'>
        <input type="hidden" name="special_id" value='${special_id}'>
        <input type="hidden" name="type" value='${type}'>
        <input type="hidden" name="addedit" value='edit'>
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