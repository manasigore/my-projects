
<html>
<head>

<title>SENIOR MANAGEMENT MAIN MENU</title>


<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>




<script type="text/javascript">

  function Business(f)
  {
	     window.open(f.t1.value);
    
  }

  function Gaming(f)
  {
	    window.open(f.t2.value);
    
  }

  function Standard(f)
  {
	  window.open(f.t3.value);
    
  }

  function Service(f)
  {
	    window.open(f.t5.value);
    
  }

  function Survey(f)
  {
	   window.open(f.t4.value);
    
  }

  function Logout()
  {
	   window.close();
	   window.open("Logout.jsp");
    
  }


</script>


</head>
<body background="Images\contact.jpg" width="200" height="228" >

<form name="f">

<pre>                                                                                                   <input type="button" name="b1" value="LOG-OUT" onClick="Logout()"> 
 </pre>
 
<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>REPORT MENU&nbsp; </i></font> </legend>
                  <br>
                  
BUSINESS PHONE FEEDBACK REPORT  &nbsp;<input type="button" name="b1" value="VIEW PDF" name="BUSINESS PHONE REPORT" onClick="Business(f)"> <br><br><br>
GAMING PHONE FEEDBACK REPORT &nbsp;<input type="button" name="b1" value="VIEW PDF" name="GAMING PHONE REPORT" onClick="Gaming(f)"> <br><br><br>
STANDARD PHONE FEEDBACK REPORT &nbsp;<input type="button" name="b1" value="VIEW PDF" name="STANDARD PHONE REPORT" onClick="Standard(f)"><br><br><br>
SERVICE FEEDBACK REPORT &nbsp;<input type="button" name="b1" value="VIEW PDF" name="SERVICE PHONE REPORT" onClick="Service(f)"><br><br><br>
SURVEY  FEEDBACK REPORT &nbsp;<input type="button" name="b1" value="VIEW PDF" name="SURVEY  REPORT" onClick="Survey(f)"><br><br><br>


<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_BusinessPhone" />

<input type="hidden" name="t2" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_GamingPhone" />

<input type="hidden" name="t3" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_StandardPhone" />

<input type="hidden" name="t4" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_Survey" />

<input type="hidden" name="t5" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_ServiceFeedback" />

   
    
</fieldset>
  
</form>


</body>
</html>