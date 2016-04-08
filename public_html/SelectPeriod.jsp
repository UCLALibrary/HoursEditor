<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="today" class="java.util.Date"/>

<fmt:formatDate var="thisDate" pattern="MM/dd/yy"  value="${today}" scope="page"/>

<jsp:useBean id="units" class="edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean">
  <jsp:setProperty name="units" property="sourceName" value="${initParam['db.source']}"/>
  <jsp:setProperty name="units" property="unitIdList" value="${sessionScope.unit}"/>
</jsp:useBean>

<jsp:useBean id="periods" class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
  <jsp:setProperty name="periods" property="sourceName" value="${initParam['db.source']}"/>
  <jsp:setProperty name="periods" property="theDate" value="${thisDate}"/>
</jsp:useBean>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Select Academic Period</title>
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
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Select a period and click &quot;Continue&quot;</td>
        </tr>
      </table>
      <form action="prepsession" method="post">
        <table width="98%" border="0" cellpadding="2">
          <tr align="left">
            <td>UCLA Libraries: 
              <c:forEach var="theUnit" items="${units.someUnits}">
                ${theUnit.unit_title}&#059;&nbsp;&nbsp;
              </c:forEach>
            </td>
          </tr>
          <tr align="left"><td>Current and Future Academic Periods</td></tr>
          <tr><td><hr size="1"></td></tr>
          <c:forEach var="thePeriod" items="${periods.allStandardPeriods}">
            <tr align="left">
              <td>
                <input type="radio" name="period" value='${thePeriod.period_id}'>
                ${thePeriod.period_title}
                &nbsp;
                (<fmt:formatDate pattern="MMM d, yyyy" value="${thePeriod.start_date}"/>
                -
                <fmt:formatDate pattern="MMM d, yyyy" value="${thePeriod.end_date}"/>)
              </td>
            </tr>
          </c:forEach>
          <tr><td><hr size="1"></td></tr>
          <tr align="left">
            <td>
              <input type="submit" name="submit" value="Continue">
              <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
              <input type="Reset" value="Reset" name="Reset">
            </td>
          </tr>
        </table>
        <input type="hidden" name="from" value='periods'>
      </form>
    </center>
  </body>
</html>