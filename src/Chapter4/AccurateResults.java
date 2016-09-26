/*  AccurateResults.java
 *  Assignment 7: Homework 3: Loops
 *  Programming Exercises 4.23
 *  This program caluates from right to left and from left to right.
 */

package Chapter4;

public class AccurateResults {


	public static void main(String[] args) {
		
		int numer = 1;
		int denom = 0;
		double sum = 0;
		double sum2 = 0;
		
		// Adding up from the lowest
		for(denom=1;denom<=50000;denom++){
			sum = (numer / denom) + sum;
		}
		
		// Adding down from the highest
		for(denom=50000;denom>=1;denom--){
			sum2 = (numer / denom) + sum2;
		}
		
		// Printing out results to the users
		System.out.printf("The results from left to right: %f%n" +
							"Results from right to left: %f", sum, sum2);
		

	} //end method main

} // end class AccurateResults
