package src.org.tns.hierarchichalinheritance;

public class AndroidVersion {
	int type;

	public AndroidVersion(int type) {
		super();
		this.type = type;
	}


	
	public AndroidVersion() {
		super();
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + ", getType()=" + getType() + "]";
	}


	
}
