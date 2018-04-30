package com.test.learntestng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest {
	
	@BeforeClass(groups={"sanity", "regression", "database"})
	public void setUp(){
		System.out.println("setUp() - sanity, regression, database");
	}
	
	@Test(groups={"sanity", "regression"})
	public void test1(){
		System.out.println("test1() - sanity, regression");
	}
	
	@Test(groups={"sanity", "database"})
	public void test2(){
		System.out.println("test2 - sanity, database");
	}
	
	@Test(groups={"sanity"})
	public void test3(){
		System.out.println("test3 - sanity");
	}
	
	@Test(groups={"regression"})
	public void test4(){
		System.out.println("test4() - regression");
	}
	
	@Test(groups={"noGrp"})
	public void test5(){
		System.out.println("test5 - no groups");
	}
	
}
