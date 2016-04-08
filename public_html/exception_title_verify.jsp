<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="theException" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean">
  <jsp:setProperty name="theException" property="scheduleID" param="except_id"/>
  <jsp:setProperty name="theException" property="sourceName" value="${initParam['db.source']}"/>
</jsp:useBean>

<c:set var="title" value=""/>
<c:set var="start_date" value=""/>
<c:set var="end_date" value=""/>

<c:if test="${! theException.schedule.has_special_range}">
  <jsp:useBean id="thePeriod" class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
    <jsp:setProperty name="thePeriod" property="periodId" value="${theException.schedule.period_id}"/>
    <jsp:setProperty name="thePeriod" property="sourceName" value="${initParam['db.source']}"/>
  </jsp:useBean>
  <c:set var="title" value="${thePeriod.period.period_title}"/>
  <c:set var="start_date" value="${thePeriod.period.start_date}"/>
  <c:set var="end_date" value="${thePeriod.period.end_date}"/>
</c:if>

<c:if test="${theException.schedule.has_special_range}">
  <jsp:useBean id="theSpecial" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean">
    <jsp:setProperty name="theSpecial" property="scheduleId"  value="${theException.schedule.schedule_id}"/>
    <jsp:setProperty name="theSpecial" property="sourceName" value="${initParam['db.source']}"/>
  </jsp:useBean>
  <c:set var="start_date" value="${theSpecial.exception.start_date}"/>
  <c:set var="end_date" value="${theSpecial.exception.end_date}"/>
  <jsp:useBean id="theReason" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean">
    <jsp:setProperty name="theReason" property="exceptionID" value="${theSpecial.exception.exception_id}"/>
    <jsp:setProperty name="theReason" property="sourceName" value="${initParam['db.source']}"/>
  </jsp:useBean>
  <c:set var="title" value="${theReason.exception.exception_title}"/>
</c:if>

        <table width="98%" border="0" cellpadding="2">
          <tr align="left">
            <td colspan="2">Exception Reason:&nbsp;<c:out value="${title}"/></td>
          </tr>
          <tr align="left">
            <td>Start Date:</td>
            <td>
              <fmt:formatDate value="${start_date}" pattern="MM/dd/yy"/>
            </td>
          </tr>
          <tr align="left">
            <td>End Date:</td>
            <td>
              <fmt:formatDate value="${end_date}" pattern="MM/dd/yy"/>
            </td>
          </tr>
        </table>
