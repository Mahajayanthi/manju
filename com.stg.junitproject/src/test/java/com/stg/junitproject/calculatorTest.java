package com.stg.junitproject;
import static org.junit.Assert.*;

import java.rmi.AccessException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class calculatorTest {
	
	  @Test
	
	  public void test() {
		  calculator c=new calculator();
		  int actual =c.add(2, 3);
		  int excepted=5;
		  assertEquals(excepted,actual); } 
	  @Test
	  public void divideTest()  {
		  calculator c=new calculator(); 
		  int i=4; int j=0;
		  int excepted=2;
		  int actual=c.divide(4, 0);
		  assertEquals(excepted,actual); }
	@Test
	  public void accountTest() { 
		  account a=new account();
		  int accountbalance=1000;
	  int actual=a.accountbalance(); int excepted=1000;
	  assertEquals(excepted,actual);
	  }	
	 @BeforeClass
	 public  static void test11()
	 {
		 System.out.println("before testing");
	 }
	@After 
	public void test1()
	{
		System.out.println("after testing");
	}

}
