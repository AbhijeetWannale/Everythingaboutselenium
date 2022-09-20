package Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderBasic {
	

/*	@Test(dataProvider="getData")
	
	public void DataMetrix(Object s) {
		
	}
	
	@DataProvider
	
	public Object[][]getData()
	{
		Object[][]data=new Object[3][4];
		
		data[0][0]="Usrname";
				data[0][1]="Password";
						data[0][2]=914544133;
								data[0][3]="Mozila";
		data[1][0]="Usrname1";
				data[1][1]="Password2";
						data[1][2]=914544134;
								data[1][3]="Chrome";
		data[1][0]="Usrname2";
				data[1][1]="Password2";
						data[1][2]=914544135;
								data[1][3]="Chrome";
								
	   data[1][0]="Usrname3";		
	           data[1][1]="Password3";
	                   data[1][2]=914544136;
	                           data[1][3]="Chrome";
	                           
	                           return data;*/
											
	// parameter of test Method and return typeof the dataproviders
	// While preparing the data in which format we need to store that data this is more important while preparing we can store the data in many format like in array format 
	// collection format like arrraylist we need to know that what is actually supported by the detaprovider and how do you return the data
	//q1) is it mandatory to return only two dimentional object from the dataprovider
	//   ==  no dataprovider has multiple return type so out of that object two dimensional one returntype
	//  2) what are the returntype of the dataprovider  
	//                        object[]--(single dimensional array)   any datatype pre defined and userdefined 
	//                        Object[][](multi dimensional array)
	//                           Iterator<Object>
	//                           iterator<object>[]
	                           
	       @Test(dataProvider="dp1")
	       
	    	   
	    	   public void Testlogin(String s)
	       {
	    	   System.out.println(s);
	       }
	                           
	      @DataProvider() 
	      public Object[]dp1()
	      {
	   	  Object[] data=new Object[3];
	    	  
	    	  data[0]="abdc";
	    	  data[1]="xyz";                    //    when we say string of array{string,string,string}
	   	      data[2]="abc";
	 //   	  {"abdc","xyz","abc"};
	    	  
	    	  return data; 
	      }
	
	                           
	                           
	                           
	                           
	}                           



