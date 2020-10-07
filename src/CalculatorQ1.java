import java.util.Scanner;

/**
 * Title: Calculator
 * Authors: Eli Lowe and Matthew Ryals
 * Description: This program calculates user inputs
 * 
 * 
 * How we worked together: We talked over discord to get stuff working and worked together on this weeks code.
 */

public class CalculatorQ1 {
	public static void main(String[] args) {
		//Printed at beginning
		System.out.println("Welcome to our Calculator! Good luck on your math!");
		
		//Creating Scanner
		Scanner scan = new Scanner(System.in);
		
		//Create Variables
		int num1, num2;
		
		//Get values for num1 and num2 and op
		System.out.print("Enter your operator: ");
		String op = scan.nextLine();
		System.out.print("Please enter the first integer: ");
		num1 = scan.nextInt();
		System.out.print("Please enter the second integer: ");
		num2 = scan.nextInt();		
		
		//Results
		System.out.println(solve(num1, num2, op));
		
		//Printed at end
		System.out.println("Thanks for using our Calculator! Goodbye!");
	}
	
	//Setup a solver based on entered operator 
	public static String solve(int n1, int n2, String op) {
		switch(op) {
		case "+":
			return n1 + " + " + n2 + " = " + (n1+n2);
		case "-":
			return n1 + " - " + n2 + " = " + (n1-n2);
		case "/":
			return n1 + " / " + n2 + " = " + (n1/n2);
		case "*":
			return n1 + " * " + n2 + " = " + (n1*n2);
		default: 
			return "oops";
		}
	}
	
}
