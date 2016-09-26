/**
 * SortStrings.java
 * Homework 9: Strings and Text I/O
 * Exercise 9.11
 *	Sort characters in a string.
 */

package Chapter9;

public class SortStrings {


	public static void main(String[] args) {
		
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter a series of characters: ");
		
		String input = scanner.next();

		System.out.println(sort(input));
		
		
		scanner.close();
		System.exit(0);

	} // end method main 
	
	public static String sort(String s) {
		
	    String ss = s;
	    char[] word = ss.toCharArray();

	    for(int i=0;i<(word.length-1);i++){
	        for(int j=i+1;j>0;j--){
	            if(word[j]<word[j-1]){
	                char temp=word[j-1];
	                word[j-1]=word[j];
	                word[j]=temp;
	            }
	        }
	    }
	    ss = String.valueOf(word);
	    return ss;
	    
	} // end method sort

} // end class SortStrings
