package com.bapu.java;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.ArrayList;



import com.lowagie.text.Cell;
import com.lowagie.text.Chapter;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Section;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class JavaPdfCreator
{
    
	
	    boolean flag = false;
        String s1;
    
	
	public boolean createPDF(String overallrate, String ctype)
	{
		
		//File f = new File("C:\\Voice_Of_Customer_PDF_Reports");
		//f.mkdir();
		
		
		if(ctype.equals("BUSINESS"))
		{
			System.out.println("BUSINESS PDF Creation here :"+overallrate   );
			//Write PDF Creation Code; IMP-->pdfpath="C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_BusinessPhone";
		
			DB_DB2_Connect db = new DB_DB2_Connect();
			   
			   try
			   {
				
				
					Document document = new Document(PageSize.A4, 50, 50, 50, 50);
					
					//PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\ANIRUDDHA\\Desktop\\WS_VoiceOfCustomer\\PDF_Report_BusinessPhone\\BUSINESS.pdf"));
										
					
					
					//File f1 = new File("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_BusinessPhone");
					//f1.mkdir();
					
					
					
					
					PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_BusinessPhone\\BUSINESS.pdf"));
					
					document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+" \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					//document.add(new Paragraph("       MANAGEMENT   SYSTEM \n \n \n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));

					document.add(new Paragraph("  BUSNIESS PHONE FEEDBACK  RESULT ",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));





					Paragraph title1 = new Paragraph("DETAILED REPORT :\n", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new Color(0, 0, 255)));
					Chapter chapter1 = new Chapter(title1, 1);
					chapter1.setNumberDepth(0);
					
					Paragraph title11 = new Paragraph("OVERALL RATING : "+overallrate+"  \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					Paragraph title22 = new Paragraph("BUSINESS PHONE CUSTOMER COMMENTS : \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					
					Section section1 = chapter1.addSection(title11);
					Section section2 = chapter1.addSection(title22);


					
					



		     System.out.println( new java.util.Date() );


		    
		     
		    
		     ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_BUSINESS_FEEDBACK   ");
		     
		     while( rs.next() )
		     {
		    	s1 = rs.getString("COMMENT");
		    	 
		    	   Table t = new Table(1,1);

					//t.setBorderColor(new Color(220, 255, 100));
					t.setPadding(5);
					t.setSpacing(1);
					t.setBorderWidth(1);

					Cell c1 = new Cell(s1);
					t.addCell(c1);
					        


					section2.add(t);
		    	 
		    	 
		     }
				
		
					document.add(chapter1);
					document.close();

					
					flag=true;
					
				}
			   

		  catch (Exception e2)
		   {
		      System.out.println(e2.getMessage());
		      flag=false;
		   }
			
			
		
		}
		
		if(ctype.equals("GAMING"))
		{
			System.out.println("GAMING PDF Creation here :"+overallrate   );
			//Write PDF Creation Code; IMP-->pdfpath="C:\\Users\\ANIRUDDHA\\Desktop\\WS_VoiceOfCustomer\\PDF_Report_GamingPhone";
		
	
			DB_DB2_Connect db = new DB_DB2_Connect();
			   
			   try
			   {
				
				
					Document document = new Document(PageSize.A4, 50, 50, 50, 50);
					
					//File f1 = new File("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_GamingPhone");
					//f1.mkdir();
					
					
					
					
					PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_GamingPhone\\GAMING.pdf"));
					document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+" \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					//document.add(new Paragraph("       MANAGEMENT   SYSTEM \n \n \n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));

					document.add(new Paragraph("  GAMING PHONE FEEDBACK  RESULT ",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));





					Paragraph title1 = new Paragraph("DETAILED REPORT :\n", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new Color(0, 0, 255)));
					Chapter chapter1 = new Chapter(title1, 1);
					chapter1.setNumberDepth(0);
					
					Paragraph title11 = new Paragraph("OVERALL RATING : "+overallrate+"  \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					Paragraph title22 = new Paragraph("GAMING PHONE CUSTOMER COMMENTS : \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					
					Section section1 = chapter1.addSection(title11);
					Section section2 = chapter1.addSection(title22);


					
					



		     System.out.println( new java.util.Date() );


		    
		     
		    
		     ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_GAMING_FEEDBACK   ");
		     
		     while( rs.next() )
		     {
		    	s1 = rs.getString("COMMENT");
		    	 
		    	   Table t = new Table(1,1);

					//t.setBorderColor(new Color(220, 255, 100));
					t.setPadding(5);
					t.setSpacing(1);
					t.setBorderWidth(1);

					Cell c1 = new Cell(s1);
					t.addCell(c1);
					        


					section2.add(t);
		    	 
		    	 
		     }
				
		
					document.add(chapter1);
					document.close();

					
					flag=true;
					
				}
			   

		  catch (Exception e2)
		   {
		      System.out.println(e2.getMessage());
		      flag=false;
		   }
			
		
		
		}
		
		if(ctype.equals("STANDARD"))
		{
			System.out.println("STANDARD PDF Creation here :"+overallrate   );
			//Write PDF Creation Code; IMP-->pdfpath="C:\\Users\\ANIRUDDHA\\Desktop\\WS_VoiceOfCustomer\\PDF_Report_BusinessPhone";
		
			DB_DB2_Connect db = new DB_DB2_Connect();
			   
			   try
			   {
				
				
					Document document = new Document(PageSize.A4, 50, 50, 50, 50);
					
					//File f1 = new File("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_StandardPhone");
					//f1.mkdir();
					
					
					
					
					PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_StandardPhone\\STANDARD.pdf"));
					document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+" \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					
					
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					//document.add(new Paragraph("       MANAGEMENT   SYSTEM \n \n \n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));

					document.add(new Paragraph("STANDARD PHONE FEEDBACK RESULT ",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));





					Paragraph title1 = new Paragraph("DETAILED REPORT :\n", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new Color(0, 0, 255)));
					Chapter chapter1 = new Chapter(title1, 1);
					chapter1.setNumberDepth(0);
					
					Paragraph title11 = new Paragraph("OVERALL RATING : "+overallrate+"  \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					Paragraph title22 = new Paragraph("STANDARD PHONE CUSTOMER COMMENTS : \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					
					Section section1 = chapter1.addSection(title11);
					Section section2 = chapter1.addSection(title22);


					
					



		     System.out.println( new java.util.Date() );


		    
		     
		    
		     ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_STANDARD_FEEDBACK   ");
		     
		     while( rs.next() )
		     {
		    	s1 = rs.getString("COMMENT");
		    	 
		    	   Table t = new Table(1,1);

					//t.setBorderColor(new Color(220, 255, 100));
					t.setPadding(5);
					t.setSpacing(1);
					t.setBorderWidth(1);

					Cell c1 = new Cell(s1);
					t.addCell(c1);
					        


					section2.add(t);
		    	 
		    	 
		     }
				
		
					document.add(chapter1);
					document.close();

					
					flag=true;
					
				}
			   

		  catch (Exception e2)
		   {
		      System.out.println(e2.getMessage());
		      flag=false;
		   }
			
		}
		
		if(ctype.equals("SURVEY"))
		{
			System.out.println("SURVEY PDF Creation here :"+overallrate   );
			
		
			DB_DB2_Connect db = new DB_DB2_Connect();
			   
			
			Document document;
			   try
			   {
				
				
				    document = new Document(PageSize.A4, 50, 50, 50, 50);
				    
				    //File f1 = new File("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_Survey");
					//f1.mkdir();
				    
					PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_Survey\\SURVEY.pdf"));
					document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+" \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					//document.add(new Paragraph("       MANAGEMENT   SYSTEM \n \n \n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));

					document.add(new Paragraph("         SURVEY  FEEDBACK  RESULT ",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
					
					
					


					Paragraph title1 = new Paragraph("DETAILED REPORT :\n", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new Color(0, 0, 255)));
					Chapter chapter1 = new Chapter(title1, 1);
					chapter1.setNumberDepth(0);
					
					
					Paragraph title22 = new Paragraph("Customer Replied : \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					
					
					//Section section2 = chapter1.addSection(title22);
					Section section2 = null;
					
					
                     


		     System.out.println( new java.util.Date() );


		    
		     
		    
		     ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_SURVEY_FEEDBACK   ");
		     
		     //Table t = new Table(1,1);
		     
		     int i=1;
		     
		    
		     
		     while( rs.next() )
		     {
		    	
		    	 
		    	 
		    	 
		    	if(i%11==1)
		    	{
		    		section2 = chapter1.addSection(title22);
		    	}
		    	
		    	 
		    	
		    	 
		    	 s1 = rs.getString("COMMENT");
		    	 
		    	   Table t = new Table(1,1);

					//t.setBorderColor(new Color(220, 255, 100));
					t.setPadding(5);
					t.setSpacing(1);
					t.setBorderWidth(1);

					Cell c1 = new Cell(s1);
					t.addCell(c1);
					        


					section2.add(t);
					
					i++;
		    	 
		    	 
		     }
				
		
					document.add(chapter1);
					document.close();

					
					flag=true;
					
				}
			   

		  catch (Exception e2)
		   {
		      System.out.println(e2.getMessage());
		      flag=false;
		   }
			
		}
		
		
		
		
		
		if(ctype.equals("SERVICE"))
		{
			System.out.println("SERVICE PDF Creation here :"+overallrate   );
			
		
			DB_DB2_Connect db = new DB_DB2_Connect();
			   
			   try
			   {
				
				
					Document document = new Document(PageSize.A4, 50, 50, 50, 50);
					
					 // File f1 = new File("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_ServiceFeedback");
						//f1.mkdir();
					
					PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_Report_ServiceFeedback\\SERVICE.pdf"));
					document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+" \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					//document.add(new Paragraph("       MANAGEMENT   SYSTEM \n \n \n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));

					document.add(new Paragraph("         SERVICE  FEEDBACK  RESULT ",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));





					Paragraph title1 = new Paragraph("DETAILED REPORT :\n", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new Color(0, 0, 255)));
					Chapter chapter1 = new Chapter(title1, 1);
					chapter1.setNumberDepth(0);
					
					
					Paragraph title22 = new Paragraph("Customer Replied : \n\n",FontFactory.getFont(FontFactory.TIMES, 14,Font.NORMAL, new Color(0, 102, 255)));
					
					
					//Section section2 = chapter1.addSection(title22);
					Section section2 = null;


					
					



		     System.out.println( new java.util.Date() );


		    
		     
		    
		     ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_SERVICE_FEEDBACK   ");
		     
		     int i=1;
		     
		     while( rs.next() )
		     {
		    	 
		    	 
		    	 
			    	if(i%11==1)
			    	{
			    		section2 = chapter1.addSection(title22);
			    	}
		    	 
		    	 
		    	 
		    	 
		    	s1 = rs.getString("COMMENT");
		    	 
		    	   Table t = new Table(1,1);

					//t.setBorderColor(new Color(220, 255, 100));
					t.setPadding(5);
					t.setSpacing(1);
					t.setBorderWidth(1);

					Cell c1 = new Cell(s1);
					t.addCell(c1);
					        


					section2.add(t);
					
					i++;
		    	 
		    	 
		     }
				
		
					document.add(chapter1);
					document.close();

					
					flag=true;
					
				}
			   

		  catch (Exception e2)
		   {
		      System.out.println(e2.getMessage());
		      flag=false;
		   }
			
		}
		
		
		
		
		
		
		
		
		return flag;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
