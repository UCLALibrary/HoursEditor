<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach var="clock" begin="0" end="23">

  <c:set value="" var="hour_selected"/>
  <c:set value="" var="quarter_selected"/>
  <c:set value="" var="half_selected"/>
  <c:set value="" var="threequarter_selected"/>

  <c:choose>
    <c:when test="${clock lt 10}">
      <c:set value="0${clock}" var="value_time"/>
    </c:when>
    <c:otherwise>
      <c:set value="${clock}" var="value_time"/>
    </c:otherwise>
  </c:choose>
  
  <c:choose>
    <c:when test="${clock eq 0}">
      <c:set value="12" var="display_time"/>
    </c:when>
    <c:when test="${clock gt 12}">
      <c:set value="${clock - 12}" var="display_time"/>
    </c:when>
    <c:otherwise>
      <c:set value="${clock}" var="display_time"/>
    </c:otherwise>
  </c:choose>
  
  <c:choose>
    <c:when test="${clock lt 12}">
      <c:set value="AM" var="amPm"/>
    </c:when>
    <c:otherwise>
      <c:set value="PM" var="amPm"/>
    </c:otherwise>
  </c:choose>

  <c:set value="${value_time}:00:00" var="hour_value"/>
  <c:set value="${value_time}:15:00" var="quarter_value"/>
  <c:set value="${value_time}:30:00" var="half_value"/>
  <c:set value="${value_time}:45:00" var="threequarter_value"/>

  <c:if test="${param.time eq hour_value}">
    <c:set value="selected" var="hour_selected"/>
  </c:if>
  <c:if test="${param.time eq quarter_value}">
    <c:set value="selected" var="quarter_selected"/>
  </c:if>
  <c:if test="${param.time eq half_value}">
    <c:set value="selected" var="half_selected"/>
  </c:if>
  <c:if test="${param.time eq threequarter_value}">
    <c:set value="selected" var="threequarter_selected"/>
  </c:if>
  
  <c:choose>
    <c:when test="${value_time eq '00'}">
      <option value='${hour_value}' ${hour_selected}>Midnight</option>
    </c:when>
    <c:when test="${value_time eq '12'}">
      <option value='${hour_value}' ${hour_selected}>Noon</option>
    </c:when>
    <c:otherwise>
      <option value='${hour_value}' ${hour_selected}>${display_time}:00 ${amPm}</option>
    </c:otherwise>
  </c:choose>  
  <option value='${quarter_value}' ${quarter_selected}>${display_time}:15 ${amPm}</option>
  <option value='${half_value}' ${half_selected}>${display_time}:30 ${amPm}</option>
  <option value='${threequarter_value}' ${threequarter_selected}>${display_time}:45 ${amPm}</option>
</c:forEach>