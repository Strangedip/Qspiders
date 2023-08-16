// package programs;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 4565;

        // sum of digits of a number

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(sum(n));
    }

    // keep summing number digits till number is single digit
    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum(sum);
    }
}
