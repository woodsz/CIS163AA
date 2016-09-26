/* 
 * StudentsExamScores.java
 * Assignment 4: Lab 2 - Conditional Statements
 *   Problem 3.
 *   Prompts students for two exams scores and based on the
 *   average they recieve a certain grade
 */

package Chapter3;

import javax.swing.JOptionPane;    // Program uses JOptionPane

public class StudentsExamScores {
	
	// Main method begins execution of Java application
	public static void main(String[] args) {
			
		String sScore1;
		String sScore2;
		String grade = "";
		
		int iScore1;
		int iScore2;
		int averageScore;
		
		
		// Collect scores from students
		sScore1 = JOptionPane.showInputDialog("Enter first exam score.");
		sScore2 = JOptionPane.showInputDialog("Enter second exam score.");
		
		// Convert scores to integers
		iScore1 = Integer.parseInt(sScore1);
		iScore2 = Integer.parseInt(sScore2);
		
		// Determin the average of the two exams
		averageScore = (iScore1 + iScore2) / 2;
		
		// Check to see if either exam score is below 40 percent or the 
		// average of both is under 60 percent, if true grade is failing
		if(iScore1 <  40 || iScore2 < 40 || averageScore < 60){
			
			grade = "Failed";
		}
		// Check to see if the average is between 60 an 90 percent
		// if true the grade is passing without honors
		else if(averageScore <= 90){
			
			grade = "Passing (without honors)";
		}
		// The average should be above 90 percent for a passing grade with honors.
		else{
			
			grade = "Passing with honors, Congats!";
		}
			
		
		
		// Formated output to student with JOptionPane
		JOptionPane.showMessageDialog(null, String.format("Exam one score: %s%%\n" +
												 "Exam two score: %s%%\n" +
												 "Average score:  %d%%\n" +
												 "Grade: %s", sScore1, sScore2, averageScore, grade), "Grades", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);              // exit the application

	} // end of main method

} // end of class StudentsExamScores
