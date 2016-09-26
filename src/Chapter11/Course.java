/**
 * 	Course.java
 *  Homework 8 - Inheritance and Polymorphism
 *  Exercise 11.5
 *  ArrayList 
 */

package Chapter11;

public class Course {
	

	private String courseName;
	private java.util.ArrayList<String> students = new java.util.ArrayList<String>();
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		students.add(student);
		numberOfStudents++;
	}
	
	public java.util.ArrayList<String> getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		students.remove(student);
		numberOfStudents--;
	}
	
} // end class Course
