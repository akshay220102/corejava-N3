package org.tnsif.interfacedemo;

public interface Bike {
	
	//by default all the variables are public static final
	public static final int speed = 45;
	
	//by default all the methods are abstract
	void milage(int speed);
	void engine();
}
