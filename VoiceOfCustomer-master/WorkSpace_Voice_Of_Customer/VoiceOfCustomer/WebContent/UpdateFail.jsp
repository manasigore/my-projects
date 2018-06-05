
<html>
<head>

<title>UPDATE FAIL</title>

<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>



</head>
<body background="Images/fail.jpg" width="200" height="228" >

<br><br><br><br>


<pre><font size="6" color="#696969"> <i></>NEW QUESTIONS NOT UPDATED TO DATABASE  <i></font></pre><br>






<pre><font size="5" color="black"> <i>  TRY AGAIN FROM MAIN MENU USING BELOW LINK   </i></font></pre>

<br><br>

<pre>                                      <font size="4" color="#A9A9A9"> <i>  <a href="ContactDepartmentMainMenu.jsp"  >GO TO MAIN MENU</a>  </i></font></pre>




</body>
</html>