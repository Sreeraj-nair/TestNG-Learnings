package com.test.learntestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@DataProvider(name="data")
	public Object[][] dataProviderTest(){
		//return new Object[][]{{"username", "password"}, {"username", "password"}};
	
		Object[][] obj = new Object[3][2];
		obj[0][0] = "username1";
		obj[0][1] = "password1";
		
		obj[1][0] = "username2";
		obj[1][1] = "password2";
		
		obj[2][0] = "username3";
		obj[2][1] = "password3";
		
		return obj;
		
	}
	
	@Test(dataProvider="data")
	public void test(String a, String b){
		System.out.println("username: "+ a +" password: "+b);
	}
}
