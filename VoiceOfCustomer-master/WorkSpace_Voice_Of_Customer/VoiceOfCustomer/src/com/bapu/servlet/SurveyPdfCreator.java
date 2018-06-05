package com.bapu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapu.java.ActualPdfCreator;

/**
 * Servlet implementation class for Servlet: SurveyPdfCreator
 *
 */
 public class SurveyPdfCreator extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public SurveyPdfCreator() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		

        try {
			String ctype = "SURVEY";
			
			ActualPdfCreator apc = new ActualPdfCreator();
			
			String pdfpath =  apc.createPdf(ctype);
			
			if(pdfpath==null)
			{
			  
				System.out.println("PDF CREATION FAILED");
				
				response.sendRedirect("/VoiceOfCustomer/PdfCreationFail.jsp");
				
				
			}
			
			else
			{
				
				System.out.println( "PDF PATH = "+pdfpath );
				
				request.setAttribute("PDFPATH",pdfpath);
				
				RequestDispatcher rd =  request.getRequestDispatcher("PdfUrl.jsp");
				
				rd.forward(request,response);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}