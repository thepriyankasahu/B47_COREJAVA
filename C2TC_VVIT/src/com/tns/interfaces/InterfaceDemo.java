package com.tns.interfaces;

//program to demonstrate Interface

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle(2.5f, 10.0f);
		System.out.println("area" +s.calculateArea());
		System.out.println("Perimeter" +s.calculatePerimeter());
		

	}

}
