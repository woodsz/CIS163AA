/* 
 * Algebra2X2LinearEquations.java
 * Programming Excerise 3.3
 *   Algebra: Solving 2 X 2 linear equations
 *   Take input from users to solve equation
 */
package Chapter3;

import java.util.Scanner;             // program uses the Scanner class

public class Algebra2X2LinearEquations {

	// Main method begins execution of Java application
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		// Prompt user for value for equations
		System.out.print("Enter a ,b ,c ,d ,e ,f: ");
		
		
		// Assign the values to the variables
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		f = scanner.nextDouble();
		
		if((a * d) - (b * c) == 0){
			// Print out to console
			System.out.println("The equation has no solution.");
			
			// Close scanner object
			scanner.close();
			
			// Exit the application
			System.exit(0);
		}
		
		// Close the scanner 
		scanner.close();
		
		// Cramer's rule to solve equation
		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		
		// Print the results to the console
		System.out.println("x is: " + x + " y is: " + y);
		
		System.exit(0);

	} // end of main method

} // end of class Algebra2X2LinearEquations
