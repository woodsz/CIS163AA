/**
 * GeometricObject.java
 * 
 */

package Chapter11;

public class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** CONSTRUCTOR */
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	/** CONSTRUCTOR with parameters */
	public GeometricObject(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** Return color */
	public String getColor(){
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color){
		this.color = color;
	}
	
	/** Return filled. Since filled is boolean, its get method is named isFilled */
	public boolean isFilled(){
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	/** Get date created */
	public java.util.Date getDate(){
		return dateCreated;
	}
	
	/** Return a string representation of this object */
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	

} // end class GoemetricObject
