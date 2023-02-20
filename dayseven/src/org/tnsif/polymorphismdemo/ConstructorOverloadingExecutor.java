package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		sc.nextLine();
		String color = sc.nextLine();
		Hondacity H = new Hondacity();
		Hondacity H1 = new Hondacity(speed, color);
		sc.close();

	}

}
