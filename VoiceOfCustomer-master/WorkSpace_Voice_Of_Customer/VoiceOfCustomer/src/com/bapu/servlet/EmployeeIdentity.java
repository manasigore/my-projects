package com.bapu.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapu.java.DB_DB2_Connect;

/**
 * Servlet implementation class for Servlet: EmployeeIdentity
 *
 */
 public class EmployeeIdentity extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
   
   public String empid;
   public String emppwd;
   
   
  
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public EmployeeIdentity() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		 String emptype = null;
		 
			
		 
			//This File handles all USERS
			
					 
				
			
			
			
			 DB_DB2_Connect db = new DB_DB2_Connect();
			 
			 try {
						ResultSet rs = db.s.executeQuery("    SELECT EMPLOYEE_TYPE FROM COMPANY_EMPLOYEE WHERE EMPLOYEE_ID='"+empid+"' AND EMPLOYEE_PASSWORD='"+emppwd+"'  ");
						 
						 
						 
						 while( rs.next() )
						 {
							 emptype = (String)rs.getString("EMPLOYEE_TYPE");
							
						 }
						 
						 System.out.println("TYPE = "+emptype);
						 
						 
							
						 
						 
						 
						 if( emptype.equals("CONTACT_DEPARTMENT"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/ContactDepartmentMainMenu.jsp");
						 }
						 
						 if( emptype.equals("SENIOR_DEPARTMENT"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/SeniorManagementMainMenu.jsp");
						 }
						 
						
						 
						 
						 if( emptype.equals("BUSINESS_DEPARTMENT"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/BusinessPhoneTeam.jsp");
						 }
						 
						 if( emptype.equals("GAMING_DEPARTMENT"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/GamingPhoneTeam.jsp");
						 }
						 
						 if( emptype.equals("STANDARD_DEPARTMENT"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/StandardPhoneTeam.jsp");
						 }
						 
						 if( emptype.equals("SERVICE_TEAM"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/ServiceTeam.jsp");
						 }
						 
						 if( emptype.equals("SURVEY_TEAM"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/SurveyTeam.jsp");
						 }
						 
						 if( emptype.equals("SALES_MARKETING_DEPARTMENT"))
						 {
							 System.out.println("OK");
							 response.sendRedirect("/VoiceOfCustomer/Sales_MarketingMainMenu.jsp");
						 }
						 
						 
						 
			}
			 
			 catch (SQLException e)
			 {
				
				e.printStackTrace();
			}
			
			
		
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		 String emptype = null;
		 
		
		 
		 
		 
		//This File handles all USERS
		
		//String empid = request.getParameter("username");
		//String emppwd = request.getParameter("password");
		 
		 
			empid = request.getParameter("name");
			emppwd = request.getParameter("pwd");
			
			System.out.println(empid + emppwd);
		
		System.out.println("post-EMPLOYEE IDENTITY SERVLET "+empid + emppwd);
		
		/*
		
		 DB_DB2_Connect db = new DB_DB2_Connect();
		 
		 try {
					ResultSet rs = db.s.executeQuery("    SELECT EMPLOYEE_TYPE FROM COMPANY_EMPLOYEE WHERE EMPLOYEE_ID='"+empid+"' AND EMPLOYEE_PASSWORD='"+emppwd+"'  ");
					 
					 
					 
					 while( rs.next() )
					 {
						 emptype = (String)rs.getString("EMPLOYEE_TYPE");
						
					 }
					 
					 System.out.println("TYPE = "+emptype);
					 
					 
						 
					 
					 
					 
					 if( emptype.equals("CONTACT_DEPARTMENT"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/ContactDepartmentMainMenu.jsp");
					 }
					 
					 if( emptype.equals("SENIOR_DEPARTMENT"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/SeniorManagementMainMenu.jsp");
					 }
					 
					
					 
					 
					 if( emptype.equals("BUSINESS_DEPARTMENT"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/BusinessPhoneTeam.jsp");
					 }
					 
					 if( emptype.equals("GAMING_DEPARTMENT"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/GamingPhoneTeam.jsp");
					 }
					 
					 if( emptype.equals("STANDARD_DEPARTMENT"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/StandardPhoneTeam.jsp");
					 }
					 
					 if( emptype.equals("SERVICE_TEAM"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/ServiceTeam.jsp");
					 }
					 
					 if( emptype.equals("SURVEY_TEAM"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/SurveyTeam.jsp");
					 }
					 
					 if( emptype.equals("SALES_MARKETING_DEPARTMENT"))
					 {
						 System.out.println("OK");
						 response.sendRedirect("/VoiceOfCustomer/Sales_MarketingMainMenu.jsp");
					 }
					 
					 
					 
		}
		 
		 catch (SQLException e)
		 {
			
			e.printStackTrace();
		}
		
		
		*/
		
	}   	  	    
}