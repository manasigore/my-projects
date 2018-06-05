package com.bapu.webservice;

public class WebServiceCaller
{

	public boolean flag = false;
	
	public boolean getCustomerDetails(String ctype)
	{
		
		
		try
		{
			PdfWebServiceStub pws = new PdfWebServiceStub();
			
			PdfWebServiceStub.ViewCustomerDetails f = new PdfWebServiceStub.ViewCustomerDetails();
			
			
			
			if(ctype.equals("BUSINESS"))
			{
				f.setCtype("BUSINESS");
			}
			
			if(ctype.equals("GAMING"))
			{
				f.setCtype("GAMING");
			}
			
			if(ctype.equals("STANDARD"))
			{
				f.setCtype("STANDARD");
			}
			
			
			//System.out.println(  ( pws.viewCustomerDetails(f) ).get_return()   );
			
			boolean check = ( pws.viewCustomerDetails(f) ).get_return();
			
			if(check==true)
				{
				 flag = true;
				}
			
			else
				{
				 flag=false;
				}
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			flag = false;
		}
		
		
		return flag;
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		
		PdfWebServiceStub pws = new PdfWebServiceStub();
		
		PdfWebServiceStub.ViewCustomerDetails f = new PdfWebServiceStub.ViewCustomerDetails();
		
		f.setCtype("STANDARD");
		
		System.out.println(  ( pws.viewCustomerDetails(f) ).get_return()   );
		
	}

}
