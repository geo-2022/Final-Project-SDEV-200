import java.util.Scanner;

public class Main {

    // Scanner to read input from the user
    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    // Create an instance of the Generator class with the Scanner
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}