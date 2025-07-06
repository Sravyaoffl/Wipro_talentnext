package java_fundamentals;
import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];

        int index = 0;

        // Step 1: Add even numbers first
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }

        // Step 2: Add odd numbers after evens
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index] = num;
                index++;
            }
        }

        // Step 3: Print the rearranged array
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}