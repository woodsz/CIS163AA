/*
 *  CalculatingTip.java
 *  Homework 1 - Assignment Statements
 *  Exercise 2.5: Calculating tips
 *  Programs gets the subtotal and gratuity rate
 *  than outputs the gratuity and total.
 *    
 */
package Chapter2;				

import java.util.Scanner;		// program uses Scanner


public class CalculatingTip {
		
	// main method begins execution of Java application
	public static void main (String args[]){
		
		Scanner scanner = new Scanner(System.in);

		double gratuityRate;	// Rate of gratuity
		double subtotal;		// Subtotal
		double gratuity;		// The gratuity
		double total;			// The total
		
		
		// Exercise 2.5: reads the subtotal and the gratuity rate, then computes the gratuity and total
		// Ask for the subtotal and gratuity rate from the user
		System.out.print("Please enter the subtotal and gratuity rate. ");
		
		// Assignment the input to gratuityRate and subtotal String objects
		subtotal 	 = scanner.nextDouble();
		gratuityRate = scanner.nextDouble();
		
		// Calculate the gratuity and total
		gratuity = subtotal * ( gratuityRate / 100);
		total = subtotal + gratuity;
		
		// Results
		System.out.println( "The gratuity is " + gratuity + " and the total is " + total);

		
		scanner.close();	// Closing the Scanner object
		
		System.exit(0); 	// Exiting Application
		
	} // end method main

} // end class CalculatingTip
