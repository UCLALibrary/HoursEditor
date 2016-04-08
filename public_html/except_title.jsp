<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="reason" value=""/>
<c:set var="start_date" value=""/>
<c:set var="end_date" value=""/>

<c:if test="${! param.has_special_range}">

  <jsp:useBean id="thePeriod" 
               class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
    <jsp:setProperty name="thePeriod" property="periodId" param="period_id"/>
    <jsp:setProperty name="thePeriod" property="sourceName" value="${initParam['db.source']}"/>                   
  </jsp:useBean>
  <c:set value="${thePeriod.period.period_title}" var="reason"/>
  <c:set value="${thePeriod.period.start_date}" var="start_date"/>
  <c:set value="${thePeriod.period.end_date}" var="end_date"/>

</c:if>

<c:if test="${param.has_special_range}">

  <jsp:useBean id="theSpecial"
               class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleSpecialExceptionWebBean">
    <jsp:setProperty name="theSpecial" property="scheduleId" param="schedule_id"/>
    <jsp:setProperty name="theSpecial" property="sourceName" value="${initParam['db.source']}"/>                   
  </jsp:useBean>
  <c:set value="${theSpecial.exception.start_date}" var="start_date"/>
  <c:set value="${theSpecial.exception.end_date}" var="end_date"/>
  <jsp:useBean id="theReason"
               class="edu.ucla.library.libservices.scheduler.beans.webbeans.ScheduleExceptionWebBean">
    <jsp:setProperty name="theReason" property="exceptionID" value="${theSpecial.exception.exception_id}"/>
    <jsp:setProperty name="theReason" property="sourceName" value="${initParam['db.source']}"/>                   
  </jsp:useBean>
  <c:set value="${theReason.exception.exception_title}" var="reason"/>

</c:if>

<tr align="left">
  <td colspan="5">
    <input type="checkbox" name="schedule" value='${param.schedule_id}'>
    &nbsp;
    <fmt:formatDate value="${start_date}" pattern="MM/dd/yy"/>
    -
    <fmt:formatDate value="${end_date}" pattern="MM/dd/yy"/>
    &nbsp;
    (<c:out value="${reason}"/>)
  </td>
</tr>
