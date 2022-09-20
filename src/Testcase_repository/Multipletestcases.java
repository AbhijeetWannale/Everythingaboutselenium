package Testcase_repository;

import org.testng.annotations.Test;

import Dataprovider_repository.Datarepo;

public class Multipletestcases {
	
	@Test(priority = 1,dataProviderClass=Datarepo.class,dataProvider="getData")
	public void launchUrl(String Username,int emp_id,String email,int emp_no) 
	
	{
		
		System.out.println(Username+ "-----"+  emp_id + "----"+email+ "---"+emp_no);
		
	}

	@Test(priority = 2,dataProviderClass=Datarepo.class,dataProvider="getData")
	public void enterCredentials(String Username,int emp_id,String email,int emp_no)
	
	{
		
		System.out.println(Username+ "-----"+  emp_id + "----"+email+ "---"+emp_no);
		
	}

	@Test(priority = 3,dataProviderClass=Datarepo.class,dataProvider="getData")
	public void Validatehomepage(String Username,int emp_id,String email,int emp_no)
	
	{
		
		System.out.println(Username+ "-----"+  emp_id + "----"+email+ "---"+emp_no);
		
	}

	@Test(priority = 4,dataProviderClass=Datarepo.class,dataProvider="getData")
	public void logout(String Username,int emp_id,String email,int emp_no)
	
	{
		
		System.out.println(Username+ "-----"+  emp_id + "----"+email+ "---"+emp_no);
		
	}

}
