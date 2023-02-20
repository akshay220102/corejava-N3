package org.tnsif.statickeyword;

public class StaticBlock {
	private int num;
	//static variable
	private static String name;
	//getters n setters 
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	
	//static block 
		//it use to initialise static variable
		static 
		{
			name="sayali";
		}
}
