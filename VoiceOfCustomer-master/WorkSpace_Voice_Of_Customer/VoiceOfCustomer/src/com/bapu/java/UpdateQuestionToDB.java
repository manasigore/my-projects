package com.bapu.java;

public class UpdateQuestionToDB
{


	boolean flag = false;
	
	
	public boolean sendToDB( String ctype, String q[])
	{
		
		if( ctype.equals("BUSINESS") )
		{
			
			System.out.println("Busi POJO got = "+ctype+q[0]+q[9]);
			
			/*
			 
			 1. DBCode
			 
			 2. DELETE 
			    From BUSINESS_QUESTION_FORM (table)
			    
			 3. INSERT  "q"  into   BUSINESS_QUESTION_FORM (table)  
			 
			 4. If Success-> flag=TRUE;
			 
			 */
			
			try
			{
				DB_DB2_Connect db = new DB_DB2_Connect();
				
				db.s.execute(" DELETE FROM BUSINESS_QUESTION ");
				//db.s.execute(" DELETE FROM RECEIVED_BUSINESS_FEEDBACK ");
				
				for(int j=0; j<=9; j++)
				{
					db.s.execute("INSERT INTO BUSINESS_QUESTION VALUES( '"+q[j]+"'  )   ");
				}
				
				flag=true;
				
			}
			catch(Exception e)
			{
				flag = false;
			}
			
			
			
			
			
		}
		
		
		
		if( ctype.equals("GAMING") )
		{
			

			System.out.println("Gaming POJO got = "+ctype+q[0]+q[9]);
			
			/*
			 
			 1. DBCode
			 
			 2. DELETE 
			    From BUSINESS_QUESTION_FORM (table)
			    
			 3. INSERT  "q"  into   BUSINESS_QUESTION_FORM (table)  
			 
			 4. If Success-> flag=TRUE;
			 
			 */
			
			try
			{
				DB_DB2_Connect db = new DB_DB2_Connect();
				
				db.s.execute(" DELETE FROM GAMING_QUESTIONS ");
				//db.s.execute(" DELETE FROM RECEIVED_GAMING_FEEDBACK ");
				
				for(int j=0; j<=9; j++)
				{
					db.s.execute("INSERT INTO GAMING_QUESTIONS VALUES( '"+q[j]+"'  )   ");
				}
				
				flag=true;
				
			}
			catch(Exception e)
			{
				flag = false;
			}
			
			
			
		}
		
		
		
		
		

		if( ctype.equals("STANDARD") )
		{
			

			System.out.println("STANDARD POJO got = "+ctype+q[0]+q[9]);
			
			/*
			 
			 1. DBCode
			 
			 2. DELETE 
			    From BUSINESS_QUESTION_FORM (table)
			    
			 3. INSERT  "q"  into   BUSINESS_QUESTION_FORM (table)  
			 
			 4. If Success-> flag=TRUE;
			 
			 */
			
			try
			{
				DB_DB2_Connect db = new DB_DB2_Connect();
				
				db.s.execute(" DELETE FROM STANDARD_QUESTION ");
				//db.s.execute(" DELETE FROM RECEIVED_STANDARD_FEEDBACK ");
				
				for(int j=0; j<=9; j++)
				{
					db.s.execute("INSERT INTO STANDARD_QUESTION VALUES( '"+q[j]+"'  )   ");
				}
				
				flag=true;
				
			}
			catch(Exception e)
			{
				flag = false;
			}
			
			
			
		}
		
		
		

		if( ctype.equals("SURVEY") )
		{
			

			System.out.println("SURVEY POJO got = "+ctype+q[0]+q[9]);
			
			/*
			 
			 1. DBCode
			 
			 2. DELETE 
			    From BUSINESS_QUESTION_FORM (table)
			    
			 3. INSERT  "q"  into   BUSINESS_QUESTION_FORM (table)  
			 
			 4. If Success-> flag=TRUE;
			 
			 */
			
			try
			{
				DB_DB2_Connect db = new DB_DB2_Connect();
				
				db.s.execute(" DELETE FROM SURVEY_QUESTION ");
				//db.s.execute(" DELETE FROM RECEIVED_SURVEY_FEEDBACK ");
				
				for(int j=0; j<=9; j++)
				{
					db.s.execute("INSERT INTO SURVEY_QUESTION VALUES( '"+q[j]+"'  )   ");
				}
				
				flag=true;
				
			}
			catch(Exception e)
			{
				flag = false;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		return flag;
	}
	
	
	
	
}
