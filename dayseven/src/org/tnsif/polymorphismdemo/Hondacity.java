package org.tnsif.polymorphismdemo;

public class Hondacity {
	//constructor overloading in terms of diff no argument passed
	private int speed;
	private String color;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Hondacity() {
		System.out.println("Hondacity be like stuuuuuuuustustustustutu.....🏎️🏎️🏎️🏎️🏎️🏎️");
	}
	public Hondacity(int speed, String color) {
		
		this.speed = speed;
		this.color = color;
		System.out.println("Speed of hondacity is "+speed+"color is "+color);
	}
	
}
