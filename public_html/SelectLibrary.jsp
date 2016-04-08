<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean class="edu.ucla.library.libservices.scheduler.beans.webbeans.UnitGroupWebBean" id="theGroup">
  <jsp:setProperty name="theGroup" property="sourceName" value="${initParam['db.source']}"/>
  <jsp:setProperty name="theGroup" property="unitGroupId" value="${sessionScope.group}"/>
</jsp:useBean>

<jsp:useBean id="units" class="edu.ucla.library.libservices.scheduler.beans.webbeans.UnitWebBean">
  <jsp:setProperty name="units" property="sourceName" value="${initParam['db.source']}"/>
  <jsp:setProperty name="units" property="unitGroupId" value="${sessionScope.group}"/>
</jsp:useBean>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Set Library Hours: Select Library Unit</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
    </style>
    <script language="JavaScript" type="text/javascript">
      function switchRadio(formObj)
      {
        var checkCount = 0;
        for ( i = 0; i < formObj.unit.length; i++)
        {
          if ( formObj.unit[ i ].checked )
            checkCount++;
        }
        if ( checkCount == 0 )
        {
          for ( j = 0; j < formObj.all_or_some.length; j++ )
          {
            if ( formObj.all_or_some[ j ].value == 'all' )
            {
              formObj.all_or_some[ j ].checked = true;
            }
          }
        }
        else
        {
          for ( k = 0; k < formObj.all_or_some.length; k++ )
          {
            if ( formObj.all_or_some[ k ].value == 'some' )
            {
              formObj.all_or_some[ k ].checked = true;
            }
          }
        }
      }
  
      function switchChecks(formObj)
      {
        for ( i = 0; i < formObj.unit.length; i++)
        {
          formObj.unit[ i ].checked = false;
        }
      }
    </script>
  </head>
  <body>
    <center>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left">
          <td>
            <a href="index.jsp" class="menu">Home</a>
          </td>
        </tr>
        <tr align="left">
          <td>
            <a href="SelectGroup.jsp" class="menu">Select New Library Group</a>
          </td>
        </tr>
      </table>
      <table width="98%" border="0" cellpadding="2">
        <tr align="left" bgcolor="#FFEE00">
          <td>Select &quot;All Units&quot; to assign the same hours
          to all library units; or &quot;Individual Units&quot; to
          assign hours to particular unit(s) (check the units to assign
          hours); and then click &quot;Continue&quot;</td>
        </tr>
      </table>
      <form name="selectUnit" action="preplibrary" method="post">
        <table width="98%" border="0" cellpadding="2">
          <tr align="left">
            <td>
              UCLA Libraries: 
              ${theGroup.unitGroup.unit_group_title} Units
            </td>
          </tr>
          <tr><td><hr size="1"></td></tr>
          <tr align="left">
            <td>
              <input type="radio" name="all_or_some" value="all" checked onClick="switchChecks(selectUnit)">All Units
              <c:forEach var="theUnit" items="${units.unitsByGroup}">
                <input type="hidden" name="unit_all" value='${theUnit.unit_id}'>
              </c:forEach>
            </td>
          </tr>
          <tr align="left"><td><b><i>OR</i></b></td></tr>
          <tr align="left">
            <td>
              <input type="radio" name="all_or_some" value="some">Individual Units
            </td>
          </tr>
          <c:forEach var="theUnit" items="${units.unitsByGroup}">
            <tr align="left">
              <td>
                <img src="images/1pix.gif" hspace="15" height="1" width="1" border="0" alt="">
                <input type="checkbox" name="unit" value='${theUnit.unit_id}' onClick="switchRadio(selectUnit)">
                ${theUnit.unit_title}
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
    </center>
  </body>
</html>