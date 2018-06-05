
<html>
<head>

<title>REGISTRATION SUCCESS</title>



<%

     session = request.getSession();
     String s = (String)session.getAttribute("C");
     
     if(s==null)
     {
    	 response.sendRedirect("CustomerRegistration.jsp");
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

<br><br>


<pre>    <font size="20" color="#696969"> <i></>REGISTRATION PROCESSS COMPLETE <i></font></pre><br>



<pre>                                    <font size="4" color="black"> <i></>You will receive Feedback and Survey Forms on regular basis  <i></font></pre><br>


<pre>                                               <input type="button" name="b1" value="CLOSE WINDOW" onClick="Logout()"> 
 </pre>


</body>
</html>