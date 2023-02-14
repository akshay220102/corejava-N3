package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class ThrowDemo {
	
	//method definition
	//throws is used to declare an exception
	public static void donate(int age,int weight)throws Exception {
		if(age>18 &&weight>50) {
			System.out.println("Eligible to donate the Blood ");
		}else {
			//to throw an exception explicitly
			throw new Exception("Not Eligible");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age and weight : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try{
			//method call
			donate(x,y);
		}catch(Exception e) {
			System.out.println("Exception Handled  "+e);
		}
	}

}
