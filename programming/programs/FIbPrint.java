package programs;

public class FIbPrint {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        // regular recursion
        fib(a, b, n);
        System.out.println();

        // tail Recusrion
        fib1(a, b, n);
        System.out.println();

        //Loop method
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void fib(int a, int b, int n) {
        if (n < 1) {
            return;
        }
        int c = a + b;
        System.out.print(a + " ");
        fib(b, c, --n);
    }

    public static int fib1(int a, int b, int n) {
        System.out.print(a + " ");
        if (n < 2) {
            return n;
        }
        int c = a + b;
        return fib1(b, c, --n);
    }
}
