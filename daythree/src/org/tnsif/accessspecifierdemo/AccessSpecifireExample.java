package org.tnsif.accessspecifierdemo;

public class AccessSpecifireExample {
	private String name;
	
	 void display()
	{
		System.out.println("the name is : "+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
