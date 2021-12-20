package com.stg.junitproject;

public class calculator {
	public int add(int i,int j)
	{
		return i+j;
	}
	public int sub(int i,int j) {
		return i-j;
	}
	public int mul(int i,int j) {
		return i*j;
	}
	public int  divide(int  i,int j)
	{
		return i/j;
	}
	public int greaternumber(int i,int j)
	{
		int b;
		if(i<j)
			System.out.println("j is greater");
		if(i>j)
			System.out.println("i is smaller");
		return i ;
	}
	public int  factorial(int fact)
	{
		int i=1;
		int n=5;
		fact=fact*(n-1);
		return fact;
	}
	public String reverse1(String c)
	{
		String  reverse="";
		char[] d=c.toCharArray();
		for(int i=c.length()-1;i>0;i--)
		{
			reverse =reverse+d[i];
		}
		return reverse;
	}
	public String string(String a,String b)
	{
		return a+b;
	}


}
