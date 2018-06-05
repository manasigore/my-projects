package com.bapu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapu.java.UpdateQuestionToDB;

/**
 * Servlet implementation class for Servlet: UpdateQuestion
 *
 */
 public class UpdateQuestion extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
   
	public UpdateQuestion() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
         String ctype = request.getParameter("ctype");
		
		String q[] = new String[10];
		
				q[0] =  request.getParameter("Q1");
				q[1] =  request.getParameter("Q2");
				q[2] =  request.getParameter("Q3");
				q[3] =  request.getParameter("Q4");
				q[4] =  request.getParameter("Q5");
				q[5] =  request.getParameter("Q6");
				q[6] =  request.getParameter("Q7");
				q[7] =  request.getParameter("Q8");
				q[8] =  request.getParameter("Q9");
				q[9] =  request.getParameter("Q10");
				
		             
		
		
		
		
		if( ctype.equals("BUSINESS") )
		{
			
			System.out.println("SERVLET" + ctype + q[0]+q[9]);
			
			UpdateQuestionToDB uqtd = new UpdateQuestionToDB();
			
			boolean f = uqtd.sendToDB(ctype, q);
			
			if(f==true)
			{
				System.out.println("NEW Busi Question Sent To DB");
				
				response.sendRedirect("UpdateSuccess.jsp");
				
			}
			
			else
			{
				System.out.println("Failed to send Busi Question To DB");
				response.sendRedirect("UpdateFail.jsp");
			}
			
			
			
		}	
		
		
		
		
		
			
		if( ctype.equals("GAMING") )
		{
			

			System.out.println("SERVLET" + ctype + q[0]+q[9]);
			
			UpdateQuestionToDB uqtd = new UpdateQuestionToDB();
			
			boolean f = uqtd.sendToDB(ctype, q);
			
			if(f==true)
			{
				System.out.println("NEW gaming Question Sent To DB");
				
				response.sendRedirect("UpdateSuccess.jsp");
				
			}
			
			else
			{
				System.out.println("Failed to send Busi Question To DB");
				response.sendRedirect("UpdateFail.jsp");
			}
			
			
		}	
		
		
		
		
		
		if( ctype.equals("STANDARD") )
		{
			

			System.out.println("SERVLET" + ctype + q[0]+q[9]);
			
			UpdateQuestionToDB uqtd = new UpdateQuestionToDB();
			
			boolean f = uqtd.sendToDB(ctype, q);
			
			if(f==true)
			{
				System.out.println("NEW STANDARD Question Sent To DB");
				
				response.sendRedirect("UpdateSuccess.jsp");
				
			}
			
			else
			{
				System.out.println("Failed to send Busi Question To DB");
				response.sendRedirect("UpdateFail.jsp");
			}
			
			
		}	
		
		
		
		
		
		if( ctype.equals("SURVEY") )
		{
			

			System.out.println("SERVLET" + ctype + q[0]+q[9]);
			
			UpdateQuestionToDB uqtd = new UpdateQuestionToDB();
			
			boolean f = uqtd.sendToDB(ctype, q);
			
			if(f==true)
			{
				System.out.println("NEW SURVEY Question Sent To DB");
				
				response.sendRedirect("UpdateSuccess.jsp");
				
			}
			
			else
			{
				System.out.println("Failed to send Busi Question To DB");
				response.sendRedirect("UpdateFail.jsp");
			}
			
			
		}	
		
		
		
		
	}   	  	    
}