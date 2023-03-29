package com.tns.multipleinheritence;

public class Vehicle implements vehicleone, vehicletwo {

	public void speed() {
		// TODO Auto-generated method stub
		int speed=distance/100;		
	}
 
	public void distance() {
		// TODO Auto-generated method stub
		int distance= speed*100;
		System.out.println("distancetravelled"+distance);
		
	}

	

	}


