package java_fundamentals;
import java.util.Arrays;

public class Question25 {
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] numbers = {12, 5, 7, 3, 25, 9, 31, 2};

        // Step 2: Sort the array
        Arrays.sort(numbers);  // This sorts the array in ascending order

        // Step 3: Get smallest 2 and largest 2
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];

        int largest1 = numbers[numbers.length - 1];
        int largest2 = numbers[numbers.length - 2];

        // Step 4: Print the results
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
    }
}