package cjcc001_day1;
import java.util.Scanner;
public class Main {
/*1.Java Basic  

✅ public class Main → Class name must match filename.
✅ main() → Entry point of every Java program.
✅ System.out.println() → Displays output.
*/
	//Structure of a java  program
	public static void main(String[] args) {
		System.out.println("Hello Java.");
/* 
2.Variables & Data Types
	Primitive types: byte, short, int, long, float, double, char, boolean
	Non-primitive: String, arrays, objects, etc.

* Identifiers
*  An identifier is a sequence of characters that consist of letters, digits,
*  underscores(_), and dollar signs($).
*  An identifier must start with a letter, and underscore(_), or a dollar sign($)
*  It can't start with digit.
*  An identifier cannot be reserved word
*  An identifier cannot be true, false, or null.
*  An identifier can be of any length.
*/
		
		int age = 46;
		double salary = 56000.759;
		char grade = 'A';
		boolean passed = true;
		String name = "John";
		
		System.out.printf("Age = %d%n", age);
		System.out.printf("Salary = %.2f%n", salary);
		System.out.printf("Grade = %c%n", grade);
		System.out.printf("Testing Exam = %b%n", passed);
		System.out.printf("Name = %s%n", name);
		
/* 3.Operator */
		int a = 5 , b = 2;
		System.out.printf("a + b  = %d%n",a + b);
		System.out.printf("a - b  = %d%n",a - b);
		System.out.printf("a * b  = %d%n",a * b);
		System.out.printf("a / b  = %d%n",a / b);
		System.out.printf("a %% b  = %d%n",a % b);
/* Also: ++, --, >, <, >=, <=, ==, !=, &&, ||, ! */
		
/*4. Control Statements*/	
		//if, if-else, if,else if,
		int mark = 80;
		if (mark >=50) {
			System.out.println("Pass!");
		}else {
			System.out.println("Fail!");
		}
		
		/*switch */
		int day = 3;
		switch(day) {
		case 1 :{
			System.out.println("Monday");
			break;
			}
		case 2 :{
			System.out.println("Tuesday");
			break;
			}	
		case 3 :{
			System.out.println("Wednesday");
			break;
			}	
		
		case 4:{
			System.out.println("Thursday");
			break;
			}
		case 5:{
			System.out.println("Thursday");
			break;
			}
		case 6:{
			System.out.println("Thursday");
			break;
			}
		case 7:{
			System.out.println("Thursday");
			break;
			}
		default:
			System.out.println("This day is out of range");
		}
/* loops */
/*for, while, do...while */
		
		boolean continuousdoing ;
		String chk;
		do {
			Scanner userinput = new Scanner(System.in);
			System.out.print("Do you want to looping test? [yes/ no] : ");
			chk = userinput.next();
			if (chk.equals("yes")|| chk.equals("Y")){
				continuousdoing = true;
				int count = 0;
				System.out.print("How many time do you want to (while)loop ? : ");
				int whilecount = userinput.nextInt();
				while(count < whilecount)
				{
					System.out.print("How many time do you want to (for)loop ? : ");
					int forcount = userinput.nextInt();
					for(int i = 0; i < forcount; i++) {
						System.out.printf("whileloop[%d] : %d%n",count+1,i+1);
					}
					count++;
				}

			}else {
				continuousdoing = false;
			}

		}while(continuousdoing);
	}

}
