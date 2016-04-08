<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="theDay" class="edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean">
 <jsp:setProperty name="theDay" property="dayOfWeek" param="dayName"/>
 <jsp:setProperty name="theDay" property="scheduleID" param="schedule"/>
 <jsp:setProperty name="theDay" property="sourceName" value="${initParam['db.source']}"/>                   
</jsp:useBean>

<c:set var="theHours" value="${theDay.dailyHour}"/>

            <c:if test="${not empty theHours}">
              <tr align="center">
                <td>${param.dayName}.</td>
                <td>${theHours.opens}</td>
                <td>${theHours.closes}</td>
                <td><c:if test="${theHours.is_closed}">Closed</c:if></td>
                <td>${theHours.note}</td>
              </tr>
            </c:if>