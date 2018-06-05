<%@ page import="com.bapu.java.*,java.sql.*,java.util.ArrayList,java.util.*"%>

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
SERVICE FEEDBACK FORM
</title>


</head>




<%


ArrayList<String> qholder = new ArrayList<String>();


try {
	DB_DB2_Connect db = new DB_DB2_Connect();
	
	ResultSet rs = db.s.executeQuery("    SELECT * FROM SERVICE_QUESTION  ");
	
	while( rs.next() )
	{
		
		qholder.add(  rs.getString("QUESTION")  );
		
	}
	
	 int listsize = qholder.size();
	    
	 String s[] = new String[listsize];
	    int j=0;
	    
	    Iterator<String> i = qholder.iterator();
	    
	    while (  i.hasNext() )
	    {
	    	s[j] = i.next();
	    	
	    	j++;
	    	
	    }
	    
	    
	    System.out.println("s[0] = "+ s[0] );
	    System.out.println("s[9] = "+ s[9] );
	
	
	
	
%>




  


<fieldset>
		<legend><font size="4" color="#2E9AFE"><i>SERVICE FEEDBACK FORM :&nbsp; </i></font> </legend>



<body background="Images/feedback.jpg" width="200" height="228" >

<form name="servicefeedbackform" action="/VoiceOfCustomer/ReceivedFeedbackForm" method="POST">


<input type="hidden" name="ctype" value="SERVICE" />



Q1:<%=s[0] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q1" value="<%=s[0] %> is GOOD">               GOOD    
<input type="radio" name="Q1" value="<%=s[0] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q1" value="<%=s[0] %> is BAD">                BAD    

<hr><br>

Q2:<%=s[1] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q2" value="<%=s[1] %> is GOOD">               GOOD    
<input type="radio" name="Q2" value="<%=s[1] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q2" value="<%=s[1] %> is BAD">                BAD    

<hr><br>

 Q3:<%=s[2] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q3" value="<%=s[2] %> is GOOD">               GOOD    
<input type="radio" name="Q3" value="<%=s[2] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q3" value="<%=s[2] %> isBAD">                BAD    

<hr><br>



Q4:<%=s[3] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q4" value="<%=s[3] %> is GOOD">               GOOD    
<input type="radio" name="Q4" value="<%=s[3] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q4" value="<%=s[3] %> is BAD">                BAD 

<hr><br>

Q5:<%=s[4] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q5" value="<%=s[4] %> is GOOD">               GOOD    
<input type="radio" name="Q5" value="<%=s[4] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q5" value="<%=s[4] %> is BAD">                BAD    

<hr><br>

Q6:<%=s[5] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q6" value="<%=s[5] %> is GOOD">               GOOD    
<input type="radio" name="Q6" value="<%=s[5] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q6" value="<%=s[5] %> is BAD">                BAD    

<hr><br>

Q7:<%=s[6] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q7" value="<%=s[6] %> is GOOD">               GOOD    
<input type="radio" name="Q7" value="<%=s[6] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q7" value="<%=s[6] %> is BAD">                BAD    

<hr><br>

Q8:<%=s[7] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q8" value="<%=s[7] %> is GOOD">               GOOD    
<input type="radio" name="Q8" value="<%=s[7] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q8" value="<%=s[7] %> is BAD">                BAD    

<hr><br>

Q9:<%=s[8] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q9" value="<%=s[8] %> is GOOD">               GOOD    
<input type="radio" name="Q9" value="<%=s[8] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q9" value="<%=s[8] %> is BAD">                BAD    

<hr><br>

Q10:<%=s[9] %> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q10" value="<%=s[9] %> is GOOD">               GOOD    
<input type="radio" name="Q10" value="<%=s[9] %> is AVERAGE" checked>        AVG   
<input type="radio" name="Q10" value="<%=s[9] %> is BAD">                BAD       

<hr><br><br>
<font size = 4 color="#696969"><i>
Comment : <input type="text" name="COMMENT" size="100" maxlength="75" ></i> </font><br><br>

<I>*NOTE: Comment should be in not more then 75 Words 

<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input
   type="submit"
   name="groovybtn1"
   class="groovybutton"
   value=">> SUBMIT <<"
   title=""/>
   
   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<form name="groovyform">
<input
   type="button"
   name="groovybtn1"
   class="groovybutton"
   value="    >> EXIT <<     "
   title="">
</form>
 


</form>
</body></fieldset>

<%	
}

catch(Exception e)
{
	response.sendRedirect("EmployeeLogin.jsp");
}
%>


</html>
