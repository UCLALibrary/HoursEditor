<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="theUnit" class="edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean">
 <jsp:setProperty name="theUnit" property="sourceName" value="${initParam['db.source']}"/>                   
 <jsp:setProperty name="theUnit" property="unitId" param="unit"/>
</jsp:useBean>

<jsp:useBean id="thePeriod" class="edu.ucla.library.libservices.scheduler.beans.webbeans.PeriodWebBean">
 <jsp:setProperty name="thePeriod" property="sourceName" value="${initParam['db.source']}"/>                   
 <jsp:setProperty name="thePeriod" property="periodId" param="period"/>
</jsp:useBean>

        <table width="98%" border="0" cellpadding="2">
          <tr align="left">
            <td>
              UCLA Libraries: ${theUnit.unit.unit_title}
            </td>
          </tr>
          <tr align="left">
            <td>
              Academic Period: ${thePeriod.period.period_title} &nbsp;
              (<fmt:formatDate pattern="MMM d, yyyy" value="${thePeriod.period.start_date}"/>
              -
              <fmt:formatDate pattern="MMM d, yyyy" value="${thePeriod.period.end_date}"/>)
            </td>
          </tr>
          <tr><td><hr size="1"></td></tr>
        </table>
