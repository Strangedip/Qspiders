package sol;

public class Factorial {
    public static void main(String[] args) {
        for (int n = 5; n < 10; n++) {
            
            int fact = 1;
            for (int i = n; i > 0; i--) {
                fact *= i;
            }
            // System.out.println(fact);
            System.out.println(fact(n));
        }
    }

    // recursion method
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
