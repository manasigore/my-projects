
<html>
<head>

<title>UPDATE SUCCESS</title>

<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>


</head>
<body background="Images/success.jpg" width="200" height="228" >

<br><br><br>


<pre>            <font size="6" color="#696969"> <i></>NEW QUESTIONS SUCCESSFULLY UPDATED TO DATABASE  <i></font></pre><br>

<br><br>

<pre>                                          <font size="4" color="#A9A9A9"> <i>  <a href="ContactDepartmentMainMenu.jsp"  >GO TO MAIN MENU</a>  </i></font></pre>




</body>
</html>