package myBankApp;
import java.util.Scanner;
public class testMyBank {

	public static void main(String[] args) {
		// create an instance object for keyboard input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter balance in bank for dollars : ");
		int balDol = input.nextInt();
		System.out.print("Please enter balance in bank for cents : ");
		int balCen = input.nextInt();
		
		// Create an instance object for MyBank
		
		MyBank account1 = new MyBank(balDol, balCen);
		
	     System.out.print("Please enter dollar to deposit: ");
	     int depDol = input.nextInt();

	     System.out.print("Please enter cent to deposit: ");
	     int depCen = input.nextInt();

	     account1.deposit(depDol, depCen);
		account1.showBalance();
	}

}
