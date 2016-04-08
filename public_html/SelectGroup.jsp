<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean class="edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean" id="unitGroups"/>
<jsp:setProperty name="unitGroups" property="sourceName" value="${initParam['db.source']}"/>
<%--jsp:setProperty name="unitGroups" property="sourceName" value='<%= application.getInitParameter("db.source") %>'/--%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Select Library Group</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
    </style>
  </head>
  <body>
    <table width="98%" border="0" cellpadding="2">
      <tr align="left">
        <td>
          <a href="index.jsp" class="menu">Home</a>
        </td>
      </tr>
    </table>
    <table width="98%" border="0" cellpadding="2">
      <tr align="left" bgcolor="#FFEE00">
        <td>Select a library and click &quot;Continue&quot;</td>
      </tr>
    </table>
    <form action="unitcount" method="post">
      <table width="98%" border="0" cellpadding="2">
        <tr align="left"><td>UCLA Libraries</td></tr>
        <tr><td><hr size="1"></td></tr>
        <c:forEach var="theGroup" items="${unitGroups.allUnits}">
          <tr align="left">
            <td>
              <input type="radio" name="unit_group_id" value='${theGroup.unit_group_id}'>
              ${theGroup.unit_group_title}
            </td>
          </tr>
        </c:forEach>
        <tr><td><hr size="1"></td></tr>
        <tr align="left">
          <td>
            <input type="submit" name="submit" value="Continue">
            <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
            <input type="Reset" value="Reset" name="Reset">
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>