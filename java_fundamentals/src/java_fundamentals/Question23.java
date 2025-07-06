package java_fundamentals;
public class Question23 {
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] numbers = {1, 4, 34, 56, 7};

        // Step 2: Search element
        int search = 90;
        int index = -1;  // default value if not found

        // Step 3: Loop to search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i; // store index where found
                break;     // exit loop once found
            }
        }

        // Step 4: Output
        System.out.println(index);
    }
}
