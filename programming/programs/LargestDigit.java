package programs;

public class LargestDigit {
    public static void main(String[] args) {
        int n = 19345;
        int largest = n % 10;
        while (n > 0) {
            if (n % 10 > largest) {
                largest = n % 10;
            }
            n /= 10;
        }
        System.out.println(largest);
    }
}