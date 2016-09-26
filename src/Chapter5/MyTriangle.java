/*
 * 	MyTriangle.java
 * 	Assignment 8: Homework 4: Methods
 * 	Excersise 5.19
 * 	Reads in three random numbers as sides of a triangle.
 * 	Computes the area if the sides are valid
 */

package Chapter5;

public class MyTriangle {

	public static void main(String[] args) {
	
		double x1, y1;					// Point 1 of triangle
		double x2, y2;					// point 2 of triangle
		double x3, y3;					// point 3 of triangle
		double side1, side2, side3; 	// sides of triangle
		// Get first points
		x1 = (Math.random()*200)-100;
		y1 = (Math.random()*200)-100;
		
		// Get second points
		x2 = (Math.random()*200)-100;
		y2 = (Math.random()*200)-100;
		
		// Get third points
		x3 = (Math.random()*200)-100;
		y3 = (Math.random()*200)-100;
		
		// Find the length of the sides
		side1 = Math.pow(x2 - x1, 2.0) + Math.pow( y2 - y1, 2.0);
		side1 = Math.pow(side1, 0.5);
		
		side2 = Math.pow(x3 - x2, 2.0) + Math.pow( y3 - y2, 2.0);
		side2 = Math.pow(side2, 0.5);
		
		side3 = Math.pow(x1 - x3, 2.0) + Math.pow( y1 - y3, 2.0);
		side3 = Math.pow(side3, 0.5);
		
		if(isValid(side1,side2,side3)){
			areaOfTriangle(side1,side2,side3);
		}
		else{
			System.out.println("The input is invalid");
		}
		
		System.exit(0);
		

	} // end of method main
	
	/* returns true if the sum of any two sides is greater than the thrid side*/
	public static boolean isValid(double side1, double side2, double side3){
		
		if(side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1){
			System.out.println("side1 :" + side1 + " side: " + side2 + " side3: " + side3);
			return true;
		}
		
		
		return false;
	}
	
	/* returns the area of the triangle*/
	public static double areaOfTriangle(double side1, double side2, double side3){
		
		double area = 0;
		double s = 0;
		// Find the area of the trianlge
		s = (side1 + side2 + side3)/2;
		area = Math.pow(s * ((s - side1) * (s - side2) * (s - side3)), 0.5);
		area = Math.round(area*10.0)/10.0;
		
		
		return area;
	}

} // end of class MyTriangle
