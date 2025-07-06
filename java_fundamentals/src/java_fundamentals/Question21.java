package java_fundamentals;
import java.util.*;
public class Question21 {
    public static void main(String[] args) {
        // Step 1: Initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        double average;

        // Step 2: Loop through the array to calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Step 3: Calculate average
        average = (double) sum / numbers.length;

        // Step 4: Print sum and average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}