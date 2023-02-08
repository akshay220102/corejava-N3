package src.org.tnsif.multipleinheritance;

public class Nokia {
	private int modelno;
	public void Display()
	{
		System.out.println("The Model No is : "+ modelno);
	}
	
	//default constuctor
	public Nokia()
	{
		System.out.println("Nokia Class");
	}
	
	//parametorised constuctor
	public Nokia(int modelno)
	{

		this.modelno=modelno;
	}
	
}
