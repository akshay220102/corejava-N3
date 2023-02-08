package src.org.tnsif.classandobject;

import java.util.Scanner;

public class GetterSetterCoustmerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coustmer Id, Name , City");
		int id = sc.nextInt();
		
		String Name = sc.next();
		String city = sc.next();
		
		GetterSetterCoustmer c1 = new GetterSetterCoustmer();
		
		c1.setId(id);
		c1.setCoustmer(Name);
		c1.setCity(city);

		
		
		System.out.println(c1.getId());
		System.out.println(c1.getCoustmer());
		System.out.println(c1.getCity());
		
GetterSetterCoustmer c = new GetterSetterCoustmer(11,"Om","Nashik");
		
		c.Display();
		
		
		sc.close();

	}

}
