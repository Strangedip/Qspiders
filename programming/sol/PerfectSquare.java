package sol;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 15128;
        if (perfectSquare(n)) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a perfect Sqaure");
        }
        
        System.out.println(withBinary(0, n, n));
        System.out.println(counter);
    }

    static int counter = 0;

    static boolean perfectSquare(int n) {
        int counter1 = 0;
        for (int i = 1; i * i <= n; i++) {
            counter1++;
            if (i * i == n) {
                System.out.println(counter1);
                return true;
            }
        }
        System.out.println(counter1);
        return false;
    }

    static int withBinary(int start, int end, int n) {
        counter++;
        int mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (mid * mid == n) {
            return mid;
        } else if (mid * mid < n) {
            return withBinary(mid + 1, end, n);
        } else {
            return withBinary(start, mid - 1, n);
        }
    }
}
