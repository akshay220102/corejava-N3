package org.tnsif.interfacedemo;

public class User implements SBI,PNB{

	@Override
	public float getInterest() {
		
		System.out.println("Loan not available");
		return 0.0f;
	}

}
