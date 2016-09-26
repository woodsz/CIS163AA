/**
 * ReplacText.java
 * Homework 9: Strings and Text I/O
 * Exercise 9.20
 *	Read, place text, write back to same file.
 */

package Chapter9;

public class ReplaceText {


	public static void main(String[] args) throws Exception {
		// Check command-line parameter usage
		if(args.length != 3) { 
			System.out.println(
					"Usage: java ReplaceText sourceFile oldStr newStr");
			System.exit(0);
		}
		
		// Check if source file exists
		java.io.File sourceFile = new java.io.File(args[0]);
		if(!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(0);
		}
			
		
		// Create a Scanner for the input and a PrintWriter for the output
		String temp = new String();
		java.util.Scanner input = new java.util.Scanner(sourceFile);
		
		while (input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[1], args[2]);
			temp += s2;
		}
		
		input.close();
		
		input = new java.util.Scanner(temp);
		java.io.PrintWriter output = new java.io.PrintWriter(sourceFile);
		
		while (input.hasNext()) {
			String s1 = input.nextLine();
			output.println(s1);
		}
		
		
		input.close();
		output.close();
		

	} // end method main

} // end class ReplaceText
