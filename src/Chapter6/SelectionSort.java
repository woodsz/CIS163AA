/**
 * SelectionSort.java
 * Homework 5a: 1D Array
 * 6.17
 * Read in 10 numbers and by using selection sorting switch the largest number with the number in the end.
 */
package Chapter6;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		// Get user input
		System.out.print("Enter 10 doubles :");
		
		double[] values = new double[10];
		
		int k=0;
		while(k<values.length){
			values[k] = scanner.nextDouble();
			k++;
		}
		
		selectionSort(values);
		
		for(int i=0;i<values.length-1;i++){
			System.out.print(values[i]+" ");
		}
		scanner.close();
		System.exit(0);

	} // end method main

	public static void selectionSort(double[ ] list)
	 {
	      int i, j, first;
	      double temp;  
	      for(i=list.length-1; i>0; i--)
	      {
	           first = 0;   //initialize to subscript of first element
	           for(j=1;j<=i;j++)   //locate smallest element between positions 1 and i.
	           {
	                if(list[j]<list[first])         
	                  first = j;
	           }
	           temp = list[first];   //swap smallest found with element in position i.
	           list[first] = list[i];
	           list[i] = temp; 
	       }           
	 }

} // end class SelectionSort
