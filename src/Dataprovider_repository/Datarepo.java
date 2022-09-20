package Dataprovider_repository;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Datarepo {
	
	@DataProvider
	
	public static Object[][]getData(Method name){
		
		System.out.println("Test case which has the method is:"+name.getName());
		
		Object[][]data=new Object[3][4];
		
		data[0][0] ="Username";
		data[0][1] =101;
		data[0][2] ="abhijeetwannale12@gmail.com";
		data[0][3] = 91454413;
		

		data[1][0] ="Username";
		data[1][1] =102;
		data[1][2] ="abhijeetwannale13@gmail.com";
		data[1][3] = 91454414;
		

		data[2][0] ="Username";
		data[2][1] = 103;
		data[2][2] = "abhijeetwannale14@gmail.com";
		data[2][3] = 91454415;
		
		return data;
	}

}
