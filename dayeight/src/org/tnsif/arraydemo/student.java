package org.tnsif.arraydemo;
//program to demonstrate on array objects
public class student {

	private int roll;
	private String name;
	private float percentage;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public student(int roll, String name, float percentage) {
		super();
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
	}
	

}
