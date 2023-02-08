package org.tnsif.thiskeyword;

class hr{
	void fun(hr obj) {
		System.out.println("function executed");
	}
	void accept() {
		fun(this);
	}
}
public class thiskeywordexecuter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hr obj=new hr();
		obj.accept();
	}

}
