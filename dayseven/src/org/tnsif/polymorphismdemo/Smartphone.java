package org.tnsif.polymorphismdemo;
//
// program to demonstrate  method overloading
public class Smartphone {
	
	//Private data members
	private int reslution;
	private String Slottype;
	// overloading in terms of no of argument passed
	void display(int reslution)
	{
		System.out.println("Camera resolution :"+reslution);
	}
	
	void display(int reslution,String Slottype)
	{
		System.out.println("Camera resolution :"+reslution+" Slotype :"+Slottype);
	}

	public int getReslution() {
		return reslution;
	}

	public void setReslution(int reslution) {
		this.reslution = reslution;
	}

	public String getSlottype() {
		return Slottype;
	}

	public void setSlottype(String slottype) {
		Slottype = slottype;
	}
	
	
}
