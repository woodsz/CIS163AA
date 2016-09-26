package Chapter5;

public class RandomCharacter {

	/** Gerenate a random character */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random()*(ch2-ch1+1));
	}
	
	/** Generate a random lowercase letter */
	public static char getRandomLowercaseLetter(){
		return getRandomCharacter('a','z');
	}

	/** Generate a random upperrcase letter */
	public static char getRandomUppercaseLetter(){
		return getRandomCharacter('A','Z');
	}
	
	/** Generate a random digit character */
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0','9');
	}	
	
	/** Generate a random character */
	public static char getRandomCharacter(){
		return getRandomCharacter('\u0000','\uFFFF');
	}	
}
