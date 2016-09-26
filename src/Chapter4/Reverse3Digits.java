package Chapter4;
// Reverse3Digits.java
// Assignment 6: Lab 3 Loops
// This program reverses a three digit number, ex: 138 will yeild 831.

// Java packages
import javax.swing.JOptionPane;  // program uses JOptionPane

public class Reverse3Digits {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      String num1str;   // first string entered by user
      int num1;         // first string as number
	  int a, b, c;	
	  int reverseNum;
	  String result;    // resulting answer will be created in the string for output display

      // read in first number from user as a string
      num1str =
         JOptionPane.showInputDialog("Enter a three digit number:" );

      // convert numbers from type String to type int
      num1 = Integer.parseInt( num1str );

	  // Separate the digits from the original number

	   a = num1 / 100;
	   b = num1 % 100 / 10;
	   c = num1 % 10;

	   reverseNum = c * 100 + b * 10 + a;

	   result = num1 + " reversed is " + reverseNum;

	  JOptionPane.showMessageDialog( null, result, "Results", JOptionPane.PLAIN_MESSAGE );


		 System.out.println();

      System.exit( 0 );   // terminate application with window

   } // end method main

} // end class Reverse3Digits
