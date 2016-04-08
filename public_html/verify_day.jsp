<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

            <tr>
              <td align="center">
                ${param.dayName}.
                <c:if test="${param.isExcept}">
                  <input type="hidden" name='${param.dayParam}' value="1">
                </c:if>
              </td>
              <td align="center">
                <c:if test="${param.opens eq '-1'}">
                  N/A
                </c:if>
                <c:if test="${param.opens ne '-1'}">
                  <c:import url="display_time.jsp">
                    <c:param name="time" value="${param.opens}"/>
                  </c:import>
                </c:if>
                <input type="hidden" name='${param.prefix}_O' value='${param.opens}'>
              </td>
              <td align="center">
                <c:if test="${param.closes eq '-1'}">
                  N/A
                </c:if>
                <c:if test="${param.closes ne '-1'}">
                  <c:import url="display_time.jsp">
                    <c:param name="time" value="${param.closes}"/>
                  </c:import>
                </c:if>
                <input type="hidden" name='${param.prefix}_C' value='${param.closes}'>
              </td>
              <td align="center">
                <c:if test="${not empty param.closed and param.closed}">
                  Closed.
                  <input type="hidden" name='${param.prefix}_Closed' value="1">
                </c:if>
              </td>
              <td align="center">
                ${param.note}
                <input type="hidden" name='${param.prefix}_Note' value='${param.note}'>
              </td>
            </tr>  
