package com.bapu.servlet;




import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapu.java.MailSender;

/**
 * Servlet implementation class for Servlet: MailToCustomer
 *
 */
 public class MailToCustomer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public MailToCustomer() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String ctype = request.getParameter("ctype");
		System.out.println("SERVLET"+ctype);
		
		
		if( ctype.equals("BUSINESS") )
		{
			
			
			
			MailSender ms = new MailSender();
			
			boolean f = ms.prepareMail(ctype);
			
			if(f==true)
			{
				System.out.println("MailSEND");
				response.sendRedirect("/VoiceOfCustomer/MailSendingSuccess.jsp");
			}
			
			else
			{
				System.out.println("Mail failed");
				response.sendRedirect("/VoiceOfCustomer/MailSendingFail.JSP");
			}
			
			
		}
		
		
		if( ctype.equals("GAMING") )
		{
			
            
			MailSender ms = new MailSender();
			
			boolean f = ms.prepareMail(ctype);
			
			if(f==true)
			{
				System.out.println("MailSEND");
				response.sendRedirect("/VoiceOfCustomer/MailSendingSuccess.jsp");
			}
			
			else
			{
				System.out.println("Mail failed");
				response.sendRedirect("/VoiceOfCustomer/MailSendingFail.JSP");
			}
			
		}
		
		
		if( ctype.equals("STANDARD") )
		{
			
            
			
			MailSender ms = new MailSender();
			
			boolean f = ms.prepareMail(ctype);
			
			if(f==true)
			{
				System.out.println("MailSEND");
				response.sendRedirect("/VoiceOfCustomer/MailSendingSuccess.jsp");
			}
			
			else
			{
				System.out.println("Mail failed");
				response.sendRedirect("/VoiceOfCustomer/MailSendingFail.JSP");
			}
			
			
			
		}
		
		
		
		if( ctype.equals("SURVEY") )
		{
			
            
			
			MailSender ms = new MailSender();
			
			boolean f = ms.prepareMail(ctype);
			
			if(f==true)
			{
				System.out.println("MailSEND");
				response.sendRedirect("/VoiceOfCustomer/MailSendingSuccess.jsp");
			}
			
			else
			{
				System.out.println("Mail failed");
				response.sendRedirect("/VoiceOfCustomer/MailSendingFail.JSP");
			}
			
			
			
		}
		
		
		if( ctype.equals("SERVICE") )
		{
			
            
			
			MailSender ms = new MailSender();
			
			boolean f = ms.prepareMail(ctype);
			
			if(f==true)
			{
				System.out.println("MailSEND");
				response.sendRedirect("/VoiceOfCustomer/MailSendingSuccess.jsp");
			}
			
			else
			{
				System.out.println("Mail failed");
				response.sendRedirect("/VoiceOfCustomer/MailSendingFail.JSP");
			}
			
			
			
		}
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}   	  	    
}