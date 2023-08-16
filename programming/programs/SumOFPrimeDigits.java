public class SumOFPrimeDigits {
    public static void main(String[] args) {
        int n = 5417;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit <= 1) {
            } else if (isPrime(digit)) {
                sum += digit;
            }
            n /= 10;
        }
        System.out.println(sum);

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (i * i == n) {
                return false;
            }

        }
        return true;
    }
}
