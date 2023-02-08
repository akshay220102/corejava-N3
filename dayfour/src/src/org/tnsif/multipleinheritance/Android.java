package src.org.tnsif.multipleinheritance;

public class Android extends Nokia{
	private String version;
	public void accept()
	{
		System.out.println("Android Version is "+version);
		
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Android(String version) {
		super();
		this.version = version;
	}
	public Android(int modelno,String version) {
		super(modelno);
		this.version = version;
	}

	public Android() {
		super();
	}
	
	
	
}
