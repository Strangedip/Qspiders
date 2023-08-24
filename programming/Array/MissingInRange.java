package Array;

public class MissingInRange {
    public static void main(String[] args) {
        int[] a = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        // EZ way for range 0 to n and 1 missing element
        int arrSum = 0;   // sum of array 
        for (int i = 0; i < a.length; i++) {
            arrSum += a[i];
        }
        int n = a.length;
        int sum = (n * (n + 1)) / 2; // sum of 0 to n (natural numbers)
        System.out.println(sum - arrSum);
    }

}
