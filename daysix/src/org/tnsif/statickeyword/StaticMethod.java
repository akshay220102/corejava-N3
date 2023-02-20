package org.tnsif.statickeyword;

public class StaticMethod {
	//data members
		private static double salary = 45000.67;
		//non static method 
		public static void display()
		{
			System.out.println("Salary is: "+salary);
		}
		//getters n setters 
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
}
