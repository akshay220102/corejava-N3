package org.tnsif.recursion;

import java.util.Scanner;

public class FibbonacciUsingRecurrsion {

	static int fibbo(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		if(n==0)
		{
			return 0;
		}
		
		return fibbo(n-1)+fibbo(n-2);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for fibbo :");
		
		int n = sc.nextInt();
		
		System.out.println("fibbo  :"+ fibbo(n));
		
		sc.close();

	}


}
