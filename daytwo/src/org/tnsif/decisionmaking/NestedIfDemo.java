package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=12) {
					if(weight>=40) {
									if(weight<120) {
													System.out.println("eligible!");
													}
									else {
													System.out.println("add extra ropes");
											}
					}else {
							System.out.println("not eligible!");
							}
			
		}else {
				System.out.println("not eligible!");
		}
	}

}
