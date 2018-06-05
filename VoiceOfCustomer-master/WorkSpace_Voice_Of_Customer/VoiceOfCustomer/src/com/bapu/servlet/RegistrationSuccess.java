package com.bapu.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapu.java.DB_DB2_Connect;

import com.bapu.java.*;

/**
 * Servlet implementation class for Servlet: RegistrationSuccess
 *
 */
 public class RegistrationSuccess extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
   
   public String s1,s2,s3,s4,s5,s6;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public RegistrationSuccess() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		DB_DB2_Connect db = new DB_DB2_Connect();
		   
		 try {
			    ResultSet rs = db.s.executeQuery("    SELECT  PRODUCT_TYPE FROM PRODUCT_INFORMATION WHERE PRODUCT_ID = '"+s3+"'      ");
			 
			    String s4=null;
			    
			    while(rs.next())
			    {
			    s4 = rs.getString("PRODUCT_TYPE");
			     
			    }
			     ProcessRegistrationForm prf = new ProcessRegistrationForm();
				 
				 //boolean f = prf.sendToDB(s1,s2,s3,s4,s5);
				 
				 RegistrationBean rb = new RegistrationBean();
				 rb.setUsername(s1);
				 rb.setAddress(s2);
				 rb.setProduct_id(s3);
				 rb.setProduct_type(s4);
				 rb.setEmail_id(s5);
				 rb.setPno(s6);
				 
				 boolean f = prf.sendToDB(rb);
				 
				 
				 
				 
				 if(f==true)
				 {
				     response.sendRedirect("/VoiceOfCustomer/RegistrationSuccess.jsp");
				 }
				 else
				 {
				     response.sendRedirect("/VoiceOfCustomer/ServerDown.jsp");
				 } 
			     
			     
				 db.s.close();
			     db.c.close();
			     
		     }
		 
		  catch (SQLException e) 
		  {
			
			e.printStackTrace();
		  }
		
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		s1 = request.getParameter("un");
		s2 = request.getParameter("addr");
		s3 = request.getParameter("p");
	    s5 = request.getParameter("eid");
		s6 = request.getParameter("m");
		
		
		
		
		
		System.out.println("Servlet"+s1+s2);
		
		/*
		 DB_DB2_Connect db = new DB_DB2_Connect();
		   
		 try {
			    ResultSet rs = db.s.executeQuery("    SELECT  PRODUCT_TYPE FROM PRODUCT_INFORMATION WHERE PRODUCT_ID = '"+s3+"'      ");
			 
			    String s4=null;
			    
			    while(rs.next())
			    {
			    s4 = rs.getString("PRODUCT_TYPE");
			     
			    }
			     ProcessRegistrationForm prf = new ProcessRegistrationForm();
				 
				 //boolean f = prf.sendToDB(s1,s2,s3,s4,s5);
				 
				 RegistrationBean rb = new RegistrationBean();
				 rb.setUsername(s1);
				 rb.setAddress(s2);
				 rb.setProduct_id(s3);
				 rb.setProduct_type(s4);
				 rb.setEmail_id(s5);
				 rb.setPno(s6);
				 
				 boolean f = prf.sendToDB(rb);
				 
				 
				 
				 
				 if(f==true)
				 {
				     response.sendRedirect("/VoiceOfCustomer/RegistrationSuccess.jsp");
				 }
				 else
				 {
				     response.sendRedirect("/VoiceOfCustomer/ServerDown.jsp");
				 } 
			     
			     
				 db.s.close();
			     db.c.close();
			     
		     }
		 
		  catch (SQLException e) 
		  {
			
			e.printStackTrace();
		  }
		*/
		
		
	}   
	
}