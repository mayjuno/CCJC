package myBankApp;

public class MyBank {
	private Display dollars;
	private Display cents;
	
	// Create constructor : initialize bank balance
	public MyBank(int dol, int cen) {
		dollars = new Display(0);
		cents =  new Display(100);
		
		dollars.setValue(dol);
		cents.setValue(cen);
	}
	
	// Deposit money into account
	public void deposit(int dol, int cen) {
		int totalCents = cents.getValue() + cen;
		int extraDollars =  totalCents / 100;
		cents.setValue(totalCents % 100);
		dollars.increaseValue(dol + extraDollars);
	}
	
	// Show the total balance
	
	public void showBalance() {
		System.out.println("Your Balance is : "+
	dollars.show()+ " dollars and "+ cents.show()+" cents.");
	}
}
