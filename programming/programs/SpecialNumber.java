// package programs;

public class SpecialNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(sum(n) + prod(n) == n ? "Yes" : "No");

        for (int i = 1; i <= 100; i++) {
            if (sum(i) + prod(i) == i) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int prod(int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }

}
