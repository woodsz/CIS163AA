/**
 * Triangle.java
 * 
 */

package Chapter11;

public class Triangle extends GeometricObject {

	private double side1 = 1.0,
				   side2 = 1.0, 
				   side3 = 1.0;
	
	/** CONSTRUCTOR */
	public Triangle(){}
	
	/** CONSTRUCTOR with parameters */
	public Triangle(double s1, double s2, double s3){
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	/** Return side1 */
	public double getSide1(){
		return side1;
	}
	
	/** Set side1 */
	public void setSide1(double side1){
		this.side1 = side1;
	}
	
	/** Return side2 */
	public double getSide2(){
		return side2;
	}
	
	/** Set side2 */
	public void setSide2(double side2){
		this.side2 = side2;
	}
	
	/** Return side3 */
	public double getSide3(){
		return side3;
	}
	
	/** Set side2 */
	public void setSide3(double side3){
		this.side3 = side3;
	}
	
	
	/** Returns the perimeter of the triangle */
	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side3);
	}
	
	/** Return the area of the triangle */
	public double getArea(){
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow(s * ((s - side1) * (s - side2) * (s - side3)), 0.5);
		area = Math.round(area*10.0)/10.0;
		
		return area;
	}
	
	/** Return string representation of the object */
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2
				+ " side3 = " + side3;
	}
	
	/** Return details about the Triangle */
	public String getDetails(){
		return "Triangle: area = " + getArea() + " perimeter = " + getPerimeter() +
				" color = " + getColor() + " isFilled = " + isFilled();
	}
	
	
	
} // end class Triangle
