package Examplejunit;

public class Calculator {
	public int add(int i,int j)
	{
		return i+j;
	}
	public int mul(int i,int j)
	{
		return i*j;
	}
	public double divide(double  i,double j)
	{if(j==0.0)
        throw new ArithmeticException();

    return i/j;
}

		
	}

