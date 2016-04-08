<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="exceptUtil"
             class="edu.ucla.library.libservices.scheduler.beans.utility.ScheduleExceptionUtility">
  <jsp:setProperty name="exceptUtil" property="sourceName"
                   value="${initParam['db.source']}"/>
  <jsp:setProperty name="exceptUtil" property="exception"
                   value='${sessionScope.exception_id}'/>
  <jsp:setProperty name="exceptUtil" property="holiday" 
                   value='${sessionScope.holiday_id}'/>
  <jsp:setProperty name="exceptUtil" property="period" 
                   value='${sessionScope.period_id}'/>
</jsp:useBean>
<jsp:useBean id="addException"
             class="edu.ucla.library.libservices.scheduler.beans.forms.ScheduleForm"
             scope="request"></jsp:useBean>
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
    <script language="JavaScript" src="js/CalendarPopup.js"
            type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
      var cal1 = new CalendarPopup();
      cal1.showYearNavigation();
      var cal2 = new CalendarPopup();
      cal2.showYearNavigation();
    </script>
  </head>
  <body><table width="98%" border="0" cellpadding="2">
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
          <a href='EditException.jsp?unit=${sessionScope.unit_id}&period=${sessionScope.period_id}'>
            Edit Exceptions
          </a>
        </td>
      </tr>
    </table><table width="98%" border="0" cellpadding="2">
      <tr align="left" bgcolor="#FFEE00">
        <td>
          <c:if test="${exceptUtil.type eq 'except'}">
            Enter the start and end dates of the exception period.
          </c:if>
          Select the operating hours for the library unit during this exception.
          Click the &quot;Day Affected?&quot; button for each day (or day range)
          covered by the exception.
        </td>
      </tr>
    </table>
    <form name="selectRange" action="prepexception" method="post">
      <c:import url="header.jsp">
        <c:param name="unit" value="${sessionScope.unit_id}"/>
        <c:param name="period" value="${sessionScope.period_id}"/>
      </c:import>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left">
          <td colspan="2">
            Exception Reason:&nbsp;${exceptUtil.exceptTitle}
            <input type="hidden" name="title" value='${exceptUtil.exceptTitle}'>
          </td>
        </tr>
        <tr align="left">
          <td>Start Date:</td>
          <c:if test="${exceptUtil.type eq 'holiday'}">
            <td align="left">
              ${exceptUtil.exceptStart}
              <input type="hidden" name="start_date" value='${exceptUtil.exceptStart}'>
            </td>
          </c:if>
          <c:if test="${exceptUtil.type eq 'except'}">
            <td>
              <input type="text" name="start_date" size="15" value='${addException.start_date}'>
              <a href="#" onClick="cal1.select(selectRange.start_date,'anchor1','MM/dd/yy'); return false;" title="cal1.select(selectRange.start_date,'anchor1','MM/dd/yy'); return false;" name="anchor1" id="anchor1">
                <img src="images/show-calendar.gif" width=24 height=22 border=0 alt="">
              </a>
            </td>
          </c:if>
        </tr>
        <tr align="left">
          <td>End Date:</td>
          <c:if test="${exceptUtil.type eq 'holiday'}">
            <td align="left">
              ${exceptUtil.exceptEnd}
              <input type="hidden" name="end_date" value='${exceptUtil.exceptEnd}'>
            </td>
          </c:if>
          <c:if test="${exceptUtil.type eq 'except'}">
            <td align="left">
              <input type="text" name="end_date" size="15" value='${addException.end_date}'>
              <a href="#" onClick="cal2.select(selectRange.end_date,'anchor2','MM/dd/yy'); return false;" title="cal2.select(selectRange.end_date,'anchor2','MM/dd/yy'); return false;" name="anchor2" id="anchor2">
                <img src="images/show-calendar.gif" width=24 height=22 border=0 alt="">
              </a>
            </td>
          </c:if>
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr>
          <th>Day Affected?</th>
          <th>Day(s) Of Week</th>
          <th>Library Opens</th>
          <th>Library Closes</th>
          <th>Library is Closed</th>
          <th>Comments</th>
        </tr>

        <c:import url="add_day.jsp">
          <c:param name="isException" value="true"/>
          <c:param name="dayValue" value="monday"/>
          <c:param name="day" value="Mon-Thurs"/>
          <c:param name="prefix" value="MT"/>
          <c:param name="selected" value="${addException.monday}"/>
          <c:param name="opens" value="${addException.MT_O}"/>
          <c:param name="closes" value="${addException.MT_C}"/>
          <c:param name="isClosed" value="${addException.MT_Closed}"/>
          <c:param name="note" value="${addException.MT_Note}"/>
        </c:import>

        <c:import url="add_day.jsp">
          <c:param name="isException" value="true"/>
          <c:param name="dayValue" value="friday"/>
          <c:param name="day" value="Fri"/>
          <c:param name="prefix" value="FR"/>
          <c:param name="selected" value="${addException.friday}"/>
          <c:param name="opens" value="${addException.FR_O}"/>
          <c:param name="closes" value="${addException.FR_C}"/>
          <c:param name="isClosed" value="${addException.FR_Closed}"/>
          <c:param name="note" value="${addException.FR_Note}"/>
        </c:import>

        <c:import url="add_day.jsp">
          <c:param name="isException" value="true"/>
          <c:param name="dayValue" value="saturday"/>
          <c:param name="day" value="Sat"/>
          <c:param name="prefix" value="SA"/>
          <c:param name="selected" value="${addException.saturday}"/>
          <c:param name="opens" value="${addException.SA_O}"/>
          <c:param name="closes" value="${addException.SA_C}"/>
          <c:param name="isClosed" value="${addException.SA_Closed}"/>
          <c:param name="note" value="${addException.SA_Note}"/>
        </c:import>

        <c:import url="add_day.jsp">
          <c:param name="isException" value="true"/>
          <c:param name="dayValue" value="sunday"/>
          <c:param name="day" value="Sun"/>
          <c:param name="prefix" value="SU"/>
          <c:param name="selected" value="${addException.sunday}"/>
          <c:param name="opens" value="${addException.SU_O}"/>
          <c:param name="closes" value="${addException.SU_C}"/>
          <c:param name="isClosed" value="${addException.SU_Closed}"/>
          <c:param name="note" value="${addException.SU_Note}"/>
        </c:import>

        <tr>
          <td align="right" colspan="3">Please provide an explanation for the exception:</td>
          <td colspan="3" align="left">
            <input name="reason" type="text" size="30" maxlength="50" value='${addException.reason}'>
          </td>
        </tr>
      </table>
      <input type="hidden" name="unit" value='${sessionScope.unit_id}'>
      <input type="hidden" name="period" value='${sessionScope.period_id}'>
      <input type="hidden" name="type" value='${exceptUtil.type}'>
      <input type="hidden" name="except_period" value='${exceptUtil.except_period}'>
      <input type="hidden" name="except_id" value='${exceptUtil.except_id}'>
      <input type="hidden" name="addedit" value='add'>
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
  </body>
</html>