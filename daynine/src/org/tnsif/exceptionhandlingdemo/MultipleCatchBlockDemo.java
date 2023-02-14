package org.tnsif.exceptionhandlingdemo;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		String[] s = {"abc",null,"xyz"};
		for(int i=0;i<4;i++) {
			try {
				int a=s[i].length()+Integer.parseInt(s[i]);
			}catch(NumberFormatException e ) {
				System.out.println("Handles NumberFormatException exception"+e);
			}catch(NullPointerException e) {
				System.out.println("Handles NullPointerException"+e);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Handles ArrayIndexOutOfBoundsException"+e);
			}
		}

	}

}
