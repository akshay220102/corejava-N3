package org.tnsif.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int n=sc.nextInt();
		//array declaration
		int arr[]=new int[n];
		//to allocate the value to an array
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are ");
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//to sort an array elements
		System.out.println("Array elements after sorting are ");
		Arrays.sort(arr);
		/*for(int i=0;i<n;i++) {
			
		System.out.print(arr[i] + " ");
		
		}*/
		for(int itr:arr) {
			System.out.println(itr+" ");
		}
	}

}
