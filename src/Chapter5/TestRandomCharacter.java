/*
 *  TestRandomCharacter.java
 *  Assignment 8: Homework 4: Methods
 * 	Excersise 5.23
 *  Prints out a 100 uppercase characters and than a 100 digits
 *  10 in a row 
 */
package Chapter5;

public class TestRandomCharacter { 
	 /** Main method */ 
	 public static void main(String[] args) { 
		 final int NUMBER_OF_CHARS = 200; 
		 final int CHARS_PER_LINE = 10;
		 char ch;
		 
		 // Print random characters between 'a' and 'z', 25 chars per line 
		 for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			 if(i<=100){
				  ch = RandomCharacter.getRandomUppercaseLetter(); 
			 }
			 else{
				  ch = RandomCharacter.getRandomDigitCharacter();
			 }
			 
			 if ((i + 1) % CHARS_PER_LINE == 0) 
				         System.out.println(ch); 
			 else{ 
			         System.out.print(ch); 
			     } 
		   } 
	
	} // end method main
} // end class TestRandomCharacter
