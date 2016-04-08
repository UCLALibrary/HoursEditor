<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="periods"
             class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
  <jsp:setProperty name="periods" property="sourceName"
                   value="${initParam[\'db.source\']}"/>
</jsp:useBean>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Edit Period/Holiday</title>
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
  <body><table width="98%" border="0" cellpadding="2">
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
    </table><table width="98%" border="0" cellpadding="2">
      <tr align="left" bgcolor="#FFEE00">
        <td>Select a period/holiday and click &quot;Edit&quot;.</td>
      </tr>
    </table><form action="EditPeriod.jsp" method="POST">
      <table border="0" width="98%">
        <tr>
          <td>Period:</td>
          <td>
            <select name="period_id">
              <c:forEach var="thePeriod" items="${periods.allPeriods}">
                <option value='${thePeriod.period_id}'>
                  ${thePeriod.period_title}
                </option>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr align="center">
          <td colspan="2">
            <input type="submit" name="submit" value="Edit"></input>
            <img src="images/1pix.gif" hspace="35" height="1" width="1"
                 border="0" alt=""></img>
            <input type="Reset" value="Reset" name="Reset"></input>
          </td>
        </tr>
      </table>
    </form><c:if test="${not empty param.period_id}">
      <br clear="all"/>
      <jsp:useBean id="edited"
                   class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
        <jsp:setProperty name="edited" property="periodId"
                         value='${param.period_id}'/>
        <jsp:setProperty name="edited" property="sourceName"
                         value="${initParam[\'db.source\']}"/>
      </jsp:useBean>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Update as needed and click &quot;Update&quot;.</td>
        </tr>
      </table>
      <form name="editPeriod" action="editperiod" method="POST">
        <table border="0" width="98%">
          <tr>
            <td>Period Name:</td>
            <td>
              <input type="text" name="period_title" size="30" maxlength="50"
                     value='${edited.period.period_title}'></input>
            </td>
          </tr>
          <tr>
            <td>
              <fmt:formatDate var="start" value="${edited.period.start_date}"
                              pattern="MM/dd/yy"/>
              <fmt:formatDate var="end" value="${edited.period.end_date}"
                              pattern="MM/dd/yy"/>
              Start Date:&nbsp;
              <input type="text" name="start_date" size="15" value='${start}'></input>
              <a href="#"
                 onclick="cal1.select(editPeriod.start_date,'anchor1','MM/dd/yy'); return false;"
                 title="cal1.select(editPeriod.start_date,'anchor1','MM/dd/yy'); return false;"
                 name="anchor1" id="anchor1">
                <img src="images/show-calendar.gif" width="24" height="22"
                     border="0" alt="calendar"></img>
              </a>
            </td>
            <td>
              End Date:&nbsp;
              <input type="text" name="end_date" size="15" value='${end}'></input>
              <a href="#"
                 onclick="cal1.select(editPeriod.end_date,'anchor2','MM/dd/yy',(editPeriod.end_date.value=='')?editPeriod.start_date.value:null); return false;"
                 title="cal1.select(editPeriod.end_date,'anchor2','MM/dd/yy',(editPeriod.end_date.value=='')?editPeriod.start_date.value:null); return false;"
                 name="anchor2" id="anchor2">
                <img src="images/show-calendar.gif" width="24" height="22"
                     border="0" alt="calendar"></img>
              </a>
            </td>
          </tr>
          <tr>
            <td colspan="2">
              <c:set value="" var="isChecked"/>
              <c:if test="${edited.period.is_exception}">
                <c:set value=" checked" var="isChecked"/>
              </c:if>
              Is Holiday?&nbsp;
              <input type="checkbox" name="is_exception" value="true"
                     ${isChecked}></input>
            </td>
          </tr>
          <tr>
            <td colspan="2">Holiday Falls Within:</td>
          </tr>
          <tr>
            <td>
              <input type="hidden" name="fiq"
                     value='${edited.period.falls_in_quarter}'></input>
              Quarter:&nbsp;
              <select name="falls_in_quarter">
                <option value="-1"></option>
                <c:forEach var="thePeriod" items="${periods.quarters}">
                  <c:set value="" var="isSelected"/>
                  <c:if test="${edited.period.falls_in_quarter eq thePeriod.period_id}">
                    <c:set value=" selected" var="isSelected"/>
                  </c:if>
                  <option value='<c:out value="${thePeriod.period_id}"/>'
                          ${isSelected}>
                    <c:out value="${thePeriod.period_title}"/>
                  </option>
                </c:forEach>
              </select>
            </td>
            <td>
              <input type="hidden" name="fis"
                     value='${edited.period.falls_in_semester}'></input>
              Semester:&nbsp;
              <select name="falls_in_semester">
                <option value="-1"></option>
                <c:forEach var="thePeriod" items="${periods.semesters}">
                  <c:set value="" var="isSelected"/>
                  <c:if test="${edited.period.falls_in_semester eq thePeriod.period_id}">
                    <c:set value=" selected" var="isSelected"/>
                  </c:if>
                  <option value='<c:out value="${thePeriod.period_id}"/>'
                          ${isSelected}>
                    <c:out value="${thePeriod.period_title}"/>
                  </option>
                </c:forEach>
              </select>
            </td>
          </tr>
        </table>
        <input type="hidden" name="period_id" value='${param.period_id}'></input>
      <input type="hidden" name="type" value="period"/>
      <input type="hidden" name="method" value="edit"/>
        <table width="98%" border="0" cellpadding="2">
          <tr align="center">
            <td>
              <input type="submit" name="submit" value="Update"></input>
              <img src="images/1pix.gif" hspace="35" height="1" width="1"
                   border="0" alt=""></img>
              <input type="Reset" value="Reset" name="Reset"></input>
            </td>
          </tr>
        </table>
      </form>
    </c:if>
  </body>
</html>