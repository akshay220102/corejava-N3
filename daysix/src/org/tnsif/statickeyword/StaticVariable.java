package org.tnsif.statickeyword;

public class StaticVariable {
	//non-static
		private String name;
		//static
		public static String companyName="TechnoServe India";
		
		//field
		public StaticVariable(String name) {
			super();
			this.name = name;
		}
		//tostring

		@Override
		public String toString() {
			return "StaticVariable [name=" + name + "]";
		}
		
}
