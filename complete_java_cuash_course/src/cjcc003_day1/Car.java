package cjcc003_day1;
// 7.Class and Object
/* Encapsulation (Getters/Setters) */
public class Car {
// instance variables
	public String brand;
	public int year;
	private String engineNumber;
	protected double prize;
	public static int numberOfCar = 0;


	//Create Constructor
	public Car(String b, int y) {
		this.brand = b;
		this.year = y;
		this.engineNumber ="UNKNOWN";
		numberOfCar+=1;
	}
	public void setEngineNumber(String engNumber) {
		this.engineNumber = this.brand + engNumber;
	}
	
	public String getEngineNumber() {
		return engineNumber;
	}
	public void showInfo() {
		System.out.println("Brand :" +brand);
		System.out.println("Manufacture Date :" +year);
		System.out.println("EngineNumber :" +engineNumber);
		System.out.println("Prize :" +prize);
	}
}