package com.bapu.java;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_DB2_Connect 
{

	public Connection c;
	public Statement s;
	
		
	   public DB_DB2_Connect()
	   {
		   
		   
		   try 
		    {
			 Class.forName("com.ibm.db2.jcc.DB2Driver");
		    } 
			
		   catch (Exception e)
			    {
				  System.out.println("Please include path Where your DB2 Driver is located");
				  e.printStackTrace();
				 }
			
			System.out.println("DB2 driver is loaded successfully");
				
				
				
			try
				{
					c = DriverManager.getConnection("jdbc:db2:VOC_DB");
					System.out.println("DB2 Database Connected");
					
					s = c.createStatement();
					
				} 
					
			catch (SQLException e) 
				{
				   e.printStackTrace();
				   System.out.println("DB2 connection Failed OR Database Doesnot Exist");
				}
				
			
		   
	   }
	 
	
	   
	   public static void main(String[] args)
	   {
		   try {
			DB_DB2_Connect db  = new DB_DB2_Connect();
			   
			   System.out.println("JDBC is OK");
			   
			  ResultSet rs =  db.s.executeQuery(" SELECT * FROM PRODUCT_INFORMATION  ");
			  
			  
			  if(rs!=null)
				{
				  
				    while(rs.next())
				     {
				    	
						
				         System.out.println("Name: "+rs.getString("PRODUCT_NAME"));
				         
				     }
				}
			  else
			  {
				  System.out.println("prob" );
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   }
	   
	
}
