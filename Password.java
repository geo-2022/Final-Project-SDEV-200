// Class representing a Password
public class Password {
    String Value;
    int Length;

    // Constructor to initialize the Password with a given string
    public Password(String s) {
        Value = s;
        Length = s.length();
    }
