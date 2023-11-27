import java.util.Objects;
import java.util.Scanner;

public class Generator {
    // Instance variable to store the Alphabet for password generation
    Alphabet alphabet;
    
     // Scanner for user input
    public static Scanner keyboard;

    // Constructor that takes a Scanner as a parameter
    public Generator(Scanner scanner) {
        keyboard = scanner;
    }
    // Constructor that initializes the alphabet based on user preferences
    public Generator(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
        alphabet = new Alphabet(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
    }

    // Method to start the main loop of the password generator
    public void mainLoop() {
        System.out.println("Welcome to Geo's Password Generator :)");
        printMenu();
