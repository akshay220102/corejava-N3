package org.tnsifsuperkeyword;

public class Duster extends Renault {
	private int speed = 120;
	
	public void print()
	{
		//parent class variable
		super.print();
		System.out.println("Speed of Duster is "+speed+" km/hr");
	}
	

}
