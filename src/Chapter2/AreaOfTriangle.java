/*
 * AreaOfTriangle.java
 * Homework 1 - Assignment Statements
 * Assignment 3: Exercise 2.21
 * Prompts user to enter three points of a triangle
 * and than calculates area
 */

package Chapter2;


import java.util.Scanner;


public class AreaOfTriangle {

	// main method begins execution of Java application
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x1, y1;					// Point 1 of triangle
		double x2, y2;					// point 2 of triangle
		double x3, y3;					// point 3 of triangle
		double side1, side2, side3; 	// sides of triangle
		double s;						
		double area;					// area of triangle
		
		
		// Prompt user to enter points of triangle and assign values to variables
		System.out.print("Enter three points of a triangle: ");
		// Get first points
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		
		// Get second points
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		// Get third points
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		
		// Find the length of the sides
		side1 = Math.pow(x2 - x1, 2.0) + Math.pow( y2 - y1, 2.0);
		side1 = Math.pow(side1, 0.5);
		
		side2 = Math.pow(x3 - x2, 2.0) + Math.pow( y3 - y2, 2.0);
		side2 = Math.pow(side2, 0.5);
		
		side3 = Math.pow(x1 - x3, 2.0) + Math.pow( y1 - y3, 2.0);
		side3 = Math.pow(side3, 0.5);
		
		// Find the area of the triangle
		s = (side1 + side2 + side3)/2;
		area = Math.pow(s * ((s - side1) * (s - side2) * (s - side3)), 0.5);
		area = Math.round(area*10.0)/10.0;
		
		// Print Results
		System.out.println("The area is: " + area);
		
		
		scanner.close();  // closes the Scanner object
		
		System.exit(0);  // exit the Application
		
		
	} // end method main

} // end class AreaOfTriangle
