package java_fundamentals;
import java.util.Arrays;

public class Question29 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2};
        int[] result = new int[arr.length];  // new array filled with 0 by default

        int index = 0;  // to keep track of where to insert

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        // Print the result array
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}