package org.tnsif.assignmentFunction;

import java.util.Scanner;

public class FactorialUsingRecurrsion {
		static int facto(int n)
		{
			
			if(n==1)
			{
				return 1;
			}
			
			return n*facto(n-1);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter Twon no for factorial :");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			
			System.out.print("addition : "+ facto(n));
		}
	}


