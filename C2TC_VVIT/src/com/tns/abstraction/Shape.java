package com.tns.abstraction;

public abstract class Shape
{
	protected float area;
	//abstract method
	abstract void calArea();
	//concrete method
	void show()
	{
		System.out.println("area of shape is" +area);
	}
}


