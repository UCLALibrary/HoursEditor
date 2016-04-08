<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=utf-8" errorPage="/errors.jsp"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Add Exception Reason</title>
    <link rel="stylesheet" type="text/css" href="css/display.css"/>
    <style type="text/css">
      body {
      background-color: #ffffff; 
}
    </style>
    <script type="text/javascript">
      function trimText(formObj) 
      { 
        /* 
        Rajender Singh 
        29-12-2003 
        
        This function trims all the text field on the form object 
        */ 
        for (var i = 0; i < formObj.elements.length; i++)  
        { 
          if(formObj.elements[i].type == "text" || formObj.elements[i].type == "textarea") 
          { 
            var textvalue =formObj.elements[i].value ; 
            formObj.elements[i].value = textvalue.replace(/^(\s+)/,"").replace(/(\s+)$/,"");	 
          } 
        } 
      }
      
      function validate(formObj)
      {
        trimText(formObj);
        if ( formObj.title.value == '' )
        {
          alert("Please enter a name for the exception");
        }
      }
    </script>
  </head>
  <body>
    <table width="98%" border="0" cellpadding="2">
      <tr align="left">
        <td>
          <a href="index.jsp" class="menu">Home</a>
        </td>
      </tr>
      <tr align="left">
        <td>
          <a href="AdminMenu.jsp" class="menu">Admin Menu</a>
        </td>
      </tr>
    </table>
    <table width="98%" border="0" cellpadding="2">
      <tr align="left" bgcolor="#FFEE00">
        <td>Enter the name for a new exception reason</td>
      </tr>
    </table>
    <form name="addExcept" action="addexcept" method="POST" onsubmit="return validate(addExcept)">
      <table>
        <tr align="left">
          <td align="right">
            Exception Title:
          </td>
          <td align="left">
            <input type="text" name="exception_title" size="40" maxlength="255" value="">
          </td>
        </tr>
        <tr align="left">
          <td colspan="2">
            <input type="submit" name="submit" value="Enter">
            <img src="images/1pix.gif" hspace="35" height="1" width="1" border="0" alt="">
            <input type="Reset" value="Reset" name="Reset">
          </td>
        </tr>
      </table>
      <input type="hidden" name="type" value="except"/>
      <input type="hidden" name="method" value="add"/>
    </form>
  </body>
</html>