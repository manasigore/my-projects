
<html>
<head>
   

<title>CONTACT DEPARTMENT MAIN MENU
</title>


<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>



<style type="text/css">

input.groovybutton
{
   font-size:15px;
   font-style:italic;
}

</style>



<script type="text/javascript">



 function Close(l)
 {
   
  l.submit();
 }
 
 
 function busiWebService()
 {
     window.open("WebServiceBusiness.jsp");
 }
 
 function stdWebService()
 {
     window.open("WebServiceGaming.jsp");
 }
 
 function gmgWebService()
 {
     window.open("WebServiceStandard.jsp");
 }
 

</script>



 
</head>


<body>

<form name ="l" action="/VoiceOfCustomer/Logout.jsp">
<pre>                                                                                                          <input type="button" value="LOG-OUT" onClick="Close(l)"></pre></form>


<form action="/VoiceOfCustomer/WebServiceMainMenu.jsp">
<pre>	                                                                                <input type="submit" class="groovybutton" value="&nbsp;&nbsp;&nbsp;&nbsp;View Customer Details &nbsp;&nbsp;" title="" /></pre></form>

</body>


<body background="Images\contact.jpg" width="200" height="228" >



	
	<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>Business Phone Feedback Form Menu&nbsp; </i></font> </legend>
                  <br>

                   <form action="/VoiceOfCustomer/MailToCustomer">
                   
                   <input type="hidden"  name="ctype"  value="BUSINESS"/>

 
                   <pre>          <input type="submit"
   			     name="b1"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;Release Form &nbsp;&nbsp;&nbsp;"
  			 title=""   
        			      
                   /></pre></form>

              
                  
                  <form action="EditFeedbackForm.jsp">
                  <input type="hidden"  name="ctype"  value="BUSINESS"/>
 
             <pre>          <input type="submit"
   			name="b2"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;Update Form &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
  			 title=""     
  			
                /></pre></form>


                  <form action="/VoiceOfCustomer/BusinessPdfCreator">
                  
                  
 
              <pre>          <input type="submit"
   			name="b3"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;&nbsp;Create Report &nbsp;&nbsp;"
  			 title=""     
                /></pre></form>
                
                
            
            <br> 
    
    </fieldset>
    
    
    










	
	<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>Gaming Phone Feedback Form Menu&nbsp; </i></font> </legend>
                  <br>

                   <form action="/VoiceOfCustomer/MailToCustomer">
                   
                   <input type="hidden"  name="ctype"  value="GAMING"/>

 
                   <pre>          <input type="submit"
   			     name="b4"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;Release Form &nbsp;&nbsp;&nbsp;"
  			 title=""   
        			      
                   /></pre></form>

              
                  
                  <form action="EditFeedbackForm.jsp">
                   <input type="hidden"  name="ctype"  value="GAMING"/>
 
             <pre>          <input type="submit"
   			name="b5"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;Update Form &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
  			 title=""     
                /></pre></form>


                  <form action="/VoiceOfCustomer/GamingPdfCreator">
 
              <pre>          <input type="submit"
   			name="b6"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;&nbsp;Create Report &nbsp;&nbsp;"
  			 title=""     
                /></pre></form>
    

            <br> 

		
	</fieldset>
	










	
	<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>Standard Phone Feedback Form Menu&nbsp; </i></font> </legend>
                  <br>

                   <form action="/VoiceOfCustomer/MailToCustomer">
                   
                   <input type="hidden"  name="ctype"  value="STANDARD"/>

 
                   <pre>          <input type="submit"
   			     name="b7"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;Release Form &nbsp;&nbsp;&nbsp;"
  			 title=""   
        			      
                   /></pre></form>

              
                  
                  <form action="EditFeedbackForm.jsp">
                  <input type="hidden"  name="ctype"  value="STANDARD"/>
 
             <pre>          <input type="submit"
   			name="b8"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;Update Form &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
  			 title=""     
                /></pre></form>


                  <form action="/VoiceOfCustomer/StandardPdfCreator">
 
              <pre>          <input type="submit"
   			name="b9"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;&nbsp;Create Report &nbsp;&nbsp;"
  			 title=""     
                /></pre></form>
    


                 
			    
            
            <br> 
		
	</fieldset>



	
	<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>Survey Form Menu (For Registered Customers Only)&nbsp; </i></font> </legend>
                  <br>

                   <form action="/VoiceOfCustomer/MailToCustomer">
                   
                   <input type="hidden"  name="ctype"  value="SURVEY"/>

 
                   <pre>          <input type="submit"
   			     name="b12"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;Release Form &nbsp;&nbsp;&nbsp;"
  			 title=""   
        			      
                   /></pre></form>

              
                  
                  <form action="EditFeedbackForm.jsp">
                  <input type="hidden"  name="ctype"  value="SURVEY"/>
 
             <pre>          <input type="submit"
   			name="b10"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;Update Form &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
  			 title=""     
                /></pre></form>


                  <form action="/VoiceOfCustomer/SurveyPdfCreator">
 
              <pre>          <input type="submit"
   			name="b11"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;&nbsp;Create Report &nbsp;&nbsp;"
  			 title=""     
                /></pre></form>
    



		
	</fieldset>
	
	
	<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>Service Feedback Form Menu&nbsp; </i></font> </legend>
                  <br>

                   <form action="/VoiceOfCustomer/MailToCustomer">
                   
                   
                   <input type="Hidden" name="ctype" value="SERVICE">
                   

 
                   <pre>          <input type="submit"
   			     name="b1"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;Release Form &nbsp;&nbsp;&nbsp;"
  			 title=""   
        			      
                   /></pre></form>

              

                  <form action="/VoiceOfCustomer/ServicePdfCreator">
 
              <pre>          <input type="submit"
   			name="b3"
  			 class="groovybutton"
  			 value="&nbsp;&nbsp;&nbsp;&nbsp;Create Report &nbsp;&nbsp;"
  			 title=""     
                /></pre></form>
    
    </fieldset>
   

<br>



</body>

</html>