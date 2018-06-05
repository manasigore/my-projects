
<html>
<head>

<title>SERVER DOWN</title>




<%

     session = request.getSession();
     String s = (String)session.getAttribute("C");
     
     if(s==null)
     {
    	 response.sendRedirect("ErrorPage.jsp");
     }
     

%>





<script type="text/javascript">



  function Logout()
  {
	   window.close();
    
  }


</script>

</head>
<body background="Images/fail.jpg" width="200" height="228" >

<br><br><br><br>


<pre><font size="20" color="#696969"> <i></>REGISTRATION  PROCESS  FAILED <i></font></pre>

<br>

<pre><font size="5" color="black" > <i></>User Already Exist OR Server Not Available<i></font></pre><br>
<pre><font size="5" color="black" > <i></>New Users, Please try again after sometime<i></font></pre>
<pre>                                               <input type="button" name="b1" value="CLOSE WINDOW" onClick="Logout()"> 
 </pre>


</body>
</html>