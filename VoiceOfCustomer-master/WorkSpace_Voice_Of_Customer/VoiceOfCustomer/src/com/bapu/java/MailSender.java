package com.bapu.java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MailSender
{

    boolean flag = false;  
    
    ArrayList<String> li = new ArrayList<String>();
    
    int l = 0;
    
    
    
	
	public boolean prepareMail(String ctype)
	{
		
		if(ctype.equals("BUSINESS"))
		{
			System.out.println("POJO"+ctype);
			
			/*
			 
			 1. DBCode
			 
			 2. Select EMAIL_ID 
			    From   CUSTOMER_INFORMATION (table)
			    Where  PRODUCT_TYPE="business"	 
			 
			 3. ReslutSet rs = ...
			 
			 4. to[] ko fill kar using rs.getString("EMAIL_ID")   
			 
			 5. to,cc,bcc,  from,pwd  message="/VOC_Proj/BusinessFeedForm" servlet link
			 
			 5. (gmail wala code) MailUsingJava( to,cc,bcc,  from,pwd ,.....  )
			    
			    
			 
			 */
			
			
			 try 
			 {
						DB_DB2_Connect db = new DB_DB2_Connect();
						
						/*
						 * First Clear OLD RECEIVED FEEDBACK
						 */
						db.s.execute(" DELETE FROM RECEIVED_BUSINESS_FEEDBACK ");
						
						/*
						 * CLEARED OLD RECEIVED FEEDBACK
						 */
						
						 
						 ResultSet rs = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='BUSINESS'   ");
						 
						
						 
						 
						 
						 while(rs.next())
						 {
							 
							 System.out.println("eid = "+ rs.getString("EMAIL_ID") );
							 
							 li.add(rs.getString("EMAIL_ID"));
								 
							 
							 
						 }
			
			 
			      System.out.println("LIST = "+li);
			      
			      int l = li.size();
			     	      
			      System.out.println( l );
			      
			      String to[] = new String[l];
			      
			      int i = 0; 
			     			      
			      ResultSet rs1 = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='BUSINESS'   ");
			      
			      while(rs1.next())
					 { 
						 to[i] = rs1.getString("EMAIL_ID");
						 i++;
										 
					 }
			      
			     // System.out.println( "TO : "+to[0] );
			      //System.out.println( "TO = "+to[1] );
			      
			      String cc[] = to;
			      String bcc[] =to;
			      
			    //  System.out.println( "BCC : "+bcc[0] );
			     // System.out.println( "BCC = "+bcc[1] );
			      
			      String from = "voiceofcustomer.tgmc@gmail.com";
			      String pwd = "voiceofcustomer";
			      
			      String subject = "BUSINESS PHONE FEEDBACK FORM";
			      String msg = "Customer's Feedback is very Valuable.So we have sent you Link of Feedback Form. Please visit this Link  http://localhost:8080/VoiceOfCustomer/BusinessFeedbackForm ";
			      
			      // MailUsingJava mail = new MailUsingJava(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
			      
			      MailUsingJava ms = new MailUsingJava();
			      
			      boolean f = ms.sendToGmail(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
			      
			      flag = f;
			      
			   	
			 } 
			 
			 
			 
			 
			 catch (SQLException e)
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
		
		
		
		
		
		
		
		if(ctype.equals("GAMING"))
		{
           System.out.println("POJO"+ctype);
			
			/*
			 
			 1. DBCode
			 
			 2. Select EMAIL_ID 
			    From   CUSTOMER_INFORMATION (table)
			    Where  PRODUCT_TYPE="gaming"	 
			 
			 3. ReslutSet rs = ...
			 
			 4. to[] ko fill kar using rs.getString("EMAIL_ID")   
			 
			 5. to,cc,bcc,  from,pwd  message="/VOC_Proj/BusinessFeedForm" servlet link
			 
			 5. (gmail wala code) MailUsingJava( to,cc,bcc,  from,pwd ,.....  )
			    
			    
			 
			 */
			
			
			 try 
			 {
						DB_DB2_Connect db = new DB_DB2_Connect();
						
						/*
						 * First Clear OLD RECEIVED FEEDBACK
						 */
						db.s.execute(" DELETE FROM RECEIVED_GAMING_FEEDBACK ");
						
						/*
						 * CLEARED OLD RECEIVED FEEDBACK
						 */
						
						 
						 ResultSet rs = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='GAMING'   ");
						 
						
						 
						 
						 
						 while(rs.next())
						 {
							 
							 System.out.println("eid = "+ rs.getString("EMAIL_ID") );
							 
							 li.add(rs.getString("EMAIL_ID"));
								 
							 
							 
						 }
			
			 
			      System.out.println("LIST = "+li);
			      
			      int l = li.size();
			     	      
			      System.out.println( l );
			      
			      String to[] = new String[l];
			      
			      int i = 0; 
			     			      
			      ResultSet rs1 = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='GAMING'   ");
			      
			      while(rs1.next())
					 { 
						 to[i] = rs1.getString("EMAIL_ID");
						 i++;
										 
					 }
			      
			     // System.out.println( "TO : "+to[0] );
			     // System.out.println( "TO = "+to[1] );
			      
			      String cc[] = to;
			      String bcc[] =to;
			      
			     // System.out.println( "BCC : "+bcc[0] );
			     // System.out.println( "BCC = "+bcc[1] );
			      
			      String from = "voiceofcustomer.tgmc@gmail.com";
			      String pwd = "voiceofcustomer";
			      
			      String subject = "GAMING PHONE FEEDBACK FORM";
			      String msg = "Customer's Feedback is very Valuable.So we have sent you Link of Feedback Form. Please visit this Link  http://localhost:8080/VoiceOfCustomer/GamingFeedbackForm ";
			      
			      // MailUsingJava mail = new MailUsingJava(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
			      
			      MailUsingJava ms = new MailUsingJava();
			      
			      boolean f = ms.sendToGmail(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
			      
			      flag = f;
			      
			   	
			 } 
			 
			 
			 
			 
			 catch (SQLException e)
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
			
		}
		
		
		
		
		
		
		
		if(ctype.equals("STANDARD"))
		{
			
			 System.out.println("POJO"+ctype);
				
				/*
				 
				 1. DBCode
				 
				 2. Select EMAIL_ID 
				    From   CUSTOMER_INFORMATION (table)
				    Where  PRODUCT_TYPE="gaming"	 
				 
				 3. ReslutSet rs = ...
				 
				 4. to[] ko fill kar using rs.getString("EMAIL_ID")   
				 
				 5. to,cc,bcc,  from,pwd  message="/VOC_Proj/BusinessFeedForm" servlet link
				 
				 5. (gmail wala code) MailUsingJava( to,cc,bcc,  from,pwd ,.....  )
				    
				    
				 
				 */
				
				
				 try 
				 {
							DB_DB2_Connect db = new DB_DB2_Connect();
							
							/*
							 * First Clear OLD RECEIVED FEEDBACK
							 */
							db.s.execute(" DELETE FROM RECEIVED_STANDARD_FEEDBACK ");
							
							/*
							 * CLEARED OLD RECEIVED FEEDBACK
							 */
							
							 
							 ResultSet rs = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='STANDARD'   ");
							 
							
							 
							 
							 
							 while(rs.next())
							 {
								 
								 System.out.println("eid = "+ rs.getString("EMAIL_ID") );
								 
								 li.add(rs.getString("EMAIL_ID"));
									 
								 
								 
							 }
				
				 
				      System.out.println("LIST = "+li);
				      
				      int l = li.size();
				     	      
				      System.out.println( l );
				      
				      String to[] = new String[l];
				      
				      int i = 0; 
				     			      
				      ResultSet rs1 = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='STANDARD'   ");
				      
				      while(rs1.next())
						 { 
							 to[i] = rs1.getString("EMAIL_ID");
							 i++;
											 
						 }
				      
				     // System.out.println( "TO : "+to[0] );
				    //  System.out.println( "TO = "+to[1] );
				      
				      String cc[] = to;
				      String bcc[] =to;
				      
				   //   System.out.println( "BCC : "+bcc[0] );
				   //   System.out.println( "BCC = "+bcc[1] );
				      
				      String from = "voiceofcustomer.tgmc@gmail.com";
				      String pwd = "voiceofcustomer";
				      
				      String subject = "STANDARD PHONE FEEDBACK FORM";
				      String msg = "Customer's Feedback is very Valuable.So we have sent you Link of Feedback Form. Please visit this Link  http://localhost:8080/VoiceOfCustomer/StandardFeedbackForm";
				      
				      // MailUsingJava mail = new MailUsingJava(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
				      
				      MailUsingJava ms = new MailUsingJava();
				      
				      boolean f = ms.sendToGmail(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
				      
				      flag = f;
				      
				   	
				 } 
				 
				 
				 
				 
				 catch (SQLException e)
				 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
			
		}
		
		
		
		
		
		
		
		if(ctype.equals("SURVEY"))
		{
			

			 System.out.println("POJO"+ctype);
				
				/*
				 
				 1. DBCode
				 
				 2. Select EMAIL_ID 
				    From   CUSTOMER_INFORMATION (table)
				    Where  PRODUCT_TYPE="gaming"	 
				 
				 3. ReslutSet rs = ...
				 
				 4. to[] ko fill kar using rs.getString("EMAIL_ID")   
				 
				 5. to,cc,bcc,  from,pwd  message="/VOC_Proj/BusinessFeedForm" servlet link
				 
				 5. (gmail wala code) MailUsingJava( to,cc,bcc,  from,pwd ,.....  )
				    
				    
				 
				 */
				
				
				 try 
				 {
							DB_DB2_Connect db = new DB_DB2_Connect();
							 
							/*
							 * First Clear OLD RECEIVED FEEDBACK
							 */
							db.s.execute(" DELETE FROM RECEIVED_SURVEY_FEEDBACK ");
							
							/*
							 * CLEARED OLD RECEIVED FEEDBACK
							 */
							
							
							 ResultSet rs = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION  ");
							 
							
							 
							 
							 
							 while(rs.next())
							 {
								 
								 System.out.println("eid = "+ rs.getString("EMAIL_ID") );
								 
								 li.add(rs.getString("EMAIL_ID"));
									 
								 
								 
							 }
				
				 
				      System.out.println("LIST = "+li);
				      
				      int l = li.size();
				     	      
				      System.out.println( l );
				      
				      String to[] = new String[l];
				      
				      int i = 0; 
				     			      
				      ResultSet rs1 = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION ");
				      
				      while(rs1.next())
						 { 
							 to[i] = rs1.getString("EMAIL_ID");
							 i++;
											 
						 }
				      
				    //  System.out.println( "TO : "+to[0] );
				   //   System.out.println( "TO = "+to[1] );
				      
				      String cc[] = to;
				      String bcc[] =to;
				      
				   //   System.out.println( "BCC : "+bcc[0] );
				   //   System.out.println( "BCC = "+bcc[1] );
				      
				      String from = "voiceofcustomer.tgmc@gmail.com";
				      String pwd = "voiceofcustomer";
				      
				      String subject = "SURVEY FORM";
				      String msg = "Customer's Feedback is very Valuable.So we have sent you Link of Feedback Form. Please visit this Link  http://localhost:8080/VoiceOfCustomer/SurveyForm";
				      
				      // MailUsingJava mail = new MailUsingJava(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
				      
				      MailUsingJava ms = new MailUsingJava();
				      
				      boolean f = ms.sendToGmail(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
				      
				      flag = f;
				      
				   	
				 } 
				 
				 
				 
				 
				 catch (SQLException e)
				 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			
		}
		
		
		
		

		if(ctype.equals("SERVICE"))
		{
			

			 System.out.println("POJO"+ctype);
				
				/*
				 
				 1. DBCode
				 
				 2. Select EMAIL_ID 
				    From   CUSTOMER_INFORMATION (table)
				    Where  PRODUCT_TYPE="gaming"	 
				 
				 3. ReslutSet rs = ...
				 
				 4. to[] ko fill kar using rs.getString("EMAIL_ID")   
				 
				 5. to,cc,bcc,  from,pwd  message="/VOC_Proj/BusinessFeedForm" servlet link
				 
				 5. (gmail wala code) MailUsingJava( to,cc,bcc,  from,pwd ,.....  )
				    
				    
				 
				 */
				
				
				 try 
				 {
							DB_DB2_Connect db = new DB_DB2_Connect();
							 
							/*
							 * First Clear OLD RECEIVED FEEDBACK
							 */
							db.s.execute(" DELETE FROM RECEIVED_SERVICE_FEEDBACK ");
							
							/*
							 * CLEARED OLD RECEIVED FEEDBACK
							 */
							
							
							 ResultSet rs = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION  ");
							 
							
							 
							 
							 
							 while(rs.next())
							 {
								 
								 System.out.println("eid = "+ rs.getString("EMAIL_ID") );
								 
								 li.add(rs.getString("EMAIL_ID"));
									 
								 
								 
							 }
				
				 
				      System.out.println("LIST = "+li);
				      
				      int l = li.size();
				     	      
				      System.out.println( l );
				      
				      String to[] = new String[l];
				      
				      int i = 0; 
				     			      
				      ResultSet rs1 = db.s.executeQuery("    SELECT * FROM CUSTOMER_INFORMATION ");
				      
				      while(rs1.next())
						 { 
							 to[i] = rs1.getString("EMAIL_ID");
							 i++;
											 
						 }
				      
				    //  System.out.println( "TO : "+to[0] );
				   //   System.out.println( "TO = "+to[1] );
				      
				      String cc[] = to;
				      String bcc[] =to;
				      
				   //   System.out.println( "BCC : "+bcc[0] );
				   //   System.out.println( "BCC = "+bcc[1] );
				      
				      String from = "voiceofcustomer.tgmc@gmail.com";
				      String pwd = "voiceofcustomer";
				      
				      String subject = "SERVICE FEEDBACK FORM";
				      String msg = "Customer's Feedback is very Valuable.So we have sent you Link of Feedback Form. Please visit this Link  http://localhost:8080/VoiceOfCustomer/ServiceFeedbackForm.jsp";
				      
				      // MailUsingJava mail = new MailUsingJava(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
				      
				      MailUsingJava ms = new MailUsingJava();
				      
				      boolean f = ms.sendToGmail(from,pwd,"smtp.gmail.com","465","true","true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,subject,msg);
				      
				      flag = f;
				      
				   	
				 } 
				 
				 
				 
				 
				 catch (SQLException e)
				 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			
		}
		
		
		
		
		
		return flag;		
		
		
		
		
	}
	
	
	
}
