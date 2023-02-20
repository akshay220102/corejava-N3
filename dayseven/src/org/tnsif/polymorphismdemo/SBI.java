package org.tnsif.polymorphismdemo;


// child classs
public class SBI extends RBI{
	
	//overriding parent class method
	 float getinterest()
	 {
		 System.out.println(super.getinterest());
		 return 11.1f;
	 }
}
