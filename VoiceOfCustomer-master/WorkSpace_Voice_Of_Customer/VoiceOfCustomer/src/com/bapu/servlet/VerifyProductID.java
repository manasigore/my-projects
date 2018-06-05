package com.bapu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.bapu.java.DB_DB2_Connect;




/**
 * Servlet implementation class for Servlet: VerifyProductID
 *
 */
 public class VerifyProductID extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public VerifyProductID() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		
		HttpSession hs = request.getSession(true);
		hs.setAttribute("C", "c");
		
		
		
		
		
		String s = request.getParameter("ProductID");
	       System.out.println("SERVLET GOT = "+s);
	       
	     
	       DB_DB2_Connect db = new DB_DB2_Connect();
	       
	       try {
				
	    	      
				   
				   ResultSet rs = db.s.executeQuery("    SELECT * FROM PRODUCT_INFORMATION WHERE PRODUCT_ID='"+s+"' ");
				   
				   System.out.println(" VERIFY PRODUCT ID ");
				   
				   
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
	    	   System.out.println("VERIFY PRODUCT ID failed");
			e.printStackTrace();
		   }
	       
	      
	       
	       
	       
			
		}
		
		
	  	  	    
}