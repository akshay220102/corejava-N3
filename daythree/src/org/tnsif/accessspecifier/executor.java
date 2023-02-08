package org.tnsif.accessspecifier;

import org.tnsif.accessspecifierdemo.AccessSpecifireExample;

public class executor {

	public static void main(String[] args) {
		AccessSpecifireExample a = new AccessSpecifireExample();
		a.setName("Welcome to MET");
		//a.display();   this will give error for private method so use getter
		System.out.println(a.getName());
	}

}
