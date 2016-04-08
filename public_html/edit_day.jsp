<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="theDay" class="edu.ucla.library.libservices.scheduler.beans.webbeans.DailyHourWebBean">
 <jsp:setProperty name="theDay" property="dayOfWeek" param="dayName"/>
 <jsp:setProperty name="theDay" property="scheduleID" param="schedule"/>
 <jsp:setProperty name="theDay" property="sourceName" value="${initParam['db.source']}"/>                   
</jsp:useBean>

<c:set var="theHours" value="${theDay.dailyHour}"/>

            <tr align="center">
              <c:if test="${param.isException}">
                <td>
                  <c:choose>
                    <c:when test="${not empty theHours and (not empty theHours.opens or theHours.is_closed)}">
                      <input type="checkbox" name='${param.dayParamName}' value="1" checked>
                    </c:when>
                    <c:otherwise>
                      <input type="checkbox" name='${param.dayParamName}' value="1">
                    </c:otherwise>
                  </c:choose>
                </td>
              </c:if>
              <c:if test="${! param.isException}">
                <input type="hidden" name='${param.dayValue}' value="1">
              </c:if>
              <td>${param.dayName}.</td>
              <td>
                <select name='${param.dayPrefix}_O'>
                  <option value="-1"></option>
                  <c:import url="hours_list_edit.jsp">
                    <c:param name="time" value="${theHours.opens}"/>
                  </c:import>
                </select>
              </td>
              <td>
                <select name='${param.dayPrefix}_C'>
                  <option value="-1"></option>
                  <c:import url="hours_list_edit.jsp">
                    <c:param name="time" value="${theHours.closes}"/>
                  </c:import>
                </select>
              </td>
              <td>
                <c:choose>
                   <c:when test="${theHours.is_closed}"> 
                    <input type="checkbox" name='${param.dayPrefix}_Closed' value="1" checked/>
                   </c:when>
                   <c:otherwise> 
                    <input type="checkbox" name='${param.dayPrefix}_Closed' value="1"/>
                   </c:otherwise>
                </c:choose>
              </td>
              <td>
                <input type="text" name='${param.dayPrefix}_Note' size="30" maxlength="255" value='${theHours.note}'>
              </td>
            </tr>
