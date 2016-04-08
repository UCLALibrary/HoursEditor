<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="units" class="edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean">
  <jsp:setProperty name="units" property="sourceName" value="${initParam['db.source']}"/>
  <jsp:setProperty name="units" property="unitIdList" value="${sessionScope.unit}"/>
</jsp:useBean>

<jsp:useBean id="thePeriod" class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
  <jsp:setProperty name="thePeriod" property="sourceName" value="${initParam['db.source']}"/>
  <jsp:setProperty name="thePeriod" property="periodId" value="${sessionScope.period}"/>
</jsp:useBean>

<jsp:useBean id="unitSchedule" class="edu.ucla.library.libservices.scheduler.beans.utility.UnitScheduleUtility"/>
<jsp:setProperty name="unitSchedule" property="sourceName" value="${initParam['db.source']}"/>                   

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Options</title>
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
        <tr align="left" bgcolor="#FFEE00">
          <td>Click a link to set or update the standard or
          exception hours for the listed library/period.</td>
        </tr>
        <tr align="left">
          <td>
            Academic Period:
            ${thePeriod.period.period_title}
            &nbsp;
            (<fmt:formatDate pattern="MMM d, yyyy" value="${thePeriod.period.start_date}"/>
            -
            <fmt:formatDate pattern="MMM d, yyyy" value="${thePeriod.period.end_date}"/>)
          </td>
        </tr>
        <tr><td><hr size="1"></td></tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <c:forEach var="theUnit" items="${units.someUnits}">
          <c:set value="${theUnit.unit_id}" var="unitID" scope="page"/>
          <tr align="left">
            <td>
              UCLA Libraries:&nbsp;${theUnit.unit_title}
            </td>
          </tr>

          <jsp:setProperty property="endDate" name="unitSchedule" 
            value="${thePeriod.period.end_date}"/>
          <jsp:setProperty property="periodID" name="unitSchedule" 
            value="${sessionScope.period}"/>
          <jsp:setProperty property="startDate" name="unitSchedule" 
            value="${thePeriod.period.start_date}"/>
          <jsp:setProperty property="unitID" name="unitSchedule" 
            value="${unitID}"/>
     
          <c:if test="${not unitSchedule.hasStandard}">
            <tr align="left">
              <td>
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <a href='AddStandard.jsp?unit=${theUnit.unit_id}&period=${sessionScope.period}'>Add standard hours</a>
              </td>
            </tr>
          </c:if>

          <c:if test="${unitSchedule.hasStandard}">
            <tr align="left">
              <td>
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <a href='EditStandard.jsp?unit=${theUnit.unit_id}&period=${sessionScope.period}&schedule=${unitSchedule.scheduleID}'>Edit standard hours</a>
              </td>
            </tr>
            <tr align="left">
              <td>
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <a href='DeleteStandard.jsp?unit=${theUnit.unit_id}&period=${sessionScope.period}&schedule=${unitSchedule.scheduleID}'>Delete standard hours</a>
              </td>
            </tr>
          </c:if>

          <tr align="left">
            <td>
              <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
              <a href='AddException.jsp?unit=${theUnit.unit_id}&period=${sessionScope.period}'>Add exception hours</a>
            </td>
          </tr>

          <c:if test="${unitSchedule.hasException}">
            <tr align="left">
              <td>
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <a href='EditException.jsp?unit=${theUnit.unit_id}&period=${sessionScope.period}'>Edit exception hours</a>
              </td>
            </tr>
            <tr align="left">
              <td>
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <a href='DeleteException.jsp?unit=${theUnit.unit_id}&period=${sessionScope.period}'>Delete exception hours</a>
              </td>
            </tr>
          </c:if>

        </c:forEach>
      </table>
    </center>
  </body>
</html>