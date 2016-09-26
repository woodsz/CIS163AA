// DemoLoops.java
// Assignment 6: Lab 3 Loops
// This program demonstrates the use of the while looping structure and
// than is modified to use the for looping structure

package Chapter4;

public class DemoLoops {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
	  int n;
	  int sum;
	  int rows, cols;

	 // 1. Write a loop that will print one row of 30 asterisks to the screen, one asterisk at a time.

	  
	// This was the original code....
		n = 1;
		while (n <= 30)
		{
		   System.out.print ( "*");
		   n++;
		  }
		System.out.println();
		System.out.println();
		
	// This is the modified code....
		for(n = 1; n <= 30; n++){
			System.out.print( "*" );
		}
		System.out.println();
		System.out.println();		
		

	 // 2. A loop that will print "Goodbye" to the screen ten times, with a blank line after each Goodbye.

	 // This was the original code....
	 	n = 1;
		while (n <= 10)
		{
			System.out.print ( "Goodbye");
			System.out.println();
			n++;
		  }
	 	System.out.println();
	 	
	  // This is the modified code....
	 	for(n = 1; n <= 10; n++){
			System.out.print ( "Goodbye");
			System.out.println();	 		
	 	}
	 	System.out.println();

	// 3. A loop that will add the integers from 1 to 10.  Print the sum to the screen.

	 	
	 	// This is the original code...
		sum = 0;
		n = 1;
		while (n <= 10)
		{
			sum = sum + n;
			n++;
		   }
		System.out.println("Sum = " + sum);
		System.out.println();
		
	 	// This is the modified code...
		sum = 0;
	 	for(n = 1; n <= 10; n++){
	 		sum = sum + n;	 		
	 	}
		System.out.println("Sum = " + sum);
		System.out.println();
		

	// 4. Using nested loops, write the code that will print three rows of five asterisks (*).

		//This is the original code...
		rows = 1;
		while (rows <= 3)
		 {
			 cols = 1;
			 while (cols <= 5)
			 {
				  System.out.print ( "*" );
				  cols++;
			  }
			 rows++;
			 System.out.println();
		 }

		 System.out.println();
		 
		 
		 // This is the modified code...
		for(rows = 1; rows <= 3; rows++){
			for(cols = 1; cols <= 5; cols++){
				
				System.out.print( "*" );
				
			} // end of for loop
			System.out.println();
		} // end of for loop
		 
		 
		 

      System.exit( 0 );   // terminate application with window

   } // end method main

} // end class DemoLoops