/**
 *  TestTriangle.java
 *  Homework 8 - Inheritance and Polymorphism
 *  Exercise 11.1
 *  Triangle Class
 */

package Chapter11;

public class TestTriangle {
	public static void main(String[] args){
		
		Triangle t = new Triangle(1,1.5,1);
		
		t.setColor("yellow");
		t.setFilled(true);
		
		System.out.println(t.getDetails());
		
	} // end main method
	
} // end class TestTriangle
