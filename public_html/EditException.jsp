<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
  <c:when test="${not empty param.unit}">
    <c:set value="${param.unit}" var="unit_id" scope="page"/>
    <c:set value="${param.period}" var="period_id" scope="page"/>
  </c:when>
  <c:otherwise>
    <c:set value="${sessionScope.except_unit}" var="unit_id" scope="page"/>
    <c:set value="${sessionScope.except_period}" var="period_id" scope="page"/>
  </c:otherwise>
</c:choose>

<jsp:useBean id="exceptions" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean">
  <jsp:setProperty name="exceptions" property="unitID" value='${unit_id}'/>
  <jsp:setProperty name="exceptions" property="periodID" value='${period_id}'/>
  <jsp:setProperty name="exceptions" property="sourceName" value="${initParam['db.source']}"/>
</jsp:useBean>

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
            <a href='AddException.jsp?unit=<c:out value="${unit_id}"/>&period=<c:out value="${period_id}"/>'>Add Exceptions</a> 
          </td>
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Click an exception to edit the dates/hours.</td>
        </tr>
      </table>
      <c:import url="header.jsp">
        <c:param name="unit" value="${unit_id}"/>
        <c:param name="period" value="${period_id}"/>
      </c:import>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left">
          <td>
            Exception Periods:
          </td>
        </tr>
        <tr align="left">
          <td>
            <c:forEach var="theException" items="${exceptions.exceptionsInPeriod}">
              <c:import url="set_link.jsp">
                <c:param name="has_special_range" value="${theException.has_special_range}"/>
                <c:param name="period_id" value="${theException.period_id}"/>
                <c:param name="schedule_id" value="${theException.schedule_id}"/>
                <c:param name="unit" value="${unit_id}"/>
                <c:param name="period" value="${period_id}"/>
              </c:import>
            </c:forEach>
          </td>
        </tr>
        <tr><td><hr size="1"></td></tr>
      </table>
    </center>
  </body>
</html>