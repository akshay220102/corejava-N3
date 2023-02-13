package org.tnsif.arraydemo;

import java.util.Scanner;

//program to demonstrate on jagged array
public class jaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [2][];
		//first array has 3 column
		arr[0]=new int[3];
		//second array has 2 column
		arr[1]=new int[2];
		System.out.println("Enter the no of array elements ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
