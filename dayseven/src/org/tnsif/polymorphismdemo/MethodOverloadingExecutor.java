package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExecutor extends Smartphone{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the resolution and the slot type of the smartphone");
		int resolution = sc.nextInt();
		sc.nextLine();
		String Slottype =sc.nextLine();
		 Smartphone sp = new Smartphone();
		 sp.setReslution(resolution);
		 sp.setSlottype(Slottype);
		 
		 sp.display(resolution);
		 sp.display(resolution, Slottype);
		 
		 Multiplication m = new Multiplication();
		System.out.println( m.mul(7,5));
		 System.out.println(m.mul(45.4f,54.5f));
		 
		 
		 sc.close();
		 
	}

}
