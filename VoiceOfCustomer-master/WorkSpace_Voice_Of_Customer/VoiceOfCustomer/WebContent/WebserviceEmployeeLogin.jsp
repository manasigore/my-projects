<html>




<!-- //This File handles all USERS. Give its link  i.e. "EmployeeLogin.JSP" to all "Employees" of Company -->


<head>

<title>EMPLOYEE LOGIN</title>


<style>

.label{
    font-family:Verdana, Arial, Helvetica, sans-serif;
    font-size:11px;
    color:#0066FF;
}
.tableBorder{
    border:solid 1px #0066FF;
    margin-top:100px;
}
.message{
    font-family:Verdana, Arial, Helvetica, sans-serif;
    font-size:14px;
    font-weight:bold;
    color:#0066FF;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login to Website</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />





<script type="text/javascript">


function ValidateForm(form)
{


	var flag=0;
	var name,pwd;
	var xmlHttp;

	
   
 
   if (  form.username.value == ""  ) 
   { 
      alert('Please Enter Your Employee-ID');
      form.username.focus();
     
    
   } 

   else
   {

	   if (  form.password.value == ""  ) 
	   { 
	      alert('Please Enter Your Password');
	      form.password.focus();
	      
	    
	   } 
	   
	   else
	   {
	       if (  form.username.value == "admin" && form.password.value == "admin"   ) 
	       {
	          
	          
   	               window.close();
   	              
   	               window.open("/VoiceOfCustomer/WebServiceMainMenu.jsp","new_win","resizable=yes,scrollbars=yes,toolbar=no, menubar=no, location=no,directories=no, status=no,width=1024,height=768, top=0, left=40");
   	               
	       }
	       
	       else
	       {
	          alert("  AUTHENTICATION FAILED !!!. \n  Please Re-Enter Credentials ");
	       }
	   
	   }
	    
	   
   
   }

   

   	               
   	
} 

</script>

</head>



<form name=LoginForm  method=post action="/VoiceOfCustomer/WebServiceMainMenu.jsp">
<body>

<table cellpadding="2px" cellspacing="1px" bgcolor="#F4F5F7" width="400px" class="tableBorder" align="center">
    <tr>
        <td colspan="2" bgcolor="#0066FF">&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2" class="label">&nbsp;</td>
    </tr>
   
    <tr>
        <td align="center" colspan="2">
            <img src="Images/ELogin.gif" height="60" width="60" border="0" align="absbottom"/>&nbsp;
            <span class="message"><I> Employee   Authentication </I></span>
        </td>
    </tr>                  
    <tr>
        <td colspan="2" class="label">&nbsp;</td>
    </tr>
    <tr>
        <td class="label" align="right" width="40%">Employee ID:</td>
        <td align="left" width="60%"><input type="text" name="username" maxlength="20"/></td>
    </tr>
    <tr>
        <td class="label" align="right">Password:</td>
        <td align="left"><input type="password" name="password" maxlength="20" /></td>
    </tr>
    
    <tr>       
    </tr>
      <tr>       
    </tr>
      <tr>       
    </tr>
      <tr>       
    </tr>
    
    <tr>
        <td class="label" align="right">&nbsp;</td>
        <td align="left"><input type="button" value=">> LOGIN <<"  maxlength="20"
        style="background-color: #bcc6ae; 
 border-top: 2px solid #0066FF; 
 border-right: 2px solid #0066FF; 
 border-bottom: 2px solid #0066FF; 
 border-left: 2px solid #0066FF;
 width: 100px; height: 24px;
 font-weight: bold;" 
 
 
 onClick="ValidateForm(LoginForm)"
 
 
 /></td>
    </tr>                  
    <tr>
        <td colspan="2" class="label">&nbsp;</td>
    </tr>                  
</table>


</body>
</form>


</html>




