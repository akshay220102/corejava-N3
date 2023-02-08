package src.org.tnsif.classandobject;

public class GetterSetterCoustmer {
	int id;
	String coustmer;
	String city;
	
	public GetterSetterCoustmer()
	{}
	
	public GetterSetterCoustmer(int id ,String coustmer , String city) {
		this.id = id;
		this.coustmer = coustmer;
		this.city = city;
	}
	
	public void Display() {
		System.out.println(id +" "+ coustmer+" " + " " +city);
	}


	
	//Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoustmer() {
		return coustmer;
	}

	public void setCoustmer(String coustmer) {
		this.coustmer = coustmer;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
