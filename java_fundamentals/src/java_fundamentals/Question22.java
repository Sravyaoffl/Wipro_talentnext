package java_fundamentals;
public class Question22  {
    public static void main(String[] args) {
        // Step 1: Initialize an array
        int[] numbers = {25, 10, 85, 40, 5};

        // Step 2: Assume first element is both max and min
        int max = numbers[0];
        int min = numbers[0];

        // Step 3: Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Step 4: Print max and min
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
