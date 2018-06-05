
<html>



<title>CUSTOMER REGISTRATION FORM</title>

<head>
<style>





.outter{
    border:3px #E0F0E8 solid;
    background-color:#F5FAF9;
    margin-top:100px;
    margin-left:250px;
    height:500px;
    width:700px;
    
}
.note{
    font-family:tahoma;
    font-size:12px;
    color:#333333;
    border:1px #55917A dashed;
}
.input{
    font-family:Verdana, Arial, Helvetica, sans-serif;
    font-weight:normal;
    font-size:12px;
    border:1px #A7BEB7 solid;
}
.text{
    font-family:tahoma;
    font-size:11px;
    color:#617E78;
    
}
.formHeading{
    font-family:Arial, Helvetica, sans-serif;
    font-size:18px;
    color:#55917A;
}




#hintbox{ /*CSS for pop up hint box */
position:absolute;
top: 0;
background-color: lightyellow;
width: 150px; /*Default width of hint.*/ 
padding: 3px;
border:1px solid black;
font:normal 11px Verdana;
line-height:18px;
z-index:100;
border-right: 3px solid black;
border-bottom: 3px solid black;
visibility: hidden;
}

.hintanchor{ /*CSS for link that shows hint onmouseover*/
font-weight: bold;
color: navy;
margin: 3px 8px;
}




input.groovybutton
{
   font-size:12px;
   font-family:Times New Roman,serif;
   font-weight:bold;
   color:#3399FF;
   width:110px;
   background-color:#99FF00;
   border-style:solid;
   border-color:#BBBBBB;
   border-width:2px;
}


</style>







<script type="text/javascript">




var horizontal_offset="9px" 

var vertical_offset="0" 
var ie=document.all
var ns6=document.getElementById&&!document.all

function getposOffset(what, offsettype){
var totaloffset=(offsettype=="left")? what.offsetLeft : what.offsetTop;
var parentEl=what.offsetParent;
while (parentEl!=null){
totaloffset=(offsettype=="left")? totaloffset+parentEl.offsetLeft : totaloffset+parentEl.offsetTop;
parentEl=parentEl.offsetParent;
}
return totaloffset;
}

function iecompattest(){
return (document.compatMode && document.compatMode!="BackCompat")? document.documentElement : document.body
}

function clearbrowseredge(obj, whichedge){
var edgeoffset=(whichedge=="rightedge")? parseInt(horizontal_offset)*-1 : parseInt(vertical_offset)*-1
if (whichedge=="rightedge"){
var windowedge=ie && !window.opera? iecompattest().scrollLeft+iecompattest().clientWidth-30 : window.pageXOffset+window.innerWidth-40
dropmenuobj.contentmeasure=dropmenuobj.offsetWidth
if (windowedge-dropmenuobj.x < dropmenuobj.contentmeasure)
edgeoffset=dropmenuobj.contentmeasure+obj.offsetWidth+parseInt(horizontal_offset)
}
else{
var windowedge=ie && !window.opera? iecompattest().scrollTop+iecompattest().clientHeight-15 : window.pageYOffset+window.innerHeight-18
dropmenuobj.contentmeasure=dropmenuobj.offsetHeight
if (windowedge-dropmenuobj.y < dropmenuobj.contentmeasure)
edgeoffset=dropmenuobj.contentmeasure-obj.offsetHeight
}
return edgeoffset
}

function showhint(menucontents, obj, e, tipwidth){
if ((ie||ns6) && document.getElementById("hintbox")){
dropmenuobj=document.getElementById("hintbox")
dropmenuobj.innerHTML=menucontents
dropmenuobj.style.left=dropmenuobj.style.top=-500
if (tipwidth!=""){
dropmenuobj.widthobj=dropmenuobj.style
dropmenuobj.widthobj.width=tipwidth
}
dropmenuobj.x=getposOffset(obj, "left")
dropmenuobj.y=getposOffset(obj, "top")
dropmenuobj.style.left=dropmenuobj.x-clearbrowseredge(obj, "rightedge")+obj.offsetWidth+"px"
dropmenuobj.style.top=dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+"px"
dropmenuobj.style.visibility="visible"
obj.onmouseout=hidetip
}
}

function hidetip(e){
dropmenuobj.style.visibility="hidden"
dropmenuobj.style.left="-500px"
}

function createhintbox(){
var divblock=document.createElement("div")
divblock.setAttribute("id", "hintbox")
document.body.appendChild(divblock)
}

if (window.addEventListener)
window.addEventListener("load", createhintbox, false)
else if (window.attachEvent)
window.attachEvent("onload", createhintbox)
else if (document.getElementById)
window.onload=createhintbox




function Close()
{
  this.close();
}







function ValidateForm(form)
{

	var flag=0;
	
	 var xmlHttp;


 
 if (  form.p.value == "" ) 
   { 
        alert('Mandatory Fields not filled'); flag=1;
        //return false; 
    
   } 
 
 else
   {


    if (  form.pp.value == "" ) 
        { 
          alert('Mandatory Fields not filled'); flag=1;
          // return false;
         } 


else
    {

      
 
 if (  form.m.value == "" ) 
   { 
      alert('Mandatory Fields not filled'); flag=1;
   
      
      //return false; 
    
   } 



 else
  {


     

 if (  form.eid.value == "" ) 
   { 
      alert('Mandatory Fields not filled'); flag=1;
   
      
    //  return false; 
    
   } 


    else 
   {



      
 if (  form.m.value == "" ) 
   { 
      alert('Mandatory Fields not filled'); flag=1;
   
      
      //return false; 
    
   } 


  else
     {


   
 if (  form.p.value != form.pp.value) 
   { 
      alert('Product ID Mismatch. Please re-provide Product ID'); flag=1;
   
      
      //return false; 
    
   } 


   else
     {

      
var str = form.eid.value


		var at="@"
		var dot="."
		var lat=str.indexOf(at)
		var lstr=str.length
		var ldot=str.indexOf(dot)
		

if (str.indexOf(at)==-1)
		{
		   alert("Invalid E-mail ID"); flag=1;
		  // return false
		}
		
	else
	  {
	  
	      if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr)
		{
		   alert("Invalid E-mail ID"); flag=1;
		   //return false
		}
		
		   else
		     {
		     
		         if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr)
		              {
		               alert("Invalid E-mail ID"); flag=1;
		                  //return false
		               }
		               
		               
		           else
		           {
		           
		            if (str.indexOf(at,(lat+1))!=-1)
		  			 {
		  					  alert("Invalid E-mail ID"); flag=1;
		   						 //return false
					 }
					 
					 else
					  {
					      if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot)
							 {
		   						 alert("Invalid E-mail ID"); flag=1;
		   							// return false
							 }
							 
							 
					      else
					        {
					         
					           if (str.indexOf(dot,(lat+2))==-1)
					           {
		    						alert("Invalid E-mail ID"); flag=1;
		   								 //return false
		 						}
		 						
		 						
		 						else
		 						
		 						{
		 						
		 						    if (str.indexOf(" ")!=-1)
		 						    {
		   										 alert("Invalid E-mail ID"); flag=1;
		    										//return false
		 								}
		 						
		 						}
					        
					        }		 
					  
					  }  
		           
		           }    
		     
		     
		     
		     }
	  
	  
	  
	  }	










var mm = form.m.value
       
           
   if(isNaN(mm)||mm.indexOf(" ")!=-1)
      {
            alert(" Enter Numeric value for Mobile Number"); flag=1;
              //return false;
      }
      
   else
   {
      if (mm.charAt(0)!="9")
           {
                alert(" Mobile Number should Start with 9 "); flag=1;
               // return false
           }
           
       else
       {
           if (mm.length != 10)
           {
                alert(" Enter Exactly 10 Digits for Mobile Number"); flag=1;
               // return false;
           }
       
       }    
   
   }   
           
           
           
           
           
           
           
           

           
     } } } }}

   }



/* AJAX CODE */

if(flag==0)
{
	 var ProductID = form.p.value;
	
	 
	 var ajaxurl = "/VoiceOfCustomer/VerifyProductID?ProductID="+ProductID;  
	

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
	          
	           if(xmlHttp.responseText.indexOf("yes")==-1)
	           	  {
	            	  alert("INVALID 'Product-ID'.Please Re-Insert Product-ID");
	            	  flag = "INVALID";
	                  
	           	  }

	           else
	           {
	               alert("Product-ID  Verified");
	              
	              // form.submit();
	             
	             var un,addr,p,eid,m;
	             
	             un = form.un.value;
	             addr = form.addr.value;
	             p = form.p.value;
	             eid = form.eid.value;
	             m = form.m.value;
	             
	             
	              var ajaxurldata = "/VoiceOfCustomer/RegistrationSuccess?un="+un+"&addr="+addr+"&p="+p+"&eid="+eid+"&m="+m; 
   	               
   	               xmlHttp.open('POST', ajaxurldata, true);
               	   xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
   	               xmlHttp.send(ajaxurldata);
   	               
   	               window.close();
   	              
   	               window.open("/VoiceOfCustomer/RegistrationSuccess","new_win","resizable=yes,scrollbars=no,toolbar=no, menubar=no, location=no,directories=no, status=no,width=1024,height=700, top=5, left=10");
   	               
	             
	             
	               
	           } 
	               
	       	
	      }
	}

	
}
  
   
/* AJAX CODE ENDS*/



} 

</script>

<script language="javascript">


function goLite(FRM,BTN)
{
   window.document.forms[FRM].elements[BTN].style.backgroundColor = "#CCE8CC";
}

function goDim(FRM,BTN)
{
   window.document.forms[FRM].elements[BTN].style.backgroundColor = "#99FF00";
}


</script>









</head>



<form name="RegistrationForm" action="/VoiceOfCustomer/RegistrationSuccess" method=post >
<body>







<table width="550px" class="outter">


<tr>
<img src="Images/register.gif">
</tr>


    <tr>
        <td>
            <table class="text" border="0" cellpadding="4" cellspacing="3" width="100%" >
                <tr height="40px">
                    <td colspan="2" class="formHeading"><font size="6"><I>Customer Registration Form </I></font> </td>
                </tr>

                
                 <tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>

                  
                 <tr>
                    <td></td>
                    <td> 
                </tr>

                <tr>
                    <td colspan="2" class="note" bgcolor="#E0F0E8">Field marked with <span style="color:#FF0000">*</span> are compulsory fields
                    </td>
                </tr>
                <tr height="10px">
                    <td colspan="2"></td>
                </tr>
                <tr>
                    <td align="right" bgcolor="#E0F0E8" width="32%"><span style="color:#FF0000">*</span>Name :
                   </td>
                    <td width="68%"><input size="35" maxlength="50" class="input" type="text" name="un" />
                    
                   </td>
                </tr>
                <tr>
                   <td align="right" bgcolor="#E0F0E8"><span style="color:#FF0000">*</span>E-Mail ID</td>
                   <td><input size="50" maxlength="50" class="input" type="text"  name="eid"
                    onclick="showhint('HINT: abc@domain.com', this, event, '200px')" ></td>
                </tr>
                       
                
                 
                <tr>
                    <td align="right" bgcolor="#E0F0E8"><span style="color:#FF0000">*</span>Mobile Phone </td>
                    <td><input size="35" class="input" type="text" name="m"
                    onclick="showhint('EXPECTED: Must be <b>10</b> Digit Number', this, event, '200px')"></td>
                </tr>
               
                <tr>
                    <td align="right" bgcolor="#E0F0E8"><span style="color:#FF0000"></span>Address
                    </td>
                    <td><textarea cols="37" rows="3" class="input" name="addr" ></textarea></td>
                </tr>
                
               
                <tr>
                    <td align="right" bgcolor="#E0F0E8"><span style="color:#FF0000">*</span>Product ID : </td>
                    <td><input size="25" class="input" type="text" name="p"
                    onclick="showhint('ADVICE: Should be of form <b>MBxxxx,MGxxxx,MSxxxx </b> ', this, event, '200px')" ></td>
                </tr>

                <tr>
                    <td align="right" bgcolor="#E0F0E8"><span style="color:#FF0000">*</span>Re-Enter Product ID :</td>
                    <td><input size="25" class="input" type="text" name="pp"
                    onclick="showhint('For Verification Purpose', this, event, '200px')"></td>
                </tr>

                 <tr>
                    <td></td>
                    <td> 
                </tr>
                      <tr>
                    <td></td>
                    <td> 
                </tr><tr>
                    <td></td>
                    <td>
                </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td>              </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td> 
                </tr>
<tr>
                    <td></td>
                    <td>
                </tr>


                <tr>
                    <td></td>
                    <td height="30"> 
                        <input   type="button" name="groovybtn1"  class="groovybutton"  value=">> REGISTER <<" title=""   onClick="ValidateForm(RegistrationForm)";   />&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset" name="groovybtn1"class="groovybutton"  value=">> CLEAR <<"  title="" /> 
                   </td>
                </tr>
            </table>
        </td>
    </tr>
</table>











</body>
</form>


</html>




