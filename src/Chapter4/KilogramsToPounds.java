/*  KilogramsToPounds.java
 *  Assignment 7: Homework 3: Loops
 *  Programming Exercises 4.3
 *  This program displays a list of kilograms converted to pounds from 1 to 199.
 */

package Chapter4;

public class KilogramsToPounds {


	public static void main(String[] args) {
		
		final int MAX_POUNDS = 200;                
		final double KILO_PER_POUND  = 2.2;
		
		
		double kilograms = 0.0;
		int pounds;
		
		
		// Setup table for display
		System.out.println("Pounds            Kilograms");
		
		// Multiple eash pound by KILO_PER_POUND
		for(pounds = 1; pounds<MAX_POUNDS;pounds++){
			
			// Cast to a double
			kilograms = (double)(pounds * KILO_PER_POUND);
			// Format the out put to the user
			System.out.printf("%4d               %.2f%n", pounds, kilograms);
		}
		
		System.exit(0);   // Exit the application

	} // end method main

} // end class KilogramsToPounds
