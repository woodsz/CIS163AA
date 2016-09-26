/**
 * AveragingArrays.java
 * Homework 5a: 1D Array
 * 6.8
 * Read in 10 doubles and display the average of them.
 */
package Chapter6;

import java.util.Scanner;

public class AveragingArrays {
	
	public static void main(String[] args) {
		
		// Variables	
		Scanner scanner = new Scanner(System.in);  // use scanner object
		double[] dou = new double[10];
		
		
		// Prompt user for ten numbers	
		System.out.print("Enter ten doubles: ");
		
		int n=0;
		while(n<10){
			dou[n] = scanner.nextDouble();
			n++;
		}
		
		double average = average(dou);
		
		// output to the user
		System.out.println("The average is: " + average);
		
		scanner.close();
		
	} // end method main
	
	public static int average(int[] n){
		int result = 0;
		int total = 0;
		
		for(int i=0;i<n.length;i++){
			total += n[i];
		}
		
		result = total/n.length;

		
		return result;
	} // end method avaerage returns int
	
	public static double average(double[] d){
		double result = 0;
		double total = 0;
		
		for(int i=0;i<d.length;i++){
			total += d[i];
		}
		
		result = total/d.length;
		
		
		
		return result;
	} // end method average returns double

} // end class AveragingArrays
