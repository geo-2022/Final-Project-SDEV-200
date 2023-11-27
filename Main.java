import java.util.Scanner;

// Main class serving as the entry point for the password generator application
public class Main {

    // Scanner to handle user input
    public static final Scanner keyboard = new Scanner(System.in);

     // Main method to start the application
    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}