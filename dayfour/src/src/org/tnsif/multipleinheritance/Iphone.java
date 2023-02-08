package src.org.tnsif.multipleinheritance;

public class Iphone extends Android{
	private String slottype;
	public void slot()
	{
		System.out.println("Slottype is "+slottype);
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone(String slottype) {
		super();
		this.slottype = slottype;
	}
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Iphone(int modelno,String version,String slottype) {
		super(modelno,version);
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
}
