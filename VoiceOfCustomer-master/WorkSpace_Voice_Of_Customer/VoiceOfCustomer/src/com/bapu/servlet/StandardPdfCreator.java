package com.bapu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapu.java.ActualPdfCreator;

/**
 * Servlet implementation class for Servlet: StandardPdfCreator
 *
 */
 public class StandardPdfCreator extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    
	public StandardPdfCreator() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		

        try {
			String ctype = "STANDARD";
			
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
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}   	  	    
}