package myBankApp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String chk;
		boolean continuousdoing = false;
		do {			

			System.out.println("Do you want to looping test[yes/no]?");
			chk = input.next();
			if(chk.equals("yes")  || chk.equals("Y") || chk.equals("y")  || chk.equals("Yes")) {
				continuousdoing = true;
				System.out.println("How many times do you want to while loop?");
				int usercount = input.nextInt();
				int count = 0;
				while(count < usercount) {
					for(int j =0; j<3; j++) {
						System.out.printf("Count %d%d%n",count+1,j+1);
					}
					count++;
				}
			}else {
				continuousdoing = false;
			}
			
		}while(continuousdoing);
	}
}

