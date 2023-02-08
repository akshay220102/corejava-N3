package src.org.tnsif.classandobject;

public class Coustmer {
	int id;
	String coustmer;
	String city;
	
	public Coustmer()
	{}
	
	public Coustmer(int id ,String coustmer , String city) {
		this.id = id;
		this.coustmer = coustmer;
		this.city = city;
	}
	
	public void Display() {
		System.out.println(id +" "+ coustmer+" " + " " +city);
	}
	
}
