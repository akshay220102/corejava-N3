package org.tnsif.instanceofdemo;

public class child extends person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public child(String name, String address, int age) {
		super(name, address);
		this.age = age;
	}

	public child() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
}
