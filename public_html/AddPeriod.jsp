<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="periods" class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean"/>
<jsp:setProperty name="periods" property="sourceName" value="${initParam['db.source']}"/>                   

<%--jsp:useBean id="addPeriod" class="edu.ucla.web.forms.AddPeriodActionForm"
             scope="request"/>
<jsp:setProperty name="addPeriod" property="sourceName" value="${initParam['db.source']}"/--%>                   

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Add Period Or Holiday</title>
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
    </script>
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
        <td>
          Enter a name for the new period and set the start and
          end dates (the end date must be on or after the start 
          date).  If the period is a holiday, check &quot;Is 
          Holiday&quot; and indicate which existing period it 
          falls within.
        </td>
      </tr>
    </table>
    <form name="addPeriod" action="addperiod" method="POST">
      <table border="0" width="98%">
        <tr>
          <td>Period Name:</td>
          <td><input type="text" name="period_title" size="30" maxlength="50" value=''></td>
        </tr>
        <tr>
          <td>
            Start Date:&nbsp;
            <input type="text" name="start_date" size="15" value=''>
            <a href="#" onClick="cal1.select(addPeriod.start_date,'anchor1','MM/dd/yy'); return false;" title="cal1.select(addPeriod.start_date,'anchor1','MM/dd/yy'); return false;" name="anchor1" id="anchor1">
              <img src="images/show-calendar.gif" width=24 height=22 border=0 alt="calendar">
            </a>
          </td>
          <td>
            End Date:&nbsp;
            <input type="text" name="end_date" size="15" value=''>
            <a href="#" onClick="cal1.select(addPeriod.end_date,'anchor2','MM/dd/yy',(addPeriod.end_date.value=='')?addPeriod.start_date.value:null); return false;" title="cal1.select(addPeriod.end_date,'anchor2','MM/dd/yy',(addPeriod.end_date.value=='')?addPeriod.start_date.value:null); return false;" name="anchor2" id="anchor2">
              <img src="images/show-calendar.gif" width=24 height=22 border=0 alt="calendar">
            </a>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <%--c:set value="" var="isChecked"/>
            <c:if test="${addPeriod.is_exception}"><c:set value=" checked" var="isChecked"/></c:if--%>
            Is Holiday?&nbsp;
            <input type="checkbox" name="is_exception" value="true">
          </td>
        </tr>
        <tr><td colspan="2">Holiday Falls Within:</td></tr>
        <tr>
          <td>
            Quarter:&nbsp;
            <select name="falls_in_quarter">
              <option value="-1"></option>
              <c:forEach var="thePeriod" items="${periods.quarters}">
                <c:set value="" var="isSelected"/>
                <%--c:if test="${addPeriod.falls_in_quarter eq thePeriod.period_id}"><c:set value=" selected" var="isSelected"/></c:if--%>
                <option value='<c:out value="${thePeriod.period_id}"/>'><%--c:out value="${isChecked}"/--%>
                  <c:out value="${thePeriod.period_title}"/>
                </option>              
              </c:forEach>
            </select>
          </td>
          <td>
            Semester:&nbsp;
            <select name="falls_in_semester">
              <option value="-1"></option>
              <c:forEach var="thePeriod" items="${periods.semesters}">
                <%--c:set value="" var="isSelected"/>
                <c:if test="${addPeriod.falls_in_semester eq thePeriod.period_id}"><c:set value=" selected" var="isSelected"/></c:if--%>
                <option value='<c:out value="${thePeriod.period_id}"/>'><%--c:out value="${isChecked}"/--%>
                  <c:out value="${thePeriod.period_title}"/>
                </option>              
              </c:forEach>
            </select>
          </td>
        </tr>
      </table>
      <input type="hidden" name="type" value="period"/>
      <input type="hidden" name="method" value="add"/>
      <table width="98%" border="0" cellpadding="2">
        <tr align="center">
          <td>
            <input type="submit" name="submit" value="Add">
            <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
            <input type="Reset" value="Reset" name="Reset">
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>