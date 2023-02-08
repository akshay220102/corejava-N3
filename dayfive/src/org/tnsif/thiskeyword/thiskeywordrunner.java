package org.tnsif.thiskeyword;
class math{
	int a,b;
	math()
	{
		a=10;
		b=20;
	}
	math accept() {
		return this;
	}
	void display() {
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
public class thiskeywordrunner {

	public static void main(String[] args) {
		math obj=new math();
		obj.accept().display();

	}

}
