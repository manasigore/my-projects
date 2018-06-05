package com.bapu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bapu.java.ProcessFeedback;

/**
 * Servlet implementation class for Servlet: ReceivedFeedbackForm
 *
 */
 public class ReceivedFeedbackForm extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ReceivedFeedbackForm() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		


		HttpSession hs = request.getSession(true);
		hs.setAttribute("BF", "bf");
		
		
		
		
		
		String q[] = new String[10];
		
        String ctype = request.getParameter("ctype");
		
		 
		q[0]= request.getParameter("Q1");
		q[1]= request.getParameter("Q2"); 
		q[2]= request.getParameter("Q3");
		q[3]= request.getParameter("Q4");
		q[4]= request.getParameter("Q5");
		q[5]= request.getParameter("Q6");
		q[6]= request.getParameter("Q7");
		q[7]= request.getParameter("Q8");
		q[8]= request.getParameter("Q9");
		q[9]= request.getParameter("Q10");
				     
		
		
		
		
		System.out.println(" Q1 =   "+q[0]);
		
		System.out.println(" Q10 =   "+q[9]);
		
		if(ctype.equals("BUSINESS"))
		{
			
			
			
			String comment = request.getParameter("COMMENT");
			System.out.println(ctype+"  "+q[9]+"  "+comment+"  " );
			
			
			ProcessFeedback pf = new ProcessFeedback();
			
			boolean f = pf.getRating(ctype, q, comment);
			
			if( f == true)
			{
				System.out.println("Feedback Submitted");
				response.sendRedirect("/VoiceOfCustomer/FeedbackSuccess.jsp");
				
			}
			else
			{
				System.out.println("Feedback Fail");
				response.sendRedirect("/VoiceOfCustomer/FeedbackFail.jsp");
			}
			
			
			
		}
		
		
		if(ctype.equals("GAMING"))
		{
			String comment = request.getParameter("COMMENT");
			System.out.println(ctype+"  "+q[9]+"  "+comment+"  " );
			
			ProcessFeedback pf = new ProcessFeedback();
			
			boolean f = pf.getRating(ctype, q, comment);
			
			if( f == true)
			{
				System.out.println("Feedback Submitted");
				response.sendRedirect("/VoiceOfCustomer/FeedbackSuccess.jsp");
				
			}
			else
			{
				System.out.println("Feedback Fail");
				response.sendRedirect("/VoiceOfCustomer/FeedbackFail.jsp");
			}
			
		}
		
		
		
		

		if(ctype.equals("STANDARD"))
		{
			String comment = request.getParameter("COMMENT");
			System.out.println(ctype+"  "+q[9]+"  "+comment+"  " );
			
			ProcessFeedback pf = new ProcessFeedback();
			
			boolean f = pf.getRating(ctype, q, comment);
			
			if( f == true)
			{
				System.out.println("Feedback Submitted");
				response.sendRedirect("/VoiceOfCustomer/FeedbackSuccess.jsp");
				
			}
			else
			{
				System.out.println("Feedback Fail");
				response.sendRedirect("/VoiceOfCustomer/FeedbackFail.jsp");
			}
			
		}
		
		
		
		
		if(ctype.equals("SURVEY"))
		{
			String comment = request.getParameter("COMMENT");
           
			
			ProcessFeedback pf = new ProcessFeedback();
			
			boolean f = pf.getRating(ctype, q, comment);
			
			if( f == true)
			{
				System.out.println("Feedback Submitted");
				response.sendRedirect("/VoiceOfCustomer/FeedbackSuccess.jsp");
				
			}
			else
			{
				System.out.println("Feedback Fail");
				response.sendRedirect("/VoiceOfCustomer/FeedbackFail.jsp");
			}
			
		}
		
		
		
		
		if(ctype.equals("SERVICE"))
		{
           
			String comment = request.getParameter("COMMENT");
			
			ProcessFeedback pf = new ProcessFeedback();
			
			boolean f = pf.getRating(ctype, q, comment);
			
			if( f == true)
			{
				System.out.println("Feedback Submitted");
				response.sendRedirect("/VoiceOfCustomer/FeedbackSuccess.jsp");
				
			}
			else
			{
				System.out.println("Feedback Fail");
				response.sendRedirect("/VoiceOfCustomer/FeedbackFail.jsp");
			}
			
		}
		
		
		
	}   	  	    
}