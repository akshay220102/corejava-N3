package org.tnsif.thiskeyword;

class account{
	int a;
	int b;
	public void setdata(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void showdata() {
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
}
public class ThisKeywordDemo {
	public static void main(String args[]) {
		account obj=new account();
		obj.setdata(4, 9);
		obj.showdata();
		
	}
	
}
