package org.tnsif.arraydemo;

import java.util.Scanner;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int arr[][]=new int [n][a];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<a;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<a;j++) {
				
			System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
		System.out.println(arr[0][1]);
	}
	

}
