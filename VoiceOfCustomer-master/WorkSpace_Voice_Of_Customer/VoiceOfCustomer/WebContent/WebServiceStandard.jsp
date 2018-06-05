<%@page import="com.bapu.webservice.*,com.bapu.java.* , java.sql.*"%>


<html>

<head>


<title>WEB SERVICE STANDARD PHONE CUSTOMER DETAILS</title>

<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>






<script type="text/javascript">

function Open(f)
{
  
  
  window.open(f.t1.value);

}

</script>


</head>


<%

  WebServiceCaller wsc = new WebServiceCaller();

   boolean f1 = wsc.getCustomerDetails("STANDARD");

  if(f1==true)
  {
%>
	 
	  
<body background="Images/pdf.jpg" width="200" height="228" >

<br><br><br><br><br><br><br><br>
<form name="f">

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="20" color="#696969"> <i>PDF SUCCESSFULLY CREATED <i></font><br>

<br><br>

<pre>                                                <font size="5" color="#A9A9A9"> <i> <input type="button" onClick="Open(f)" value="VIEW PDF"/>  </i></font></pre>

<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_CustomerDetails" />  


<pre>                                           <font size="4" color="#A9A9A9"> <i>  <a href="WebServiceMainMenu.jsp"  >GO TO MAIN MENU</a>  </i></font></pre>



</form>

</body>
	  
	  
	  
<%
  }
  
  else
  {
%>
    
<body background="Images/pdf.jpg" width="200" height="228" >

<br><br><br><br><br><br><br><br>
<form name="f">

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="20" color="#696969"> <i>PDF CREATION FAILED <i></font><br>

<br><br>



<pre>                                          <font size="4" color="#A9A9A9"> <i>  <a href="WebServiceMainMenu.jsp"  >GO TO MAIN MENU</a>  </i></font></pre>



</form>

</body>

<%	  
  }

%>






</html>