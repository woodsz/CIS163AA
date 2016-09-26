/*
 * 	PalindromeInt.java
 * 	Assignment 8: Homework 4: Methods
 * 	Excersise 5.3
 * 	Prompts user to enter a three digit number than tests number to see
 * 	if it is a palindrome number.
 */


package Chapter5;

import javax.swing.JOptionPane;

public class PalindromeInt {
	
	public static void main(String[] args) {
	
		String s = "";      // the sring from the user
		int num;			// the number entered by user
		
		
		// display and collect input from the user, than covert it to an int
		s = JOptionPane.showInputDialog("Enter a three didgit number\nto see if it a palindrome number. ");
		num = Integer.parseInt(s);
				
		
		// display to the user the results
		JOptionPane.showMessageDialog(null,"Number is Palindrome: " + isPalindrome(num),"Results", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0); // Exit the application successfully

	} // end method main
	
	// returns the reserval of a number
	public static int reverse(int i){
		
		int rNum = 0;     // set return varible to 0
		int n1,n2,n3;
		
		n1 = i / 100;
		n2 = i % 100 / 10;
		n3 = i % 10;

		rNum = n3 * 100 + n2 * 10 + n1;
		
		return rNum;
	} // end method reverse
	
	// returns true if number is the same reversed or not
	public static boolean isPalindrome(int i){
		
		// returns the reverse of the number
		int ri = reverse(i);   
		
		// if the number = the reverse number return true, else return false
		if(i == ri){		
			return true;
		}
		else{
			return false;
		}	
		
	} // end method isPalindrome
	

} // end class PalindromeInt
