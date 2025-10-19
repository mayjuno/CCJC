package myBankApp;

public class MyClock {
	// instance variable
	private Display hours;
	private Display minutes;
	
	// Constructor: initialize clock 
	public MyClock(int h, int m) {
		hours = new Display(24);
		minutes = new Display(60);
		
		hours.setValue(h);
		minutes.setValue(m);
	}
	
	// Add hours:minutes in clock
	public void addTime(int addHour, int addMinute) {
		int newMinuts = minutes.getValue() + addMinute;
		int carryHours = newMinuts / 60;
		minutes.setValue(newMinuts % 60);
		// Add hours including carry
		int newHours = hours.getValue() + addHour + carryHours;
		hours.setValue(newHours % 24);
	}
	// Show the current time
	public void showTime() {
		System.out.println("Current Time is " +hours.getValue()+ ":" +minutes.getValue());
	}
}
