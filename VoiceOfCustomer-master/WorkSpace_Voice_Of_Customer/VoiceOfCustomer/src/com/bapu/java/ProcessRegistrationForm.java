package com.bapu.java;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;



public class ProcessRegistrationForm 
{


	boolean flag = false; 
	
	String s1,s2,s3,s4,s5,s6;
	
	//public boolean sendToDB( String s1,String s2,String s3,String s4,String s5 )
	public boolean sendToDB( RegistrationBean rb )
	{
		
		/*
		 1. DBCode
		 2. "INSERT" "s1-s5" having Customer Data into  "CUSTOMER_INFORMATION"(table)
		 3. if Success, return true;
		 4. if fail, return false; 
		 
		 
		 
		 */
		
		s1 = rb.getUsername();
		s2 = rb.getAddress();
		s3 = rb.getProduct_id();
		s4 = rb.getProduct_type();
		s5 = rb.getEmail_id();
		s6 = rb.getPno();
		
		
		
		System.out.println("POJO"+s4);
		
		
		DB_DB2_Connect db = new DB_DB2_Connect();
		   
		 try {
			    
			
			 ResultSet rs = db.s.executeQuery("SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_ID='"+s3+"' ");
			 
			 
			 
			 if( rs.next() )
			 {
				 
				 flag=false;
			 }
			 
			 else
			 {
			 
			 db.s.execute("INSERT INTO CUSTOMER_INFORMATION VALUES( '"+s1+"' , '"+s2+"' , '"+s3+"' , '"+s4+"' , '"+s5+"' , '"+s6+"' ) ");
		     
		     System.out.println("CUSTOMER_INFORMATION TABLE FILLED");			     
	    
	 
		     db.s.close();
			 db.c.close();
			 
			 flag=true;
			 }
			 
		 
		 }
		 
		  catch (Exception e) 
		  {
			
			e.printStackTrace();
			flag=false;
		  }
		
		return flag;
		
	}
	
	
}
