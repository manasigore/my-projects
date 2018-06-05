package com.bapu.java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConstructForm 
{

	 ArrayList<String> qholder = new ArrayList<String>();

		public ArrayList<String> getQuestion(String ctype)
		{
			if( ctype.equals("BUSINESS")  )
			{
				/*
				1. DBCode
				
				2. Select *
				   From BUSINESS_QUESTION
				   
				3. ResultSet rs = ......;
				
				4. While(rs.next())
				   {
				      
				      qholder.add(  rs.getString("QUESTION") );
				   
				   }   			
				5. 
				   
				   
				*/
				
				System.out.println("POJO = "+ctype);
				
				try {
					DB_DB2_Connect db = new DB_DB2_Connect();
					
					
					
					
					ResultSet rs = db.s.executeQuery("    SELECT * FROM BUSINESS_QUESTION  ");
					
					while( rs.next() )
					{
						
						qholder.add(  rs.getString("QUESTION")  );
						
					}
					
					System.out.println("POJO = "+qholder);
					
				} 
				
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				
				
			}
			
			
			if(ctype.equals("GAMING"))
			{
				
				
				
				System.out.println("POJO = "+ctype);
				
				try {
					DB_DB2_Connect db = new DB_DB2_Connect();
					
					
					
					ResultSet rs = db.s.executeQuery("    SELECT * FROM GAMING_QUESTIONS  ");
					
					while( rs.next() )
					{
						
						qholder.add(  rs.getString("QUESTION")  );
						
					}
					
					System.out.println("POJO = "+qholder);
					
				} 
				
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				
			}
		
			
			
			
			if(ctype.equals("STANDARD"))
			{
				
				
				
				System.out.println("POJO = "+ctype);
				
				try {
					DB_DB2_Connect db = new DB_DB2_Connect();
					
					
					
					ResultSet rs = db.s.executeQuery("    SELECT * FROM STANDARD_QUESTION  ");
					
					while( rs.next() )
					{
						
						qholder.add(  rs.getString("QUESTION")  );
						
					}
					
					System.out.println("POJO = "+qholder);
					
				} 
				
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				
			}
		
			
			
			if(ctype.equals("SURVEY"))
			{
				
				
				
				System.out.println("POJO = "+ctype);
				
				try {
					DB_DB2_Connect db = new DB_DB2_Connect();
					
					
					
					ResultSet rs = db.s.executeQuery("    SELECT * FROM SURVEY_QUESTION  ");
					
					while( rs.next() )
					{
						
						qholder.add(  rs.getString("QUESTION")  );
						
					}
					
					System.out.println("POJO = "+qholder);
					
				} 
				
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				
			}
			
			
			
			
			
			
			return(qholder);
			
		}
		
		
		
		public static void main(String[] args) 
		{
			
			
			

		}

	
	
	
}
