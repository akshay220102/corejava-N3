package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class NestedtryCatchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of x and y : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int arr[]=new int[] {11,22,33};
		
			try {
				
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException w) {
				System.out.println("exception handled"+w);
				try {
					int res=x/y;
					System.out.println(res);
				
			}
				catch(ArithmeticException e) {
					System.out.println("exception handled"+e);
			}
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
