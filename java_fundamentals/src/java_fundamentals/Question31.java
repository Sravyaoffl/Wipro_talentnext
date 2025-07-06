package java_fundamentals;
public class Question31 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};

        boolean onlyOneOrFour = true;

        for (int num : arr) {
            if (num != 1 && num != 4) {
                onlyOneOrFour = false;
                break; // exit early if invalid number found
            }
        }

        System.out.println(onlyOneOrFour);
    }
}
