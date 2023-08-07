package sol;

public class PrimeInRange {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (!isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
