package com.tns.nestedinterface;

public class MyClass implements Outer
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Outer interface");
	}
public static void main(String[] args)
{
	MyClass m=new MyClass();
	m.m1();
	System.out.println(m);
}
}


