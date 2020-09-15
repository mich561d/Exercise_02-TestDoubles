package main.java.stringUtility;

public class StringUtility {

    public static String reverseString(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        return new StringBuilder().append(text).reverse().toString();
    }

    public static String capitalizeString(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        return text.toUpperCase();
    }

    public static String lowercaseString(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        return text.toLowerCase();
    }
}
