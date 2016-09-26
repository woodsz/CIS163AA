// PerfectNumber.java
// Assignment 6: Lab 3 Loops
// This program finds all the perfect numbers in a giving integer
// and displays it to the user.
//

package Chapter4;

// Java packages
import javax.swing.JOptionPane;  // program uses JOptionPane

public class PerfectNumber {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      String num1str;   // first string entered by user
      int num1;         // first string as number
	  int fact, sum;

	  String result = "";    // resulting answer will be created in the string for output display

      // read in first number from user as a string
      num1str =
         JOptionPane.showInputDialog("Enter an integer" );

      // convert numbers from type String to type int
      num1 = Integer.parseInt( num1str );

	// find the factors of num1 and their sum
      for(int i = 1; i <= num1; i++)
      {
		  sum = 1;    // 1 is always a factor
		  fact = 2;   // test the value of fact
	
		  while ( fact <= i /2)
		  {
			   if ( i % fact == 0)		// if fact divides the number evenly then it is a factor
			   {
			       sum = sum + fact;
	
			   }		   
			    fact++;    
		  }
	      
	 
		   if ( sum == i){
				result += i + ", ";
		   
		   } 
		  
      } // end of for statement
      
      result += "\nThese are all the perfect\nnumbers for " + num1;
      
      JOptionPane.showMessageDialog( null, result, "Results", JOptionPane.PLAIN_MESSAGE ); 

      System.exit( 0 );   // terminate application with window

   } // end method main

} // end class PerfectNumber

