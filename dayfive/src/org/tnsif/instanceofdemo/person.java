package org.tnsif.instanceofdemo;
//to demonstrate an example on instance of operator 
// parent class
public class person {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public person() {
		System.out.println("ParentClass");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
	
}
