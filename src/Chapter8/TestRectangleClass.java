/**
 * Rectangle.java
 * Homework 6: Objects and Classes
 * Exercise 8.1 - Rectangle Object
 * 
 */

package Chapter8;

class Rectangle {
	
	// Class Variables
	public double width = 1, height = 1;
	
	// default CONSTRUCTOR
	public Rectangle() {}
	
	// overloaded CONSTRUCTOR
	public Rectangle(double w, double h) {
		
		// setting the width and height of the rectangle
		width = w;
		height = h;
	}
	
	// find the area of the rectangle
	public double getArea() {
		
		double area = 0;
		
		area = width * height;
		
		return area;
	} // end method getArea
	
	
	// find the perimeter of the rectangle
	public double getPerimeter() {
		
		double perimeter = 0;
		
		perimeter = 2 * (width + height);
		
		return perimeter;
	} // end method getPerimeter
	

} // end class Rectangle



public class TestRectangleClass {
	
	public static void main(String[] args) {
		
		// create two rectangles
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		// display Rectangle one measurements
		System.out.println("Rectangle one - width: "+r1.width+
				" height: "+r1.height+" area: "+r1.getArea()+
				" perimeter: "+r1.getPerimeter());
		
		// display Rectangle two measurements
		System.out.println("Rectangle two - width: "+r2.width+
				" height: "+r2.height+" area: "+r2.getArea()+
				" perimeter: "+r2.getPerimeter());
		
		
	} // end method main
	
} //end class TestRectangleClass


