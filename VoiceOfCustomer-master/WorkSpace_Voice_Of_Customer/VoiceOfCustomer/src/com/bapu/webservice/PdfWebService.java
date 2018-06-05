package com.bapu.webservice;

import java.sql.*;

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

public class PdfWebService 
{


	public Connection c;
	public Statement s;
	
	public String s1,s2,s3,s4,s5,s6,s7;
	
	public Document document = null;
	public PdfWriter writer = null;
	
	public boolean flag = false;
	
	public ResultSet rs = null;
	
	
	
	public boolean viewCustomerDetails(String ctype)
	{
		
		

		try
		{
			
			

			  Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
		    		
			  System.out.println("DB2 driver is loaded successfully");
			
			  c = DriverManager.getConnection("jdbc:db2:VOC_DB");
		      System.out.println("DB2 Database Connected");
					
		      s = c.createStatement();
		      
		      
		      if(ctype.equals("BUSINESS"))
		       {
		    	   rs = s.executeQuery("SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='"+ctype+"'  ");
		    	  
		    	  document = new Document(PageSize.A4, 50, 50, 50, 50);
		    	 
		    	  

					
		    	  
		    	  
		    	  writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_CustomerDetails\\BUSINESS_PHONE_CUSTOMER_DETAILS.pdf"));
		       
		    	    document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+"\n \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					

					
					
					document.add(new Paragraph("         BUSINESS PHONE CUSTOMER",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
					document.add(new Paragraph("                 INFORMATION SHEET",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
 
		       
		       
		       }
		      
		      if(ctype.equals("STANDARD"))
		       {
		    	   rs = s.executeQuery("SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='"+ctype+"'  ");
		    	  
		    	  document = new Document(PageSize.A4, 50, 50, 50, 50);
		    	 
		    	  
		    	  
		    	  
		    	  writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_CustomerDetails\\STANDARD_PHONE_CUSTOMER_DETAILS.pdf"));
		       
		    	    document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+"\n \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					

					
					
					document.add(new Paragraph("         STANDARD PHONE CUSTOMER",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
					document.add(new Paragraph("                 INFORMATION SHEET",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
 
		          
		       
		       }
		      
		      if(ctype.equals("GAMING"))
		       {
		    	   rs = s.executeQuery("SELECT * FROM CUSTOMER_INFORMATION WHERE PRODUCT_TYPE='"+ctype+"'  ");
		    	  
		    	  document = new Document(PageSize.A4, 50, 50, 50, 50);
		    	  
		    	 
		    	  
		    	  
		    	  writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Voice_Of_Customer_PDF_Reports\\PDF_CustomerDetails\\GAMING_PHONE_CUSTOMER_DETAILS.pdf"));
		      
		       
		    	    document.open();
					document.add(new Paragraph("AUTHOR: Bhushan \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("CREATED ON : "+new java.util.Date()+"\n \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					document.add(new Paragraph("*NOTE: This PDF will show Latest Feedback Result only after Releasing Feedback Form to Customer \n \n \n",FontFactory.getFont(FontFactory.TIMES, 14,Font.BOLDITALIC, new Color(0, 102, 255))));
					
					document.add(new Paragraph("         VOICE OF CUSTOMER  \n\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN, 30,Font.BOLDITALIC, new Color(255, 128, 0))));
					

					
					
					document.add(new Paragraph("         GAMING PHONE CUSTOMER",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
					document.add(new Paragraph("                 INFORMATION SHEET",FontFactory.getFont(FontFactory.TIMES_ROMAN, 25,Font.BOLD, new Color(116, 195, 101))));
 
		       
		       }
		    	
		      
		      
		      
		        //document = new Document(PageSize.A4, 50, 50, 50, 50);
				//writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\ANIRUDDHA\\Desktop\\WS_VoiceOfCustomer\\PDF_CustomerDetails\\BUSINESS_PHONE_CUSTOMER_DETAILS.pdf"));
				




				Paragraph title1 = new Paragraph("DETAILED REPORT : \n", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new Color(0, 0,255)));
				Chapter chapter1 = new Chapter(title1, 1);
				chapter1.setNumberDepth(0);
				Paragraph title11 = new Paragraph("REPORT CREATED AS PER SELECTED CRITERIA : \n",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,new Color(255, 0, 0)));
				Section section1 = chapter1.addSection(title11);


	            Paragraph someSectionText1 = new Paragraph("\n");
				section1.add(someSectionText1);

	            Paragraph someSectionText2 = new Paragraph("CUSTOMER INFORMATION ", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLDITALIC, new Color(111, 0, 255)));
				section1.add(someSectionText2);
				
				
				
				while(rs.next())
				{
					s1 =rs.getString(1);
					s2 =rs.getString(2);
					s3 =rs.getString(3);
					s4 =rs.getString(4);
					s5 =rs.getString(5);
					s6 =rs.getString(6);
					
					System.out.println(s1+" "+s2+" "+s3);



			Table t = new Table(2,2);

			t.setBorderColor(new Color(220, 255, 100));
			t.setPadding(5);
			t.setSpacing(1);
			t.setBorderWidth(1);

			Cell c1 = new Cell("NAME");
			t.addCell(c1);
			c1 = new Cell(s1);
			t.addCell(c1);


            Cell c2 = new Cell("ADDRESS");
			t.addCell(c2);
			c2 = new Cell(s2);
			t.addCell(c2);

			Cell c3 = new Cell("PRODUCT-ID");
			t.addCell(c3);
			c3 = new Cell(s3);
			t.addCell(c3);

			Cell c4 = new Cell("PRODUCT-TYPE");
			t.addCell(c4);
			c4 = new Cell(s4);
			t.addCell(c4);

			Cell c5 = new Cell("EMAIL ID");
			t.addCell(c5);
			c5 = new Cell(s5);
			t.addCell(c5);

			Cell c6 = new Cell("CONTACT NO.");
			t.addCell(c6);
			c6 = new Cell(s6);
			t.addCell(c6);

			

			section1.add(t);


				}




			document.add(chapter1);
			document.close();



				
				



	             System.out.println( new java.util.Date() );


				document.close();

		      
		      
			 flag = true;	
			
			
			
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			flag = false;
		}
		
		
		
		return flag;
	}
	
	
	public static void main(String[] args)
	{
		PdfWebService pws = new PdfWebService();
		
		System.out.println(   pws.viewCustomerDetails("GAMING")   );
		
		

	}

}
