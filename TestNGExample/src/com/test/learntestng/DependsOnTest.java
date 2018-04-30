package com.test.learntestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
	
	@Test
	public void login(){
		System.out.println("login()");	
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"login"})
	public void test1(){
		System.out.println("test1()");	
	}
	
	@Test(dependsOnMethods={"login"})
	public void logout(){
		System.out.println("logout()");	
		Assert.assertTrue(true);
	}

}
