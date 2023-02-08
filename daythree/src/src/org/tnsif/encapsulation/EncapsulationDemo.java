package src.org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		 Encapsulation h = new Encapsulation();
		 h.setPin(5465);
		 System.out.println(h.getPin());
		 h.accept();
	}

}
