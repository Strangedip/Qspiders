package ArrayPrograms.level1;

public class PrimeElements {
    public static void main(String[] args) {
        int[] a = { 2, 5, 4, 7, 16, 29, 3 };
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                System.out.println(a[i]);
            }
        }

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
