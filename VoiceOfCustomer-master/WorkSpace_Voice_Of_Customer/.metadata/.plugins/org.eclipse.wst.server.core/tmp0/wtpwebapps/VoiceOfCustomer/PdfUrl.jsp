
<html>
<head>

<title>PDF CREATION SUCCESS</title>





<%

try
{

  String pdfurl =  (String) request.getAttribute("PDFPATH");
  
  

  
  
 

  System.out.println("IN PDF JSP SUCCESS"+pdfurl);
  


%>


<script type="text/javascript">

function Open(f)
{
  
  
  window.open(f.t1.value);

}

</script>




</head>


<body background="Images/pdf.jpg" width="200" height="228" >

<br><br><br><br><br><br><br><br>
<form name="f">

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="20" color="#696969"> <i>PDF SUCCESSFULLY CREATED <i></font><br>

<br><br>

<pre>                                                <font size="5" color="#A9A9A9"> <i> <input type="button" onClick="Open(f)" value="VIEW PDF"/>  </i></font></pre>

<% 
if( pdfurl.equals("B") )
{%>
	<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_BusinessPhone" />
<% }%>

 <%
 if( pdfurl.equals("G") )
{%>
	<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_GamingPhone" />
	<%}%>
 
  <%if( pdfurl.equals("S") )
{%>
	<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_StandardPhone" />
	 <%}%>
  
  <%if( pdfurl.equals("SU") )
{%>
	<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_Survey" />
	 <%}%>

  <%if( pdfurl.equals("SE") )
{%>
	<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_ServiceFeedback" />
	 <%}%>


<pre>                                            <font size="4" color="#A9A9A9"> <i>  <a href="ContactDepartmentMainMenu.jsp"  >GO TO MAIN MENU</a>  </i></font></pre>



</form>


<%
}

catch(Exception ee)
{
	response.sendRedirect("EmployeeLogin.jsp");
}

%>


</body>

</html>