/* 
 * ComputWeeklySalary.java
 * Assignment 4: Lab 2 - Conditional Statements
 *   Problem 1.
 *   Prompts users and compute salary
 *   for the week based on user input
 *   from JOptionPanes
 */

package Chapter3;

import javax.swing.JOptionPane;    // Program uses JOptionPane

public class ComputeWeeklySalary {

	// Main method begins execution of Java application
	public static void main(String[] args) {
		
		String userInput;               	// String of input from user
		int hoursWorked;         			// Number of hours worked in a week
		double salary;                  	// Your salary at the end of week
		double regPayPerHour  =  8.00;  	// Relgupar pay per every hour under or equal to 40 hours
		double OTPayPerHour = 12.00;  		// OverTime pay per every hour over 40 hours
	
		
		// Prompt user for number of hours worked in a week and assign it to userInput
		userInput = JOptionPane.showInputDialog("What was the number of hours\nyou worked this week?");
		
		// Make sure there is a number to work with if not set it to String "0"
		if(userInput == null || userInput.equals("")){
			userInput = "0";
		}
		
		// Convert and assign hours worked to hoursWorked int variable 
		hoursWorked = Integer.parseInt(userInput);
		
		// First conditional statment is hoursWorked less than 40 hours
		if(hoursWorked <= 40){
			
			// Salary is $8.00 an hour
			salary = (hoursWorked * regPayPerHour);
			
			// Show the output to the user in a JOptionPane box
			JOptionPane.showMessageDialog(null, "Your pay this week was $" + salary + "\nNO hours worked overtime."
										  , "Salary", JOptionPane.PLAIN_MESSAGE);
		}
		
		// if hours are greater than 40 user receive $320.00 plus $12.00 per ever hour over 40
		else{
			
			int overTimeHours = hoursWorked - 40;				// Hours worked over 40
			salary = 320.00 + (overTimeHours * OTPayPerHour);	// Salary is $320.00 plus $12.00 pre hour over 40
			
			// Show the output to the user in a JOptionPane box
			JOptionPane.showMessageDialog(null, "Your pay this week was $" + salary + "\n$320.00 base pay\n"+
										  overTimeHours +" hours worked overtime. Good job!", "Salary", JOptionPane.PLAIN_MESSAGE);
		}
		
		System.exit(0);					// Exit the application
		
	} //end of main method

} // end of class ComputeWeeklySalary
