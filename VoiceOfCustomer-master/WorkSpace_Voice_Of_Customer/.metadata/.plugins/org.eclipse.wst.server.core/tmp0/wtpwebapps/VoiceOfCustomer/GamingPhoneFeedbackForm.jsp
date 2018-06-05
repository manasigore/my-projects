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
GAMING PHONE FEEDBACK FORM
</title>


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
		<legend><font size="4" color="#2E9AFE"><i>GAMING PHONE FEEDBACK FORM :&nbsp; </i></font> </legend>



<body background="Images/feedback.jpg" width="200" height="228" >

<form name="gamingfeedbackform" action="/VoiceOfCustomer/ReceivedFeedbackForm" method="POST">

<input type="hidden" name="ctype" value="GAMING" />


Q1: <%= s[0]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q1" value="GOOD">               GOOD    
<input type="radio" name="Q1" value="AVG" checked>        AVG   
<input type="radio" name="Q1" value="BAD">                BAD    

<hr><br>

Q2: <%= s[1]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q2" value="GOOD">               GOOD    
<input type="radio" name="Q2" value="AVG" checked>        AVG   
<input type="radio" name="Q2" value="BAD">                BAD    

<hr><br>

Q3: <%= s[2]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q3" value="GOOD">               GOOD    
<input type="radio" name="Q3" value="AVG" checked>        AVG   
<input type="radio" name="Q3" value="BAD">                BAD    

<hr><br>


Q4: <%= s[3]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q4" value="GOOD">               GOOD    
<input type="radio" name="Q4" value="AVG" checked>        AVG   
<input type="radio" name="Q4" value="BAD">                BAD   

<hr><br>

Q5: <%= s[4]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q5" value="GOOD">               GOOD    
<input type="radio" name="Q5" value="AVG" checked>        AVG   
<input type="radio" name="Q5" value="BAD">                BAD   

<hr><br>

Q6: <%= s[5]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q6" value="GOOD">               GOOD    
<input type="radio" name="Q6" value="AVG" checked>        AVG   
<input type="radio" name="Q6" value="BAD">                BAD   

<hr><br>

Q7: <%= s[6]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q7" value="GOOD">               GOOD    
<input type="radio" name="Q7" value="AVG" checked>        AVG   
<input type="radio" name="Q7" value="BAD">                BAD    


<hr><br>

Q8: <%= s[7]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q8" value="GOOD">               GOOD    
<input type="radio" name="Q8" value="AVG" checked>        AVG   
<input type="radio" name="Q8" value="BAD">                BAD    


<hr><br>

Q9: <%= s[8]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q9" value="GOOD">               GOOD    
<input type="radio" name="Q9" value="AVG" checked>        AVG   
<input type="radio" name="Q9" value="BAD">                BAD    


<hr><br>

Q10: <%= s[9]%><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="Q10" value="GOOD">               GOOD    
<input type="radio" name="Q10" value="AVG" checked>        AVG   
<input type="radio" name="Q10" value="BAD">                BAD      



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


<%
}

catch(Exception ee)
{

	response.sendRedirect("ErrorPage.jsp");
}

%>


</body></fieldset>
</html>
