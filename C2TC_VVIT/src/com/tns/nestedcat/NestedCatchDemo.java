package com.tns.nestedcat;
/*
 * Program to demonstrate nested catch
 */

public class NestedCatchDemo {
		int arr[]=new int[6];//declare an array
         void nestedCatch() {
        	 try {
        		 //String str=null;
        		 //str.equals("hi");
        		 arr[3]=20/0;//Arithmetic Exception occured
            	 arr[10]=5;//Array out of  bound exception
            	 System.out.println("try block");
        	 }
        	 catch(ArithmeticException o)
        	 {
        		 System.out.println("A number cannot be divided by zero"); 
        	 }
        	 catch(ArrayIndexOutOfBoundsException e)
        	 {
        		 System.out.println("Accesing array element outside specified limit");
        	 }
        	 catch(Exception e) {
        		 
        	 }System.out.println("no exception matching");
        	
         }
	}


