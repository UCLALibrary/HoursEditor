<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
          <tr align="center">
            <c:if test="${param.isException}">
              <c:set value="" var="isChecked"/>
              <c:if test="${not empty param.selected}"><c:set value=" checked" var="isChecked"/></c:if>
              <td>
                <input type="checkbox" name='${param.dayValue}' value="1" ${isChecked}>
              </td>
            </c:if>
            <c:if test="${! param.isException}">
              <input type="hidden" name='${param.dayValue}' value="1">
            </c:if>
            <td>${param.day}.</td>
            <td>
              <select name='${param.prefix}_O'>
                <option value="-1"></option>
                <c:import url="hours_list_edit.jsp">
                  <c:param name="time" value="${param.opens}"/>
                </c:import>
              </select>
            </td>
            <td>
              <select name='${param.prefix}_C'>
                <option value="-1"></option>
                <c:import url="hours_list_edit.jsp">
                  <c:param name="time" value="${param.closes}"/>
                </c:import>
              </select>
            </td>
            <td>
              <c:set value="" var="closed"/>
              <c:if test="${param.isClosed}"> <c:set value=" checked" var="closed"/> </c:if>
              <input type="checkbox" name='${param.prefix}_Closed' value="1" ${closed}>
            </td>
            <td>
              <input type="text" name='${param.prefix}_Note' size="30" maxlength="255" value='${param.note}'>
            </td>
          </tr>
