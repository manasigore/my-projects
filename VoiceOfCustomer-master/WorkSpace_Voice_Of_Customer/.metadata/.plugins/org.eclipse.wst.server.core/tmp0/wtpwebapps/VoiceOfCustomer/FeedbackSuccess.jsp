
<html>
<head>

<title>FEEDBACK SUBMISSION SUCCESS </title>



<%

     session = request.getSession();
     String s = (String)session.getAttribute("BF");
     
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
<body background="Images/success.jpg" width="200" height="228" >

<br><br><br>


<pre>     <font size="20" color="#696969"> <i></>FEEDBACK SUCCESSFULLY SUBMITTED <i></font></pre>
<br>

<pre>                                    <font size="5" color="black"> <i>YOU CAN NOW CLOSE THIS WINDOW<i></font></pre>

<pre>                                               <input type="button" name="b1" value="CLOSE WINDOW" onClick="Logout()"> 
 </pre>



</body>
</html>