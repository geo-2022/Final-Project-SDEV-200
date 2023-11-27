import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Test class for the Generator class
class GeneratorTest {
	
    // Sample password for testing
	private final Password password= new Password("Secret");

        // Alphabets for testing different configurations
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
	
        // Generator instance for testing
    private final Generator generator = new Generator(true,false,false,false);

