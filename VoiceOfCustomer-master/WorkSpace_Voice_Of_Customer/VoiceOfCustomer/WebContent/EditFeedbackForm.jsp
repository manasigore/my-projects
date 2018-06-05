<%@ page  import="com.bapu.java.*, java.sql.*"  %>

<html>

<head>

<style type="text/css">

input.groovybutton
{
   font-style:italic;
}

</style>


<style type="text/css">

input.groovybutton
{
   font-style:italic;
}

</style>




<title>
EDIT  FEEDBACK  FORM
</title>





<script type="text/javascript">

function Check(form)
{

   if(form.Q1.value=="" || form.Q2.value=="" || form.Q3.value=="" || form.Q4.value=="" || form.Q5.value=="" || form.Q6.value=="" || form.Q7.value=="" || form.Q8.value=="" || form.Q9.value=="" || form.Q10.value=="")
   {
    alert("Some or all Question Fields are left Blank \n Please Fill Them !!!");
   }
   
   else
   {
    
    form.submit();
    
   }

}

</script>





</head>




<%


try
{



String ctype = request.getParameter("ctype");


System.out.println("EDIT JSP GOT = "+ctype);

String s[] = new String[10];





if(ctype.equals("BUSINESS"))
{
	
	
	
	
	try
	{
		DB_DB2_Connect db = new DB_DB2_Connect();
		
		ResultSet rs = db.s.executeQuery("    SELECT * FROM BUSINESS_QUESTION  ");
		
		
		
		int i=0;
		
		while(rs.next())
		{
			s[i] = rs.getString("QUESTION");
			
			System.out.println(s[i]);
			
			i++;
		}
		
		
	}

	catch(Exception e)
	{
		
	}
	
	//String s[] = {"ABC","PQR","XYZ","MNO" };
	
	
%>	

<fieldset>
		<legend><font size="4" color="#2E9AFE"><i>UPDATE BUSINESS FEEDBACK FORM :&nbsp; </i></font> </legend>



<body background="Images\edit.jpg" width="200" height="228" >

<form name="form" action="/VoiceOfCustomer/UpdateQuestion" method="POST">

    <input type="hidden" name="ctype" value="BUSINESS" />



Q1: <input type="text" name="Q1"  size="100"  value=    >                    

<hr><br>

Q2: <input type="text" name="Q2" size="100" value= >    

<hr><br>

Q3: <input type="text" name="Q3" size="100" value= >      

<hr><br>


Q4: <input type="text" name="Q4" size="100" value= >     

<hr><br>

Q5: <input type="text" name="Q5" size="100" value= >   

<hr><br>

Q6: <input type="text" name="Q6" size="100" value= >   

<hr><br>

Q7: <input type="text" name="Q7" size="100" value= >   

<hr><br>

Q8: <input type="text" name="Q8" size="100" value= >   

<hr><br>

Q9: <input type="text" name="Q9" size="100" value= >   

<hr><br>

Q10: <input type="text" name="Q10" size="100" value= > 
 
 <hr><br>

<PRE>                                                     <input    type="button"   name="groovybtn1"   class="groovybutton"   value=">> UPDATE <<"   title=""  onClick="Check(form)" /></PRE>
 
</form>


<form name="groovyform" action="/VoiceOfCustomer/ContactDepartmentMainMenu.jsp">


<PRE>                                                                                         <input   type="submit"   name="groovybtn1"   class="groovybutton"   value=">> EXIT TO MAIN MENU <<"   title=""   /></PRE>
</form>
 



</body></fieldset>
<%
}


if(ctype.equals("GAMING"))
{
	

	
	try
	{
		DB_DB2_Connect db = new DB_DB2_Connect();
		
		ResultSet rs = db.s.executeQuery("    SELECT * FROM GAMING_QUESTIONS  ");
		
		
		
		int i=0;
		
		while(rs.next())
		{
			s[i] = rs.getString("QUESTION");
			i++;
		}
		
		
	}

	catch(Exception e)
	{
		
	}
	
	
	
	
	
%>


<fieldset>
		<legend><font size="4" color="#2E9AFE"><i>UPDATE GAMING FEEDBACK FORM :&nbsp; </i></font> </legend>



<body  background="Images\edit.jpg" width="200" height="228" >

<form name="form" action="/VoiceOfCustomer/UpdateQuestion" method="POST">
  <input type="hidden" name="ctype" value="GAMING" />




Q1: <input type="text" name="Q1" size="100" value= >                    

<hr><br>

Q2: <input type="text" name="Q2" size="100" value= >    

<hr><br>

Q3: <input type="text" name="Q3" size="100" value= >      

<hr><br>



Q4: <input type="text" name="Q4" size="100" value= >      

<hr><br>



Q5: <input type="text" name="Q5" size="100" value= > 

<hr><br>



Q6: <input type="text" name="Q6" size="100" value= > 

<hr><br>



Q7: <input type="text" name="Q7" size="100" value= > 

<hr><br>



Q8: <input type="text" name="Q8" size="100" value= > 

<hr><br>



Q9: <input type="text" name="Q9" size="100" value= > 

<hr><br>



Q10: <input type="text" name="Q10" size="100" value= > 
<hr><br>

<PRE>                                                     <input    type="button"   name="groovybtn1"   class="groovybutton"   value=">> UPDATE <<"   title=""  onClick="Check(form)" /></PRE>
 
</form>


<form name="groovyform" action="/VoiceOfCustomer/ContactDepartmentMainMenu.jsp">


<PRE>                                                                                         <input   type="submit"   name="groovybtn1"   class="groovybutton"   value=">> EXIT TO MAIN MENU <<"   title=""   /></PRE>
</form>



</body></fieldset>
	
	
	
<%	
}




if(ctype.equals("STANDARD"))
{
	

	
	try
	{
		DB_DB2_Connect db = new DB_DB2_Connect();
		
		ResultSet rs = db.s.executeQuery("    SELECT * FROM STANDARD_QUESTION  ");
		
		
		
		int i=0;
		
		while(rs.next())
		{
			s[i] = rs.getString("QUESTION");
			i++;
		}
		
		
	}

	catch(Exception e)
	{
		
	}
	
	
	
	
	
%>


<fieldset>
		<legend><font size="4" color="#2E9AFE"><i>UPDATE STANDARD FEEDBACK FORM :&nbsp; </i></font> </legend>



<body  background="Images\edit.jpg" width="200" height="228" >

<form name="form" action="/VoiceOfCustomer/UpdateQuestion" method="POST">
  <input type="hidden" name="ctype" value="STANDARD" />




Q1: <input type="text" name="Q1" size="100" value= >                    

<hr><br>

Q2: <input type="text" name="Q2" size="100" value= >    

<hr><br>

Q3: <input type="text" name="Q3" size="100" value= >      

<hr><br>



Q4: <input type="text" name="Q4" size="100" value= >      

<hr><br>



Q5: <input type="text" name="Q5" size="100" value= > 

<hr><br>



Q6: <input type="text" name="Q6" size="100" value= > 

<hr><br>



Q7: <input type="text" name="Q7" size="100" value= > 

<hr><br>



Q8: <input type="text" name="Q8" size="100" value= > 

<hr><br>



Q9: <input type="text" name="Q9" size="100" value= > 

<hr><br>



Q10: <input type="text" name="Q10" size="100" value= > 
<hr><br>

<PRE>                                                     <input    type="button"   name="groovybtn1"   class="groovybutton"   value=">> UPDATE <<"   title=""  onClick="Check(form)" /></PRE>
 
</form>


<form name="groovyform" action="/VoiceOfCustomer/ContactDepartmentMainMenu.jsp">


<PRE>                                                                                         <input   type="submit"   name="groovybtn1"   class="groovybutton"   value=">> EXIT TO MAIN MENU <<"   title=""   /></PRE>
</form>



</body></fieldset>
	
	
	
<%	
}




if(ctype.equals("SURVEY"))
{
	

	
	try
	{
		DB_DB2_Connect db = new DB_DB2_Connect();
		
		ResultSet rs = db.s.executeQuery("    SELECT * FROM SURVEY_QUESTION  ");
		
		
		
		int i=0;
		
		while(rs.next())
		{
			s[i] = rs.getString("QUESTION");
			i++;
		}
		
		
	}

	catch(Exception e)
	{
		
	}
	
	
	
	
	
%>


<fieldset>
		<legend><font size="4" color="#2E9AFE"><i>UPDATE SURVEY FEEDBACK FORM :&nbsp; </i></font> </legend>



<body  background="Images\edit.jpg" width="200" height="228" >

<form name="form" action="/VoiceOfCustomer/UpdateQuestion" method="POST">
  <input type="hidden" name="ctype" value="SURVEY" />




Q1: <input type="text" name="Q1" size="100" value= >                    

<hr><br>

Q2: <input type="text" name="Q2" size="100" value= >    

<hr><br>

Q3: <input type="text" name="Q3" size="100" value= >      

<hr><br>



Q4: <input type="text" name="Q4" size="100" value= >      

<hr><br>



Q5: <input type="text" name="Q5" size="100" value= > 

<hr><br>



Q6: <input type="text" name="Q6" size="100" value= > 

<hr><br>



Q7: <input type="text" name="Q7" size="100" value= > 

<hr><br>



Q8: <input type="text" name="Q8" size="100" value= > 

<hr><br>



Q9: <input type="text" name="Q9" size="100" value= > 

<hr><br>



Q10: <input type="text" name="Q10" size="100" value= > 
<hr><br>

<PRE>                                                     <input    type="button"   name="groovybtn1"   class="groovybutton"   value=">> UPDATE <<"   title=""  onClick="Check(form)" /></PRE>
 
</form>


<form name="groovyform" action="/VoiceOfCustomer/ContactDepartmentMainMenu.jsp">


<PRE>                                                                                         <input   type="submit"   name="groovybtn1"   class="groovybutton"   value=">> EXIT TO MAIN MENU <<"   title=""   /></PRE>
</form>


</body></fieldset>
	
	
	
<%	
}



}
catch(Exception ff)
{
	response.sendRedirect("EmployeeLogin.jsp");
	
}



%>











  


</html>
