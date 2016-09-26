// Lab1.java
// This program finds the solution to five different problems:
// 1. Finds the sum of two integer numbers.
// 2. Finds the area of a rectangle.
// 3. Finds the area of a triangle.
// 4. Finds the circumference of a cicle.
// 5. Finds the average of five numbers.

// Java packages
package Chapter2;

import javax.swing.JOptionPane;  // program uses JOptionPane


public class Lab1 {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      String firstNumber;   // first string entered by user
      String secondNumber;  // second string entered by user
      String userInput;		// String enter by user

      int number1;          // first number to add
      int number2;          // second number to add
      int number3;          // third number to add
      int number4;          // forth number to add
      int number5;          // fifth number to add
      int sum;              // sum of number1 and number2
      int length;			// length of rectangle
      int width;			// width of rectangle
      int areaRect;			// area of rectangle
      int base;				// base of triangle
      int height;			// height of triangle
      int areaTriangle;		// area of triangle
      int radius;			// radius of a circle;
      double circumference;    // circumference of a cirlce
      

      //1. Find the sum of two integers
      // read in first number from user as a string
      firstNumber = JOptionPane.showInputDialog( "This section adds two integers.\nEnter first integer" );

      // read in second number from user as a string
      secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

      // convert numbers from type String to type int
      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );

      // add numbers
      sum = number1 + number2;

      // display result
      JOptionPane.showMessageDialog( null, "The sum is " + sum,
         "Results", JOptionPane.PLAIN_MESSAGE );


      //2. Find the area of a rectangle
      // read in the length of the rectangle from user as a string
      firstNumber = JOptionPane.showInputDialog( "This section finds the area of a rectangle.\nEnter the length" );

      // read in the width of the rectangle from user as a string
      secondNumber = JOptionPane.showInputDialog( "Enter the width" );

      // convert numbers from type String to type int
      length = Integer.parseInt( firstNumber );
      width = Integer.parseInt( secondNumber );

      // Calculate the area
      areaRect = length * width;

      // display result
      JOptionPane.showMessageDialog( null, "The area of the rectangle is " + areaRect,
         "Results", JOptionPane.PLAIN_MESSAGE );
      
	
      // 3. Find the area of a triangle.
      // Read in the base of the triagnle from the user as a string
      firstNumber = JOptionPane.showInputDialog( "This section finds the area of a triangle.\nEnter the base width" );
      
      // Read in the height of the triangle from the user as a string
      secondNumber = JOptionPane.showInputDialog( "Enter the height, please." );
      
      // Convert the numbers from String to Intergers
      base = Integer.parseInt(firstNumber);
      height = Integer.parseInt(secondNumber);
      
      // Calculate are of triange
      areaTriangle = (int)(0.5 * base * height);
      
      // Display results
      JOptionPane.showMessageDialog( null, "This area of the triangle is "+ areaTriangle, "Results", JOptionPane.PLAIN_MESSAGE );
      
      
      // 4. Find the circumference of a circle
      // Read in the radius from the user as a string
      firstNumber = JOptionPane.showInputDialog( "This section finds the circumference of a circle.\nEnter the radius" );
      
      // Convert the string into a integer
      radius = Integer.parseInt(firstNumber);
      
      // Calculate the circumference
      circumference = 2 * Math.PI * radius;
      
      // Display the results
      JOptionPane.showMessageDialog( null, "This circumference is " + circumference, "Results", JOptionPane.PLAIN_MESSAGE );
      
      
      // 5. Find the average of five numbers
      // Read first number from the user as a string.
      userInput = JOptionPane.showInputDialog( "This section finds the average of five numbers.\nEnter first number." );
      
      // Convert string to integer
      number1 = Integer.parseInt( userInput );
      
      // Read second number from the user as a string.
      userInput = JOptionPane.showInputDialog( "Enter second number." ); 
      
      // Convert string to integer
      number2 = Integer.parseInt( userInput );
      
      // Read third number from the user as a string.
      userInput = JOptionPane.showInputDialog( "Enter third number." ); 
      
      // Convert string to integer
      number3 = Integer.parseInt( userInput );
      
      // Read forth number from the user as a string.
      userInput = JOptionPane.showInputDialog( "Enter forth number." ); 
      
      // Convert string to integer
      number4 = Integer.parseInt( userInput );
      
      // Read fifth number from the user as a string.
      userInput = JOptionPane.showInputDialog( "Enter fifth number." ); 
      
      // Convert string to integer
      number5 = Integer.parseInt( userInput );
      
      // Calculate average of the five numbers
      sum = ( number1 * number2 * number3 * number4 * number5 ) / 5;
      
      // Display results
      JOptionPane.showMessageDialog( null, "The average is " + sum, "Results", JOptionPane.PLAIN_MESSAGE );

      
	

      System.exit( 0 );   // terminate application with window

   } // end method main

} // end class Lab1

