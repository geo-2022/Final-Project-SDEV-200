public class Alphabet {

	// Constants representing different components of the alphabet
	public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBERS = "1234567890";
	public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
	
	// StringBuilder to store the selected components of the alphabet
	private final StringBuilder pool;

	// Constructor to create an instance of the Alphabet class with specified components
	public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {
		
	// Initialize the StringBuilder
		pool = new StringBuilder();
		
		if (uppercaseIncluded) pool.append(UPPERCASE_LETTERS);
		
		if (lowercaseIncluded) pool.append(LOWERCASE_LETTERS);
		
		if (numbersIncluded) pool.append(NUMBERS);
		
		if (specialCharactersIncluded) pool.append(SYMBOLS);
		
	}
	
	// Getter method to retrieve the generated alphabet as a string
	public String getAlphabet() {
		return pool.toString();
	}
}