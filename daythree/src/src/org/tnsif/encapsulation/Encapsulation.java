package src.org.tnsif.encapsulation;

public class Encapsulation {
	private int pin;
	
	void accept()
	{
		System.out.println("The ATM pin is :"+pin);
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}
