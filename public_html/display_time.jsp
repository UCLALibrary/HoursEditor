<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/taglibs/string-1.1" prefix="string"%>

<string:substring var="rawHour" start="0" end="2"><c:out value="${param.time}"/></string:substring>

<string:substring var="minutes" start="3" end="5"><c:out value="${param.time}"/></string:substring>

<c:choose>
  <c:when test="${rawHour eq 0}">
    <c:set value="Midnight" var="outTime"/>
  </c:when>
  <c:when test="${rawHour gt 0 and rawHour lt 12}">
    <c:set value="${rawHour}" var="formatHour"/>
    <c:set value="${formatHour}:${minutes} AM" var="outTime"/>
  </c:when>
  <c:when test="${rawHour eq 12}">
    <c:set value="Noon" var="outTime"/>
  </c:when>
  <c:otherwise>
    <c:set value="${rawHour - 12}" var="formatHour"/>
    <c:if test="${formatHour lt 10}">
      <c:set value="0${formatHour}" var="formatHour"/>
    </c:if>
    <c:set value="${formatHour}:${minutes} PM" var="outTime"/>
  </c:otherwise>
</c:choose>
<c:out value="${outTime}" escapeXml="true"/>
