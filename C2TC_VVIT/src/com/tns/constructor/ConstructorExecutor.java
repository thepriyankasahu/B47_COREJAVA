package com.tns.constructor;

public class ConstructorExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob=new Customer("PRIYANKA",33,"BANGALORE");
		System.out.println(ob.getCustomerName()+ " " +ob.getCustomerId()+" "+ob.getCustomerCity());

	}

}
