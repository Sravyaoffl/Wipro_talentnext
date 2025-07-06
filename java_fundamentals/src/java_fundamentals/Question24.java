package java_fundamentals;

public class Question24 {
    public static void main(String[] args) {
        // Step 1: Initialize array with ASCII values
        int[] asciiValues = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

        // Step 2: Loop and convert to characters
        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print((char) asciiValues[i]);
        }
    }
}