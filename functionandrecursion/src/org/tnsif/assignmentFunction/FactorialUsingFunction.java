package org.tnsif.assignmentFunction;

import java.util.Scanner;

public class FactorialUsingFunction {

	
		static int facto(int n)
		{
			int fact = 1;
			for(int i = 1; i <= n; i++ )
			{
				fact = i * fact;
			}
			return fact;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter Twon no for factorial :");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			
			System.out.print("addition : "+ facto(n));
		}

	

}
