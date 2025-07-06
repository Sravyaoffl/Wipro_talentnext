package java_fundamentals;
import java.util.Arrays;

public class Question32 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // Get the middle elements (index 1 of each array)
        int[] result = {a[1], b[1]};

        System.out.println("Middle elements: " + Arrays.toString(result));
    }
}