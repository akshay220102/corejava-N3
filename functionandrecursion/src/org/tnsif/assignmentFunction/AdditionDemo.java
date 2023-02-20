package org.tnsif.assignmentFunction;
import java.util.*;
public class AdditionDemo {
	
static int add(int x,int y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter Two no to add :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Addition : "+ add(x,y));
		sc.close();

	}

}
