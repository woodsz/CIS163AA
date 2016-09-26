/**
 * CheckingPassword.java
 * Homework7 Stings and text I/O
 * Exercise 9.3
 * 
 */

package Chapter9;

public class CheckingPassword {

	/* VARIABLES */
	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	static String input = new String();

	
	public static void main(String[] args) {
		
		System.out.println("Create password\nMust be at least 8 characters\n"+
							"Must only be letters and digits.\nMust have at least 2 digits.");
		
		input = scanner.next();
		
		checkPassword(input);
		
		scanner.close();
		
		System.exit(0);

	} // end method main


	private static void checkPassword(String s) {

		if(s.length() >= 8) {
			
			int count_of_int = 0;
			int count_of_letter = 0;
			int count_of_other = 0;
			
			for(int i=0;i<s.length();i++){
				
				char c = s.charAt(i);
				if(Character.isDigit(c)){
					count_of_int++;
				}
				if(Character.isLetter(c)){
					count_of_letter++;
				}
				if(!Character.isDigit(c) && !Character.isLetter(c)){
					count_of_other++;
				}
			} // end for loop
			
			if(count_of_int > 1 && count_of_other < 1) {
				System.out.println("Valid Password");
				System.out.println("Number of Digits: "+ count_of_int);
				System.out.println("Number of Letters: "+ count_of_letter);
				System.out.println("Number of Others: "+ count_of_other);
				return;
			}

		} // end if

		System.out.println("Invalid Password");
		
	} // end method checkPassword
	
	

} // end class CheckingPassword
