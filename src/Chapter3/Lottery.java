/* 
 * Lottery.java
 * Programming Excerise 3.15
 *   Prompts the user to enter three
 *   digits to match a random three digit lottery number,
 *   Exact macth is $10,000
 *   Mathing all numbers in any order is $3,000,
 *   Matching one is $1,000
 */

package Chapter3;

import java.util.Scanner;              // Program uses the Scanner class

public class Lottery {
	
	// Main method begin execution of Java application
	public static void main(String[] args) {
		
		// Create a Scannner
		Scanner scanner = new Scanner(System.in);
		
		// Generate a lottery
		int lottery = (int)(Math.random() * 1000);

		// System.out.println(lottery);  // Print out for testing
		
		// Prompt the user to enter a guess
		System.out.print("Enter a your lottery pick (three digits): ");
		int guess = scanner.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100 / 10;
		int guessDigit3 = guess % 10;		
		
		// Print out the lottery number
		System.out.println("The lottery number is: " + lottery);
		
		// Check the guess
		if(guess == lottery){
			System.out.println("Exact match: you win $10,000");
		}
		else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
				(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
				(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)){
			System.out.println("Mathed all digits: you win $3,000");
		}
		else if(guessDigit1 == lotteryDigit1 ||
				guessDigit1 == lotteryDigit2 ||
				guessDigit1 == lotteryDigit3 ||
				guessDigit2 == lotteryDigit1 ||
				guessDigit2 == lotteryDigit2 ||
				guessDigit2 == lotteryDigit3 ||
				guessDigit3 == lotteryDigit1 ||
				guessDigit3 == lotteryDigit2 ||
				guessDigit3 == lotteryDigit3 ){
			System.out.println("Mathed one digit: you win $1,000");
		}
		else{
			System.out.println("Sorry, no match");
		}
		
		// Close Scanner
		scanner.close();
		
		// Exit application
		System.exit(0);


	} // end of method main

} // end of class Lottery
