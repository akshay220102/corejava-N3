package org.tnsif.loopingstatement;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//to print from 1 to n
		//for(int i=1;i<=n;i++) {
			//System.out.print(i+" ");
		//}
		//to print from n to 1
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}
	}

}
