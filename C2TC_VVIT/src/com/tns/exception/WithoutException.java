package com.tns.exception;

public class WithoutException
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int d=0 ,a;
		try 
		{
			a=22/d;//exception occured
			System.out.println("this will not be printed");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("division by zero");
		}
		System.out.println("this will be printed");
	}

}
