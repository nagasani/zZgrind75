package com.grind.misc;
public class StringManipulator {

    public static String getSmallestString(String word, String substr) {
        String smallest = word + substr; // Assume the smallest is by appending substr

        for (int i = 0; i <= word.length(); i++) {
            // Build a string by inserting substr at the current position
            StringBuilder sb = new StringBuilder(word);
            sb.insert(i, substr);
            
            String current = sb.toString();
            
            // If the current combination is smaller, update smallest
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        // Test the method
        String word = "??c???er";
        String substr = "deciph";
        System.out.println(getSmallestString(word, substr));
    }
}
