package com.test.learntestng;

import org.testng.annotations.Test;

public class EnableAndDisableTest {
	
	@Test(enabled=true, description="I am positive test")
	public void test1(){
		System.out.println("test1()");
	}
	
	@Test(enabled=false, description="I am false test")
	public void test2(){
		System.out.println("test2()");
	}

}
