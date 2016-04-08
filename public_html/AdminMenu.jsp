<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Administration Menu</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
      .title {
        font-family: Verdana, Arial, Helvetica, sans-serif;
        font-weight: bold;
        font-style: oblique;
        font-size: medium;
      }
      .section {
        background-color: #FFEE00;
        font-family: Verdana, Arial, Helvetica, sans-serif;
        font-weight: bold;
        font-size: small;
      }
      .link {
        font-family: Verdana, Arial, Helvetica, sans-serif;
        font-weight: bold;
        font-size: x-small;
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
    <table width="98%">
      <tr>
        <td class="title">
          Library Schedule Administration
        </td>
      </tr>
      <!--tr>
        <td class="section">
          ADD/EDIT GROUPS:
        </td>
      </tr>
      <tr>
        <td>
          <a href="AddGroup.jsp" class="link">ADD LIBRARY GROUP</a><br>
          <img src="images/1pix.gif" vspace="3" height="1" width="1" border="0" alt=""><br>
          <a href="EditGroup.jsp" class="link">EDIT LIBRARY GROUP</a><br>
          <img src="images/1pix.gif" vspace="10" height="1" width="1" border="0" alt="">
        </td>
      </tr>
      <tr>
        <td class="section">
          ADD/EDIT UNITS:
        </td>
      </tr>
      <tr>
        <td>
          <a href="AddLibrary.jsp" class="link">ADD LIBRARY UNIT</a><br>
          <img src="images/1pix.gif" vspace="3" height="1" width="1" border="0" alt=""><br>
          <a href="EditLibrary.jsp" class="link">EDIT LIBRARY UNIT</a><br>
          <img src="images/1pix.gif" vspace="10" height="1" width="1" border="0" alt="">
        </td>
      </tr-->
      <tr>
        <td class="section">
          ADD/EDIT PERIODS:
        </td>
      </tr>
      <tr>
        <td>
          <a href="AddPeriod.jsp" class="link">ADD PERIOD/HOLIDAY</a><br>
          <img src="images/1pix.gif" vspace="3" height="1" width="1" border="0" alt=""><br>
          <a href="EditPeriod.jsp" class="link">EDIT PERIOD/HOLIDAY</a><br>
          <img src="images/1pix.gif" vspace="10" height="1" width="1" border="0" alt="">
        </td>
      </tr>
      <tr>
        <td class="section">
          ADD/EDIT EXCEPTIONS:
        </td>
      </tr>
      <tr>
        <td>
          <a href="AddExcept.jsp" class="link">ADD EXCEPTION</a><br>
          <img src="images/1pix.gif" vspace="3" height="1" width="1" border="0" alt=""><br>
          <a href="EditExcept.jsp" class="link">EDIT EXCEPTION</a><br>
          <img src="images/1pix.gif" vspace="10" height="1" width="1" border="0" alt="">
        </td>
      </tr>
    </table>
  </body>
</html>