<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="theException" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleWebBean">
  <jsp:setProperty name="theException" property="scheduleID" param="except_id"/>
  <jsp:setProperty name="theException" property="sourceName" value="${initParam['db.source']}"/>                   
</jsp:useBean>

<c:set value="" var="title"/>
<c:set value="" var="start_date"/>
<c:set value="" var="end_date"/>

<c:if test="${! theException.schedule.has_special_range}">
  <jsp:useBean id="thePeriod" class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
    <jsp:setProperty name="thePeriod" property="periodId" value="${theException.schedule.period_id}"/>
    <jsp:setProperty name="thePeriod" property="sourceName" value="${initParam['db.source']}"/>
    <jsp:setProperty name="thePeriod" property="sourceName" value="${initParam['db.source']}"/>
  </jsp:useBean>
  <c:set value="${thePeriod.period.period_title}" var="title"/>
  <c:set value="${thePeriod.period.start_date}" var="start_date"/>
  <c:set value="${thePeriod.period.end_date}" var="end_date"/>
</c:if>

<c:if test="${theException.schedule.has_special_range}">
  <jsp:useBean id="theSpecial" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean">
    <jsp:setProperty name="theSpecial" property="scheduleId" value="${theException.schedule.schedule_id}"/>
    <jsp:setProperty name="theSpecial" property="sourceName" value="${initParam['db.source']}"/>                   
  </jsp:useBean>
  <c:set value="${theSpecial.exception.start_date}" var="start_date"/>
  <c:set value="${theSpecial.exception.end_date}" var="end_date"/>
  <jsp:useBean id="theReason" class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean">
    <jsp:setProperty name="theReason" property="exceptionID" value="${theSpecial.exception.exception_id}"/>
    <jsp:setProperty name="theReason" property="sourceName" value="${initParam['db.source']}"/>                   
  </jsp:useBean>
  <c:set value="${theReason.exception.exception_title}" var="title"/>
</c:if>

        <table width="98%" border="0" cellpadding="2">
          <tr align="left">
            <td colspan="2">Exception Reason:&nbsp;<c:out value="${title}"/></td>
          </tr>
          <tr>
            <td>Start Date:</td>
            <td>
              <fmt:formatDate value="${start_date}" var="start_value" pattern="MM/dd/yy"/>
              <input type="text" name="start_date" size="15" value='<c:out value="${start_value}"/>'>
              <a href="##" onClick="cal1.select(editHours.start_date,'anchor1','MM/dd/yy'); return false;" title="cal1.select(editHours.start_date,'anchor1','MM/dd/yy'); return false;" name="anchor1" id="anchor1">
                <img src="images/show-calendar.gif" width=24 height=22 border=0 alt="">
              </a>
            </td>
          </tr>
          <tr>
            <td>End Date:</td>
            <td>
              <fmt:formatDate value="${end_date}" var="end_value" pattern="MM/dd/yy"/>
              <input type="text" name="end_date" size="15" value='<c:out value="${end_value}"/>'>
              <a href="##" onClick="cal2.select(editHours.end_date,'anchor2','MM/dd/yy'); return false;" title="cal2.select(editHours.end_date,'anchor2','MM/dd/yy'); return false;" name="anchor2" id="anchor2">
                <img src="images/show-calendar.gif" width=24 height=22 border=0 alt="">
              </a>
            </td>
          </tr>
        </table>
