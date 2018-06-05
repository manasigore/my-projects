package com.bapu.java;

import java.sql.SQLException;

public class ProcessFeedback 
{
	
	

	boolean flag = false;
	
	String FormRate = null;
	
	public boolean getRating( String ctype, String q[], String comment    )
	{
		System.out.println("POJO"+comment);
		
		if(ctype.equals("BUSINESS"))
		{
			
			int g=0,b=0,a=0;
			
			if(q[0].equals("GOOD")) { g++; }
			if(q[0].equals("BAD")) { b++; }
			if(q[0].equals("AVG")) { a++; }
			
			if(q[1].equals("GOOD")) { g++; }
			if(q[1].equals("BAD")) { b++; }
			if(q[1].equals("AVG")) { a++; }
			
			if(q[2].equals("GOOD")) { g++; }
			if(q[2].equals("BAD")) { b++; }
			if(q[2].equals("AVG")) { a++; }
			
			if(q[3].equals("GOOD")) { g++; }
			if(q[3].equals("BAD")) { b++; }
			if(q[3].equals("AVG")) { a++; }
			
			if(q[4].equals("GOOD")) { g++; }
			if(q[4].equals("BAD")) { b++; }
			if(q[4].equals("AVG")) { a++; }
			
			if(q[5].equals("GOOD")) { g++; }
			if(q[5].equals("BAD")) { b++; }
			if(q[5].equals("AVG")) { a++; }
			
			if(q[6].equals("GOOD")) { g++; }
			if(q[6].equals("BAD")) { b++; }
			if(q[6].equals("AVG")) { a++; }
			
			if(q[7].equals("GOOD")) { g++; }
			if(q[7].equals("BAD")) { b++; }
			if(q[7].equals("AVG")) { a++; }
			
			if(q[8].equals("GOOD")) { g++; }
			if(q[8].equals("BAD")) { b++; }
			if(q[9].equals("AVG")) { a++; }
			
			if(q[9].equals("GOOD")) { g++; }
			if(q[9].equals("BAD")) { b++; }
			if(q[9].equals("AVG")) { a++; }
			
			
			
			System.out.println("GOOD ="+g );
			System.out.println("BAD ="+b );
			System.out.println("AVG ="+a );
			System.out.println("BUSINESS CUSTOMER COMMENT="+ comment );
			
			if(g==b ) { FormRate="AVERAGE";  }
			
			else
			{
				
				if(g>b)
				    {
	                       if(g>a)
	                       {
	                    	   FormRate="GOOD";
	                       }
	                       
	                       else
						   {
							   FormRate="AVERAGE";
						   }
	                       
			     	}
				
				else
			    	{
					   if(b>a)
					   {
						   FormRate="BAD";
					   }
					   
					   else
					   {
						   FormRate="AVERAGE";
					   }
				    }
					
			}
			
			
			System.out.println("OVERALL RATING OF 'BUSINESS CUSTOMER FEEDBACK FORM' : "+FormRate );
			
			
			/*
			 
			 1. DBCode
			 2. Insert   "comment and FormRate"    into RECEIVED_BUSINESS_FEEDBACK(table)
			 
			 			 
			 */
			
			
			DB_DB2_Connect db = new DB_DB2_Connect();
			
			try {
				db.s.execute("INSERT INTO RECEIVED_BUSINESS_FEEDBACK VALUES( '"+FormRate+"' , '"+comment+"'  )    ");
				flag = true;
			    }
			
			catch (SQLException e) 
			{
				
				e.printStackTrace();
				flag = false;
			}
			
			
					
		  
		}
		
		
		
		
		
		
		
		
		
		if(ctype.equals("GAMING"))
		{
			
			
            int g=0,b=0,a=0;
			
			if(q[0].equals("GOOD")) { g++; }
			if(q[0].equals("BAD")) { b++; }
			if(q[0].equals("AVG")) { a++; }
			
			if(q[1].equals("GOOD")) { g++; }
			if(q[1].equals("BAD")) { b++; }
			if(q[1].equals("AVG")) { a++; }
			
			if(q[2].equals("GOOD")) { g++; }
			if(q[2].equals("BAD")) { b++; }
			if(q[2].equals("AVG")) { a++; }
			
			if(q[3].equals("GOOD")) { g++; }
			if(q[3].equals("BAD")) { b++; }
			if(q[3].equals("AVG")) { a++; }
			
			if(q[4].equals("GOOD")) { g++; }
			if(q[4].equals("BAD")) { b++; }
			if(q[4].equals("AVG")) { a++; }
			
			if(q[5].equals("GOOD")) { g++; }
			if(q[5].equals("BAD")) { b++; }
			if(q[5].equals("AVG")) { a++; }
			
			if(q[6].equals("GOOD")) { g++; }
			if(q[6].equals("BAD")) { b++; }
			if(q[6].equals("AVG")) { a++; }
			
			if(q[7].equals("GOOD")) { g++; }
			if(q[7].equals("BAD")) { b++; }
			if(q[7].equals("AVG")) { a++; }
			
			if(q[8].equals("GOOD")) { g++; }
			if(q[8].equals("BAD")) { b++; }
			if(q[9].equals("AVG")) { a++; }
			
			if(q[9].equals("GOOD")) { g++; }
			if(q[9].equals("BAD")) { b++; }
			if(q[9].equals("AVG")) { a++; }
			
			
			
			System.out.println("GOOD ="+g );
			System.out.println("BAD ="+b );
			System.out.println("AVG ="+a );
			System.out.println("GAMING CUSTOMER COMMENT="+ comment );
			
			if(g==b ) { FormRate="AVERAGE";  }
			
			else
			{
				
				if(g>b)
				    {
	                       if(g>a)
	                       {
	                    	   FormRate="GOOD";
	                       }
	                       
	                       else
						   {
							   FormRate="AVERAGE";
						   }
	                       
			     	}
				
				else
			    	{
					   if(b>a)
					   {
						   FormRate="BAD";
					   }
					   
					   else
					   {
						   FormRate="AVERAGE";
					   }
				    }
					
			}
			
			
			System.out.println("OVERALL RATING OF 'GAMING CUSTOMER FEEDBACK FORM' : "+FormRate );
			
			
			/*
			 
			 1. DBCode
			 2. Insert   "comment and FormRate"    into RECEIVED_BUSINESS_FEEDBACK(table)
			 
			 			 
			 */
			
			
			DB_DB2_Connect db = new DB_DB2_Connect();
			
			try {
				db.s.execute("INSERT INTO RECEIVED_GAMING_FEEDBACK VALUES( '"+FormRate+"' , '"+comment+"'  )    ");
				flag = true;
			    }
			
			catch (SQLException e) 
			{
				
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		
		
	
		
		if(ctype.equals("STANDARD"))
		{
			
			
            int g=0,b=0,a=0;
			
			if(q[0].equals("GOOD")) { g++; }
			if(q[0].equals("BAD")) { b++; }
			if(q[0].equals("AVG")) { a++; }
			
			if(q[1].equals("GOOD")) { g++; }
			if(q[1].equals("BAD")) { b++; }
			if(q[1].equals("AVG")) { a++; }
			
			if(q[2].equals("GOOD")) { g++; }
			if(q[2].equals("BAD")) { b++; }
			if(q[2].equals("AVG")) { a++; }
			
			if(q[3].equals("GOOD")) { g++; }
			if(q[3].equals("BAD")) { b++; }
			if(q[3].equals("AVG")) { a++; }
			
			if(q[4].equals("GOOD")) { g++; }
			if(q[4].equals("BAD")) { b++; }
			if(q[4].equals("AVG")) { a++; }
			
			if(q[5].equals("GOOD")) { g++; }
			if(q[5].equals("BAD")) { b++; }
			if(q[5].equals("AVG")) { a++; }
			
			if(q[6].equals("GOOD")) { g++; }
			if(q[6].equals("BAD")) { b++; }
			if(q[6].equals("AVG")) { a++; }
			
			if(q[7].equals("GOOD")) { g++; }
			if(q[7].equals("BAD")) { b++; }
			if(q[7].equals("AVG")) { a++; }
			
			if(q[8].equals("GOOD")) { g++; }
			if(q[8].equals("BAD")) { b++; }
			if(q[9].equals("AVG")) { a++; }
			
			if(q[9].equals("GOOD")) { g++; }
			if(q[9].equals("BAD")) { b++; }
			if(q[9].equals("AVG")) { a++; }
			
			
			
			System.out.println("GOOD ="+g );
			System.out.println("BAD ="+b );
			System.out.println("AVG ="+a );
			System.out.println("STANDARD CUSTOMER COMMENT="+ comment );
			
			if(g==b ) { FormRate="AVERAGE";  }
			
			else
			{
				
				if(g>b)
				    {
	                       if(g>a)
	                       {
	                    	   FormRate="GOOD";
	                       }
	                       
	                       else
						   {
							   FormRate="AVERAGE";
						   }
	                       
			     	}
				
				else
			    	{
					   if(b>a)
					   {
						   FormRate="BAD";
					   }
					   
					   else
					   {
						   FormRate="AVERAGE";
					   }
				    }
					
			}
			
			
			System.out.println("OVERALL RATING OF 'STANDARD CUSTOMER FEEDBACK FORM' : "+FormRate );
			
			
			/*
			 
			 1. DBCode
			 2. Insert   "comment and FormRate"    into RECEIVED_BUSINESS_FEEDBACK(table)
			 
			 			 
			 */
			
			
			DB_DB2_Connect db = new DB_DB2_Connect();
			
			try {
				
				
				db.s.execute("INSERT INTO RECEIVED_STANDARD_FEEDBACK VALUES( '"+FormRate+"' , '"+comment+"'  )    ");
				
				
				flag = true;
			    }
			
			catch (SQLException e) 
			{
				
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		
		
		
		
		

		
		if(ctype.equals("SURVEY"))
		{
			
			
           
			
			System.out.println("SURVEY FEEDBACK RECEIVED");
			
			System.out.println(q[0]  +  q[9]);
			
			
			
			DB_DB2_Connect db = new DB_DB2_Connect();
			
			try {
				
				for(int j=0; j<=9; j++)
				 {
					db.s.execute("INSERT INTO RECEIVED_SURVEY_FEEDBACK VALUES( '"+q[j]+"' )    ");
				 }
				
				db.s.execute("INSERT INTO RECEIVED_SURVEY_FEEDBACK VALUES( '"+comment+"' )    ");
							
				flag = true;
			    }
			
			catch (SQLException e) 
			{
				
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		
		
		
		
		if(ctype.equals("SERVICE"))
		{
			
			
           
			
			System.out.println("SERVICE FEEDBACK RECEIVED");
			
			System.out.println(q[0]  +  q[9]);
			
			
			
			DB_DB2_Connect db = new DB_DB2_Connect();
			
			try {
				
				for(int j=0; j<=9; j++)
				 {
					db.s.execute("INSERT INTO RECEIVED_SERVICE_FEEDBACK VALUES( '"+q[j]+"' )    ");
				 }
				
				db.s.execute("INSERT INTO RECEIVED_SERVICE_FEEDBACK VALUES( '"+comment+"' )    ");
							
				flag = true;
			    }
			
			catch (SQLException e) 
			{
				
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		
		
		
		
		return flag;
	}
	
	
	
	
	
	

}
