package myBankApp;

public class Display {

	private int value;
	private int limit;
	
	// Create Constructor
	
	public Display(int limit) {
		this.limit = limit;
		this.value = 0;
	}
	
	// Create setValue() method
	public void setValue(int value) {
		this.value = value;
		if(limit > 0) {
			this.value = this.value % limit;
		}
	}
	
	//Create getValue() method
	public int getValue() {
		return value;
	}
	
	// Create increaseValue() method
	public void increaseValue(int amount) {
		this.value += amount;
	}
	
	// Create show() method
	public String show() {
		return String.valueOf(value);
	}
}


