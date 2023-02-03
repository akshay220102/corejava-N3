package org.tnsif.loopingstatement;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//to print from 1 to n
		int i=1;
		while(i<=n) {
			
			System.out.print(i+" ");
			i++;
		}
		System.out.println(" ");
		int j=1;
		while(n>=j) {
			System.out.print(n+" ");
			n--;
		}
	}

}
