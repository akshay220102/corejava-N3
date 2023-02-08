package org.tnsifsuperkeyword;
//to demonstrate an example of super keyword in terms of variable

//child class
public class rose extends flower{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public rose(String name) {
		super();
		this.name = name;
	}

	public rose() {
		System.out.println("flower - parent class");
		
	}
	public void display() {
		System.out.println(name);
		super.setName("flower");
		System.out.println(super.getName());
	}
}
