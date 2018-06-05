<%@ page   import="java.util.*"  %>


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
SURVEY FORM
</title>





<script type="text/javascript">

function Close()
{
  this.close();
}

</script>













</head>




<%

//String s[] = {"ABC","PQR","XYZ","MNO" };

try
{

    ArrayList<String> li =  (ArrayList<String>)request.getAttribute("questions");
    
    System.out.println("JSP = "+li);
    System.out.println(li.size());
    
    int listsize = li.size();
    
    String s[] = new String[listsize];
    int j=0;
    
    Iterator<String> i = li.iterator();
    
    while (  i.hasNext() )
    {
    	s[j] = i.next();
    	
    	j++;
    	
    }
    
    
    System.out.println("s[0] = "+ s[0] );
    
    
    
    

%>



  


<fieldset>
		<legend><font size="4" color="#2E9AFE"><i>SURVEY FORM :&nbsp; </i></font> </legend>



<body background="Images/feedback.jpg" width="200" height="228" >

<form name="surveyform" action="/VoiceOfCustomer/ReceivedFeedbackForm" method="POST">

<input type="hidden" name="ctype" value="SURVEY" />


Q1: <%= s[0]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q1" value="<%= s[0]%> is GOOD">               GOOD    
<input type="radio" name="Q1" value="<%= s[0]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q1" value="<%= s[0]%> is BAD">                BAD    

<hr><br>

Q2: <%= s[1]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q2" value="<%= s[1]%> is GOOD">               GOOD    
<input type="radio" name="Q2" value="<%= s[1]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q2" value="<%= s[1]%> is BAD">                BAD    

<hr><br>

Q3: <%= s[2]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q3" value="<%= s[2]%> is GOOD">               GOOD    
<input type="radio" name="Q3" value="<%= s[2]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q3" value="<%= s[2]%> is BAD">                BAD    

<hr><br>


Q4: <%= s[3]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q4" value="<%= s[3]%> is GOOD">               GOOD    
<input type="radio" name="Q4" value="<%= s[3]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q4" value="<%= s[3]%> is BAD">                BAD   

<hr><br>

Q5: <%= s[4]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q5" value="<%= s[4]%> is GOOD">               GOOD    
<input type="radio" name="Q5" value="<%= s[4]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q5" value="<%= s[4]%> is BAD">                BAD   

<hr><br>

Q6: <%= s[5]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q6" value="<%= s[5]%> is GOOD">               GOOD    
<input type="radio" name="Q6" value="<%= s[5]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q6" value="<%= s[5]%> is BAD">                BAD   

<hr><br>

Q7: <%= s[6]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q7" value="<%= s[6]%> is GOOD">               GOOD    
<input type="radio" name="Q7" value="<%= s[6]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q7" value="<%= s[6]%> is BAD">                BAD    


<hr><br>

Q8: <%= s[7]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q8" value="<%= s[7]%> is GOOD">               GOOD    
<input type="radio" name="Q8" value="<%= s[7]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q8" value="<%= s[7]%> is BAD">                BAD    


<hr><br>

Q9: <%= s[8]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q9" value="<%= s[8]%> is GOOD">               GOOD    
<input type="radio" name="Q9" value="<%= s[8]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q9" value="<%= s[8]%> is BAD">                BAD    


<hr><br>

Q10: <%= s[9]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q10" value="<%= s[9]%> is GOOD">               GOOD    
<input type="radio" name="Q10" value="<%= s[9]%> is AVERAGE" checked>        AVG   
<input type="radio" name="Q10" value="<%= s[9]%> is BAD">                BAD      



<hr><br>
<font size = 4 color="#696969"><i>
Comment : <input type="text" name="COMMENT" size="100" maxlength="75" ></i> </font><br><br>

<I>*NOTE: Comment should be in not more then 75 Words 



<br><BR>
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
   onClick="Close()"
   title="">
</form>
 


</form>

<%
}

catch(Exception ee)
{


	response.sendRedirect("ErrorPage.jsp");
}

%>

</body></fieldset>
</html>
