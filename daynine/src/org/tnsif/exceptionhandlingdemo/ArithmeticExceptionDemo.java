package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//try block contains the exception code
		try {
		int res=x/y;
		System.out.println(res);
		}
		//Catch block handles the exception throw by try block
		catch(Exception e) {
			System.out.println("Exception Handled using catch "+e);
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
