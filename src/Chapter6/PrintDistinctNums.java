/**
 * PrintDistinctNums.java
 * Homework 5a: 1D Array
 * 6.5
 * Read in 10 integers and only print a number one time.
 */
package Chapter6;

public class PrintDistinctNums {

	public static void main(String[] args) {
	
	// Variables	
	java.util.Scanner scanner = new java.util.Scanner(System.in);  // use scanner object
	int[] numbers = new int[10];
	String[] sNumbers = new String[10];
	
	
	// Prompt user for ten numbers	
	System.out.print("Enter ten numbers: ");
	
	int n=0;
	while(n<10){
		sNumbers[n] = scanner.next();
		numbers[n] = addToNumbers(sNumbers[n], numbers, n);
		n++;
	}
	
	// output the infor,ation to the user
	for(int i=0;i<numbers.length;i++){
		System.out.print(sNumbers[i]+" ");
	}
	
	System.out.println();
	
	for(int i=0;i<numbers.length;i++){
		if(numbers[i] == -1){
			
		}
		else{
			System.out.print(numbers[i]+" ");
		}
		
	}
	

	
	scanner.close();
	


	} // end method main
	
	public static int addToNumbers( String s1, int[] s2, int index){
		
		int n = Integer.parseInt(s1);
		boolean isMatch = false;
		
		for(int i=0;i<s2.length;i++){
			if(n == s2[i]){
				isMatch = true;
			}
		}
		
		if(!isMatch){
			return n;
		}
		else{
			return -1;
		}
		
		
		

		
	} // end method addToNumbers

} // end class PrintDistinctNums
