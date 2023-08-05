package sol;

public class Prime {
    public static void main(String[] args) {
        int n = 47;
        if (isPrime(n)) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
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
