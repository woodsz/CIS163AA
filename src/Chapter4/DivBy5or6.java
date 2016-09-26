/*  DivBy5or6.java
 *  Assignment 7: Homework 3: Loops
 *  Programming Exercises 4.11
 *  Find all the number that are divisable by 5 or 6 both not both between
 *  100 and 200
 */

package Chapter4;

public class DivBy5or6 {


	public static void main(String[] args) {
		
		// create a counter
		int count = 1;
		
		// find numbers between 100 and 200 that are divisable 5 or 6 but not both.
		for(int i = 100; i <= 200; i++){
				
				if(i % 5 == 0 || i % 6 == 0){
					System.out.print(i+", ");
					
					if(count == 10){
						// output the number for the user
						System.out.print("\n");
						count = 0;
					}
					count++;
				}						
		}
		
		
		

	} // end method main

} // end class DivBy5or6
