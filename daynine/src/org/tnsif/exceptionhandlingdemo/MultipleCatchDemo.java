package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[]=new int[]{11,22,33};
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int res=x/y;
			System.out.println(arr[3]);
			System.out.println(res);
		}
		/*catch(ArithmeticException e) {
			System.out.println("exception handled");
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled");
		}*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled"+e);
		}
		
	}

}