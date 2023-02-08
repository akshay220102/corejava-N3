package org.tnsifsuperkeyword;
// to demonstrate an example of super keyword in terms of variable

//parent class
public class flower {
	private String name;

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public flower(String name) {
		super();
		this.name = name;
	}

	public flower() {
		System.out.println("flower - parent class");
		
	}
	
	
}
