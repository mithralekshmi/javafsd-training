package com.ust.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@ BeforeClass
	public  static void beforeAllTest()
	{
		System.out.println("before  all tests starts");
	}
	@Before
	public void beforeTest() {
	 System.out.println("before test")	;
	}
	@Test

	 public void test() {
		
		String str = "Java Training";
		assertEquals("Java Training", str);}
     
		//fail("Not yet implemented");
	@Test
	
	public void test1()
	{
		int i=5;
	    assertNotEquals(5,5);
	
	}
	
	@AfterClass
	public static void afterAllTest()
	{
		System.out.println("after testing ");
	}
	@After
	public void afterAlltest()
	{
		System.out.println("after all");
	}
	
}



