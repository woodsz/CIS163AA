/* 
 * LicenseFeePerHorsePower.java
 * Assignment 4: Lab 2 - Conditional Statements
 *   Problem 2.
 *   Prompts users for their car's horse power
 *   than out put the state's license fee for the
 *   car using JOptionPane boxes
 */

package Chapter3;

import javax.swing.JOptionPane;    // Program uses JOptionPane

public class LicenseFeePerHorsePower {
	

	// Main method begins execution of Java application
	public static void main(String[] args) {
		
		String userInput;				// String input from the user
		int horsePower = 0;				// The amount of horsepower entered by user
		int licenseFee = 0;				// The license fee based on horse power
		
		// Prompt user for their cars horsepower.
		userInput = JOptionPane.showInputDialog("Please enter the amount of horsepower your car has,\nto get licensing fees.");
		
		// Convert String to Int and assign it to horsePower variable if the cancel button was not pressed and input was entered
		if(userInput != null && !userInput.equals("")){
			
			horsePower = Integer.parseInt(userInput);
		}
		else{			
			// Prompt user that cancel button was pressed than exit
			JOptionPane.showMessageDialog(null, "Cancel button was pressed\nor nothing was entered\nGood-Bye");
			
			System.exit(0);			// Exit the System because cancel button was pressed
		}
		
		
		// Now determin which license fee fits the horsepower amount provided
		if(horsePower < 0){			
			// Prompt user that horsepower was entered as a negative value than exit
			JOptionPane.showMessageDialog(null, "You enter a number that was negative, Good-Bye");
			
			System.exit(0);			// Exit the System because cancel button was pressed			
		}
		
		else if(horsePower <= 50){			
			// If horsepower is between 0 and 50
			licenseFee = 0;			
		}
		
		else if(horsePower <= 100){			
			// If horsepower is between 51 and 100
			licenseFee = 30;			
		}
		
		else if(horsePower <= 200){			
			// If horsepower is between 101 and 200
			licenseFee = 70;			
		}
		
		else if(horsePower <= 300){			
			// If horsepower is between 201 and 300
			licenseFee = 150;			
		}
		
		else{			
			// If horsepower is over 300
			licenseFee = 500;			
		}

		
		// Output the license fees to the users format output and exit the application
		JOptionPane.showMessageDialog(null, String.format("Your license fees are: $%d.00", licenseFee));
		
		System.exit(0);          // Exits the application

	} // end of main method

} // end of class LicenseFeePerHorsePower
