package src.org.tnsif.multipleinheritance;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Iphone I = new Iphone();
		Iphone I1 = new Iphone(1250,"Kitkat","Singleslot");
		
		System.out.println(I1);
		I1.accept();
		I1.Display();
		I1.slot(); 
	}

}
