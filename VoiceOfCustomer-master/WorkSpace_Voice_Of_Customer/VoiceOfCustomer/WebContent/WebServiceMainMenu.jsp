
<html>
<head>

<title>WEBSERVICE MAIN MENU</title>


<title>WEB SERVICE CUSTOMER DETAILS MAIN MENU</title>

<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>



<script type="text/javascript">

function ContactDeptMainMenu(l)
{

  
  l.submit();

}

</script>



</head>
<body background="Images\contact.jpg" width="200" height="228" >

<form name="l" action="/VoiceOfCustomer/ContactDepartmentMainMenu.jsp">


<pre>                                                                                                   <input type="button" name="b1" value="Go To MainMenu" onClick="ContactDeptMainMenu(l);"> 
 </pre>
 
</form>
 


<form name="f" action="/VoiceOfCustomer/WebServiceBusiness.jsp">


 
<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>BUSINESS PHONE CUSTOMER REPORT</i></font> </legend>
                  <br>
                  
<input type="submit" name="b1" value="VIEW PDF"  > <br>
   
    
</fieldset>
  
</form>


<br>

<form name="f" action="/VoiceOfCustomer/WebServiceGaming.jsp">


 
<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>GAMING PHONE CUSTOMER REPORT</i></font> </legend>
                  <br>
                  
<input type="submit" name="b1" value="VIEW PDF"  > <br>
   
    
</fieldset>
  
</form>

<br>

<form name="f" action="/VoiceOfCustomer/WebServiceStandard.jsp">


 
<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>STANDARD PHONE CUSTOMER REPORT</i></font> </legend>
                  <br>
                  
<input type="submit" name="b1" value="VIEW PDF"  > <br>
   
    
</fieldset>
  
</form>
 
 
 


 


</body>
</html>