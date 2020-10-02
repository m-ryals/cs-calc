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
		int num1, num2, addSum, subSum, timesProduct, divProduct, modProduct;
		
		//Get values for num1 and num2
		System.out.print("Please enter the first integer: ");
		num1 = scan.nextInt();
		System.out.print("Please enter the second integer: ");
		num2 = scan.nextInt();
		
		//Calculations
		addSum = num1 + num2;
		subSum = num1 - num2;
		timesProduct = num1 * num2;
		divProduct = num1 / num2;
		modProduct = num1 % num2;
		
		//Results
		System.out.println(num1 + " + " + num2 + " = " + addSum);
		System.out.println(num1 + " - " + num2 + " = " + subSum);
		System.out.println(num1 + " * " + num2 + " = " + timesProduct);
		System.out.println(num1 + " / " + num2 + " = " + divProduct + " R" + modProduct);
		
		//Printed at end
		System.out.println("Thanks for using our Calculator! Goodbye!");
	}
}
