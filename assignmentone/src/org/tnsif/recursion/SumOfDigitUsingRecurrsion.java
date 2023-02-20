package org.tnsif.recursion;

import java.util.Scanner;

public class SumOfDigitUsingRecurrsion {

	static int SumD(int n,int sum)
	{
		
		
		if(n==0)
		{
			return sum;
		}
		
		sum+=n%10;
		
		
		
		return SumD(n/10,sum);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to find sum of digit:");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		System.out.println("Sum of Digit is   :"+ SumD(n,sum));
			
		sc.close();

	}

}
