/**
 * BinToDec.java
 * Homework 9: Strings and Text I/O
 * Exercise 9.8
 *	Binary string to decimal
 */
package Chapter9;


public class BinToDec {


	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter a binary string: ");
		
		String input = scanner.next();
		
		System.out.println(binaryToDecimal(input));
		
		scanner.close();
		
		System.exit(0);

	} // end method main
	
	public static int binaryToDecimal(String str){
		
	    double j=0;
	    
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)== '1'){
	         j=j+ Math.pow(2,str.length()-1-i);
	        }

	    }
	    return (int) j;
	} 

} // end class BinToDec
