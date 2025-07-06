package java_fundamentals;
import java.util.*;
public class Question26 {
	    public static void main(String[] args) {
	        // Step 1: Initialize the array
	        int[] numbers = {5, 2, 9, 1, 7};

	        // Step 2: Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Step 3: Print the sorted array
	        System.out.println("Sorted array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}
