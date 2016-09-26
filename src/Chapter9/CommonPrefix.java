/**
 * CommonPrefix.java
 * Homework 9: Strings and Text I/O
 * Exercise 9.28
 *	Check two strings and compare if they have the same prefix or not.
 */

package Chapter9;

public class CommonPrefix {


	public static void main(String[] args) {

		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter first word: ");
		String w1 = input.next();
		
		System.out.print("Enter second word: ");
		String w2 = input.next();
		
		System.out.println("The common prefix of " + w1 + " and " + w2);
		
		String result = prefix(w1, w2);
		
		if(result.equals(" ")) {
			System.out.println("is nothing.");
		}
		else {
			System.out.println("is " + result);
		}
		
		input.close();
		System.exit(0);

	} // end method main
	
	public static String prefix (String s1, String s2) {
		
		
		if(s1.substring(0, 3).equals(s2.substring(0, 3))) {
			String result = s1.substring(0, 3);
			return result;
		}		
		
		// If the prefix doesn't match return empty string.
		return " ";
	}

} // end class CommonPrefix
