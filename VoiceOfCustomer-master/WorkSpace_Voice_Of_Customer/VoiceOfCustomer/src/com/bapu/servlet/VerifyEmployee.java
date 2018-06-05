package com.bapu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bapu.java.DB_DB2_Connect;

/**
 * Servlet implementation class for Servlet: VerifyEmployee
 *
 */
 public class VerifyEmployee extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public VerifyEmployee() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		
		HttpSession hs = request.getSession(true);
		hs.setAttribute("E", "e");
		
		
		
		
//This File handles all USERS
		
		
		
		String empid = request.getParameter("name");
		String emppwd = request.getParameter("pwd");
		
		System.out.println(empid + emppwd);
		
		/*
		 1. DBCode
		 2. Select *
		    From COMPANY_EMPLOYEE (table)
		    Where EMP_ID = empid and  EMP_PWD = emppwd
		    
		    PrintWriter out = response.getWriter();
		   		    
		 3. ResultSet rs = .......;
		    
		    if(rs == null)
		    {
		     out.println("no");
		    }   
		    
		     else
		     {
		      out.println("yes");
		     }
		    
		     
		 */
		
		
		 DB_DB2_Connect db = new DB_DB2_Connect();
		 
		 try {
				ResultSet rs = db.s.executeQuery("    SELECT * FROM COMPANY_EMPLOYEE WHERE EMPLOYEE_ID='"+empid+"' AND EMPLOYEE_PASSWORD='"+emppwd+"'  ");
				 
				 System.out.println(" EMPLOYEE VERIFICATION DONE ");
				   
				   
				   PrintWriter out = response.getWriter();
					
					if(rs.next())
					 out.println("yes");
					
					else
					 out.println("no");
					
					
					db.s.close();
					db.c.close();
		}
		 
		 catch (SQLException e) 
		 
		 {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}   	  	    
}