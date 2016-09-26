/*  FinanicalApplication.java
 *  Assignment 7: Homework 3: Loops
 *  Programming Exercises 4.31
 *  Prompts the user to enter an amount, an interest rate, and the number of months
 *  and displays the amount in saving for each month to the user
 */
package Chapter4;

import java.util.Scanner;

public class FinanicalApplication {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int counter;
		int months = 1;
		int deposit;
		double newAmount = 0;
		double interest;
		
		
		System.out.print("Enter the initial deposit amount: ");
		deposit = scanner.nextInt();
		
		System.out.print("Enter annual percentage yield: ");
		interest = scanner.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		months = scanner.nextInt();
		
		System.out.println("Month          CD Value");
		
		for(counter = 1;counter <= months; counter++){
			
			if(counter == 1){
				newAmount = (deposit * interest) / 1200 + deposit;
				System.out.printf("%2d               $%.2f%n", counter, newAmount);
			}
			else{
				newAmount = (newAmount * interest) / 1200 + newAmount;
				System.out.printf("%2d               $%.2f%n", counter, newAmount);	
			}

		}
		
		scanner.close();
		


	} // end method main

} // end class FinanicalApplication
