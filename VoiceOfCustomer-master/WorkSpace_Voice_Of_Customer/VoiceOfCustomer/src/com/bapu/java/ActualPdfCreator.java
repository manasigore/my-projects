package com.bapu.java;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class ActualPdfCreator
{


	String pdfpath = null;
	String overallrate = null;
	
	ArrayList<String> ratinglist = new ArrayList<String>();
	ArrayList<String> commentlist = new ArrayList<String>();
	
	
	  int g=0,b=0,a=0;
	
	
	
	
   public String createPdf( String ctype) throws Exception
   {
	     
	   System.out.println("POJO of PDF Creator "+ ctype);
	   
	  
	      
	   
	   if(  ctype.equals("BUSINESS") )
	   {
		   	   
		   
		   
		   
		   try
		   {
			   
			   DB_DB2_Connect db = new DB_DB2_Connect();			   
			   
			ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_BUSINESS_FEEDBACK   ");
			   
			 
			   
			   while( rs.next() )
			   {
				   
				   ratinglist.add(  rs.getString("RATING")   );
			       //commentlist.add(  rs.getString("COMMENT")   );
			   }
		   
		   
			   Iterator<String> i = ratinglist.iterator();
		         
		         while( i.hasNext()  )
		          {
		          
		               String rate =  i.next();
		               
		               if( rate.equals("GOOD") )
		                 { 
		                     g++;
		                 }
		                 
		                 if( rate.equals("BAD") )
		                 { 
		                     b++;
		                 }
		                 
		                 if( rate.equals("AVERAGE") )
		                 { 
		                     a++;
		                 }
		          
		          
		          }
		         
		         
                   } //try block ends
		   
		   
		   
		   
		   
		   catch (SQLException e)
		   {
			e.printStackTrace();
			pdfpath=null;
		   }
		   
		   finally
		   {
               
			   
			   
			   
		   }
		   
		         
		         System.out.println("G in PDF ="+g);
		         System.out.println("B in PDF="+b);
		         System.out.println("A in PDF="+a);
		         
		      // So here I have ---->  g=7, b=2, a=3 
		       
		     if(g==b) { overallrate="AVERAGE";  }
			
			else
			{
				
				if(g>b)
				    {
	                       if(g>a)
	                       {
	                    	   overallrate="GOOD";
	                       }
	                       
	                       else
						   {
							   overallrate="AVERAGE";
						   }
	                       
			     	}
				
				else
			    	{
					   if(b>a)
					   {
						   overallrate="BAD";
					   }
					   
					   else
					   {
						   overallrate="AVERAGE";
					   }
				    }
					
			}
			
			
			System.out.println("OVERALL RATING OF 'RECEIVED_BUSINESS_FEEDBACK'(table) : "+overallrate );
			//System.out.println("ALL COMMENTS RECEIVED : "+commentlist );
			
			
			JavaPdfCreator jpc = new JavaPdfCreator();
			boolean f = jpc.createPDF( overallrate,ctype  );
			
			
			
			

			
			  
			
			
		   
		    if(f==true)
		    {
		    	pdfpath="B";
		    }
		    
		    else
		    {
		    	pdfpath=null;
		    }
		   
		   
		   
		   
		   
		   return pdfpath;
		   
	   }
	   
	   
	   
	   
	   
	   
	   /* For GAMING */
	   
	   
	   
	   if(  ctype.equals("GAMING") )
	   {
		 
   
			   DB_DB2_Connect db = new DB_DB2_Connect();
			   
			   try
			   {
				ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_GAMING_FEEDBACK   ");
				   
				   int g=0,b=0,a=0;
				   
				   while( rs.next() )
				   {
					   
					   ratinglist.add(  rs.getString("RATING")   );
				      // commentlist.add(  rs.getString("COMMENT")   );
				   }
			   
			   
				   Iterator<String> i = ratinglist.iterator();
			         
			         while( i.hasNext()  )
			          {
			          
			               String rate =  i.next();
			               
			               if( rate.equals("GOOD") )
			                 { 
			                     g++;
			                 }
			                 
			                 if( rate.equals("BAD") )
			                 { 
			                     b++;
			                 }
			                 
			                 if( rate.equals("AVERAGE") )
			                 { 
			                     a++;
			                 }
			          
			          
			          }
			         
			         System.out.println("G in PDF ="+g);
			         System.out.println("B in PDF="+b);
			         System.out.println("A in PDF="+a);
			         
			      // So here I have ---->  g=7, b=2, a=3 
			       
			     if(g==b) { overallrate="AVERAGE";  }
				
				else
				{
					
					if(g>b)
					    {
		                       if(g>a)
		                       {
		                    	   overallrate="GOOD";
		                       }
		                       
		                       else
							   {
								   overallrate="AVERAGE";
							   }
		                       
				     	}
					
					else
				    	{
						   if(b>a)
						   {
							   overallrate="BAD";
						   }
						   
						   else
						   {
							   overallrate="AVERAGE";
						   }
					    }
						
				}
				
				
				System.out.println("OVERALL RATING OF 'RECEIVED_GAMING_FEEDBACK'(table) : "+overallrate );
				//System.out.println("ALL COMMENTS RECEIVED : "+commentlist );
				
				
				JavaPdfCreator jpc = new JavaPdfCreator();
				boolean f = jpc.createPDF( overallrate,ctype  );
				
			   
			    if(f==true)
			    {
			    	pdfpath="G";
			    }
			    
			    else
			    {
			    	pdfpath=null;
			    }
			   
			   
			   } //try block ends
			   
			   
			   
			   
			   
			   catch (SQLException e)
			   {
				e.printStackTrace();
				pdfpath=null;
			   }
			   
			   
			   
			   return pdfpath;
		   
		  
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   /*
	    For STANDARD 
	    */

	   if(  ctype.equals("STANDARD") )
	   {
		 

			   
			   DB_DB2_Connect db = new DB_DB2_Connect();
			   
			   try
			   {
				ResultSet rs = db.s.executeQuery(" SELECT * FROM RECEIVED_STANDARD_FEEDBACK   ");
				   
				   int g=0,b=0,a=0;
				   
				   while( rs.next() )
				   {
					   
					   ratinglist.add(  rs.getString("RATING")   );
				       //commentlist.add(  rs.getString("COMMENT")   );
				   }
			   
			   
				   Iterator<String> i = ratinglist.iterator();
			         
			         while( i.hasNext()  )
			          {
			          
			               String rate =  i.next();
			               
			               if( rate.equals("GOOD") )
			                 { 
			                     g++;
			                 }
			                 
			                 if( rate.equals("BAD") )
			                 { 
			                     b++;
			                 }
			                 
			                 if( rate.equals("AVERAGE") )
			                 { 
			                     a++;
			                 }
			          
			          
			          }
			         
			         System.out.println("G in PDF ="+g);
			         System.out.println("B in PDF="+b);
			         System.out.println("A in PDF="+a);
			         
			      // So here I have ---->  g=7, b=2, a=3 
			       
			     if(g==b) { overallrate="AVERAGE";  }
				
				else
				{
					
					if(g>b)
					    {
		                       if(g>a)
		                       {
		                    	   overallrate="GOOD";
		                       }
		                       
		                       else
							   {
								   overallrate="AVERAGE";
							   }
		                       
				     	}
					
					else
				    	{
						   if(b>a)
						   {
							   overallrate="BAD";
						   }
						   
						   else
						   {
							   overallrate="AVERAGE";
						   }
					    }
						
				}
				
				
				System.out.println("OVERALL RATING OF 'RECEIVED_STANDARD_FEEDBACK'(table) : "+overallrate );
				System.out.println("ALL COMMENTS RECEIVED : "+commentlist );
				
				
				JavaPdfCreator jpc = new JavaPdfCreator();
				boolean f = jpc.createPDF( overallrate,ctype  );
				
			   
			    if(f==true)
			    {
			    	pdfpath="S";
			    }
			    
			    else
			    {
			    	pdfpath=null;
			    }
			   
			   
			   } //try block ends
			   			   
			   
			   catch (SQLException e)
			   {
				e.printStackTrace();
				pdfpath=null;
			   }
			    
	     }
	  
	     
	   
	   
	   
	   
	   if(  ctype.equals("SURVEY") )
	   {
		 

				
				
				JavaPdfCreator jpc = new JavaPdfCreator();
				boolean f = jpc.createPDF( "NONE",ctype  );
				
			   
			    if(f==true)
			    {
			    	pdfpath="SU";
			    }
			    
			    else
			    {
			    	pdfpath=null;
			    }
			   
			   
			   
			    
	     }
	   
	   
	   
	   
	   
	   
	   
	   if(  ctype.equals("SERVICE") )
	   {
		 

			
				
				
				JavaPdfCreator jpc = new JavaPdfCreator();
				boolean f = jpc.createPDF( "NONE",ctype  );
				
			   
			    if(f==true)
			    {
			    	pdfpath="SE";
			    }
			    
			    else
			    {
			    	pdfpath=null;
			    }
			   
			   
			 
			    
	     }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   return pdfpath;
   }
	 
	
}
