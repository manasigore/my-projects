
<html>
<head>

<title>MAIL SENDING SUCCESS</title>




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


<pre><font size="20" color="black"> <i></>MAIL SUCCESSFULLY SENT TO CUSTOMERS <i></font></pre><br>

<br><br>

<pre>                                       <font size="5" color="#A9A9A9"> <i><a href="ContactDepartmentMainMenu.jsp">GO TO MAIN MENU<i></font></pre>




</body>
</html>