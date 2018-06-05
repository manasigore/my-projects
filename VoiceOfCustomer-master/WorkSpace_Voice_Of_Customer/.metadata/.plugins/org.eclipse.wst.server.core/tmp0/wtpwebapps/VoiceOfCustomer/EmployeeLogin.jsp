<html>




<!-- //This File handles all USERS. Give its link  i.e. "EmployeeLogin.JSP" to all "Employees" of Company -->



<pre><b><font face="Times New Roman"" size="4" color="#5F5A59">                                                                                                                       Powered by <img src="Images/ibm.jpg"/>Technologies  </font></b>  </pre>




<head>

<title>EMPLOYEE LOGIN</title>






<script type="text/javascript">

tday  =new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");

tmonth=new Array("January","February","March","April","May","June","July","August","September","October","November","December");

 

function GetClock(){

d = new Date();

nday   = d.getDay();

nmonth = d.getMonth();

ndate  = d.getDate();

nyear = d.getYear();

nhour  = d.getHours();

nmin   = d.getMinutes();

nsec   = d.getSeconds();

 

if(nyear<1000) nyear=nyear+1900;

 

     if(nhour ==  0) {ap = " AM";nhour = 12;} 

else if(nhour <= 11) {ap = " AM";} 

else if(nhour == 12) {ap = " PM";} 

else if(nhour >= 13) {ap = " PM";nhour -= 12;}

 

if(nmin <= 9) {nmin = "0" +nmin;}

if(nsec <= 9) {nsec = "0" +nsec;}

 

 

document.getElementById('clockbox').innerHTML=""+tday[nday]+", "+tmonth[nmonth]+" "+ndate+", "+nyear+" "+nhour+":"+nmin+":"+nsec+ap+"";

setTimeout("GetClock()", 1000);

}

window.onload=GetClock;

</script>

<div id="clockbox"></div>
















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
      flag=1; 
    
   } 

   else
   {

	   if (  form.password.value == ""  ) 
	   { 
	      alert('Please Enter Your Password');
	      form.password.focus();
	      flag=1; 
	    
	   } 
   
   }

   

   /* AJAX CODE */

   if(flag==0)
   {
	   name = form.username.value;
	   pwd = form.password.value;
   	   var ajaxurl = "/VoiceOfCustomer/VerifyEmployee?name="+name+"&pwd="+pwd;   
   	

   	//For Mozilla, Safari, ...
   	  if(window.XMLHttpRequest)
   	  { 
   	      xmlHttp = new XMLHttpRequest();
   	  }

   	//For Internet Explorer
   	if(window.ActiveXObject)
   	  { 
   	      xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
   	  }



   	xmlHttp.open('POST', ajaxurl, true);
   	xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
   	xmlHttp.send(ajaxurl);

   	var flag;

   	xmlHttp.onreadystatechange = function()
   	{
   	  if (xmlHttp.readyState == 4)
   		   {
   	          
   	           if(xmlHttp.responseText.indexOf("yes")==-1) // if "no" comes then "TRUE" here
   	           	  {
   	            	  alert("INVALID USER. Please Re-Insert Credentials");
   	            	  flag = "INVALID";
   	                  
   	           	  }

   	           else
   	           {
   	               alert("User Authenticated. Click to Proceed");
   	               
   	               //form.submit();
   	               
   	               var ajaxurldata = "/VoiceOfCustomer/EmployeeIdentity?name="+name+"&pwd="+pwd; 
   	               
   	               xmlHttp.open('POST', ajaxurldata, true);
               	   xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
   	               xmlHttp.send(ajaxurldata);
   	               
   	               window.close();
   	              
   	               window.open("/VoiceOfCustomer/EmployeeIdentity","new_win","resizable=yes,scrollbars=yes,toolbar=no, menubar=no, location=no,directories=no, status=no,width=1024,height=768, top=0, left=40");
   	               
   	               
   	           } 
   	               
   	       	
   	      }
   	}

   	
   }
     
      
   /* AJAX CODE ENDS*/

   

 
} 

</script>

</head>



<form name=LoginForm  method=post action="/VoiceOfCustomer/EmployeeIdentity">
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


<br><br>

 

<pre><b><i><font face="Times New Roman"" size="3" color="#5F5A59">                                                                                                                                                   &copy; Copyright 2011 Atharva College <img src="Images/ace.bmp"/>  </font></i></b>  </pre>


</html>




