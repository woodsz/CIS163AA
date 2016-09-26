/**
 * TestAccountClass.java
 * Homework 6: Objects and Classes
 * Exercise 8.11 - LinearEquation Object
 * 
 */

package Chapter8;

import java.util.Scanner;

public class TestLinearEquationClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a,b,c,d,e,f;
		
		// Prompt user for value for equations
		System.out.print("Enter a ,b ,c ,d ,e ,f: ");
		
		
		// Assign the values to the variables
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		f = scanner.nextDouble();
		
		LinearEquation le = new LinearEquation(a,b,c,d,e,f);
		
		if(!le.isSolvable()){
			
			// Print out to console
			System.out.println("The equation has no solution.");
			
			// Close scanner object
			scanner.close();
			
			// Exit the application
			System.exit(0);
		}
		else{
			
			
			// Print the results to the console
			System.out.println("x is: " + le.getX() + " y is: " + le.getY());
			
			scanner.close();
			
			System.exit(0);
			
			
		}
		
		
		
		
		scanner.close();
		
	} // end method main

} // end class TestLinearEquationClass


class LinearEquation {
	
	/** VARIABLES */
	private double a,b,c,d,e,f,x,y;
	
	/** CONSTRUCTOR */
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	/** GETTERS AND SETTERS */ 
	
	
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	/** METHODS */
	public boolean isSolvable() {
		
		if((a * d) - (b * c) == 0){
			return false;
		}
		return true;
		
	} // end method isSolvable
	
	public double getY() {
		
		this.y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		return y;
		
	} // end method getY
	
	public double getX() {
		
		this.x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		
		return x;
		
	} // end method getY
	
	
	
	
	
} // end class LinearEquation