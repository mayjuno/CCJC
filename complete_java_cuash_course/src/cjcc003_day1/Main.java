package cjcc003_day1;
//7.Class and Object
/* Encapsulation (Getters/Setters) */
public class Main {

	public static void main(String[] args) {
		// create an instance object
		Car c1 = new Car("toyota", 2013);
		c1.brand = "Toyota";

		//c1.engineNumber = "toy123"; //Private variables
		c1.setEngineNumber("123456");
		c1.showInfo();
		//System.out.println(c1.engineNumber);
		Car c2 = new Car("Honda", 2015);
		c2.setEngineNumber("12345");
		c2.showInfo();
		
		System.out.printf("Total Cars : %d",Car.numberOfCar);

	}

}
