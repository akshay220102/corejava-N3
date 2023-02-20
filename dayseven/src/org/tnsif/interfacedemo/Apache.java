package org.tnsif.interfacedemo;

public class Apache implements  Bike {

	@Override
	public void milage(int speed) {
		System.out.println("speed is speed "+speed);
	}

	@Override
	//implemented methos must be public
	public void engine() {
		System.out.println("Engine cc is 163cc");
	}
	
}
