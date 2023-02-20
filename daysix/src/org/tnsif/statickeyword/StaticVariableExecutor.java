package org.tnsif.statickeyword;

public class StaticVariableExecutor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s=new StaticVariable("Nia Lopez");
		System.out.println(s);
		//use classname.variablename to print static variable
		System.out.println(StaticVariable.companyName);

	}
}
