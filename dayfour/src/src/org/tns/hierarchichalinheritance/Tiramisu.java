package src.org.tns.hierarchichalinheritance;

public class Tiramisu extends AndroidVersion{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Tiramisu(int type, int version) {
		super(type);
		this.version = version;
	}

	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiramisu(int type) {
		super(type);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", type=" + type + ", getVersion()=" + getVersion() + ", getType()="
				+ getType() + ", toString()=" + super.toString() + "]";
	}
	
	
}
