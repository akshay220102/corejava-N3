package org.tnsif.arraydemo;

public class ArrayProgram {

	public static void main(String[] args) {
		int arr[]= {11,31,54,67};
		int arr1[]=new int[20];
		arr1[0]=41;
		arr1[1]=76;
		arr1[2]=45;
		arr1[3]=36;
		arr1[4]=96;
		System.out.println(arr1[3]);
		System.out.println(arr[1]);
		System.out.println(arr.getClass().getName());
	}

}
