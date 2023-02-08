package src.org.tnsif.classandobject;
import java.util.*;

public class CoustmerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		String Name = sc.next();
		String city = sc.next();
		
		Coustmer c1 = new Coustmer(id,Name,city);
		
		c1.Display();

		Coustmer c = new Coustmer(11,"Om","Nashik");
		
		c.Display();
		sc.close();
	}

}
