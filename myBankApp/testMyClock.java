package myBankApp;
import java.util.Scanner;
public class testMyClock {

	public static void main(String[] args) {
		// create an instance object for keyboard input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter hour : ");
		int orgHour = input.nextInt();
		System.out.print("Please enter minute : ");
		int orgMinute = input.nextInt();
		
		// Create an instance object of MyClock
		MyClock clock = new MyClock(orgHour, orgMinute);
		
		// Change Current Time in MyClock 
		System.out.print("Please enter add Hours : ");
		int increaseHours = input.nextInt();
		System.out.print("Please enter add Minutes : ");
		int increaseMinuts = input.nextInt();
		
		clock.addTime(increaseHours, increaseMinuts);
		clock.showTime();

	}

}
