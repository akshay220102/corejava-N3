package org.tnsif.arraydemo;

import java.util.Scanner;

public class arrayobjectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student arr[];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int n=s.nextInt();
		arr=new student[n];
		int i=0;
		while(i<n) {
			
			arr[i]=new student(s.nextInt(),s.next(),s.nextFloat());
			i++;
		}
		for(int j=0;j<n;j++) {
			
			System.out.println(arr[j].getRoll()+ " "+ arr[j].getName()+" "+arr[j].getPercentage());
		}
	}

}
