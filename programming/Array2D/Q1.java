package Array2D;

// if x is at even find even number's digit sum else vice versa
public class Q1 {
    public static void main(String[] args) {
        int[][] a = {
                { 454, 55, 521, 14 },
                { 78, 326, 104, 989 },
                { 23447, 174, 87, 845 },
                { 25, 81, 53, 11 }
        };
        int x = 104; // ans 122
        sol(a, x);
    }

    public static void sol(int[][] a, int x) {
        if (isAtEven(a, x)) {
            System.out.println(evenSum(a));
        } else {
            System.out.println(oddSum(a));
        }
    }

    public static int evenSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] % 2 == 0) {
                    sum += digitSum(a[i][j]);
                }
            }
        }
        return sum;
    }

    public static int oddSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] % 2 != 0) {
                    sum += digitSum(a[i][j]);
                }
            }
        }
        return sum;
    }

    public static int digitSum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static boolean isAtEven(int[][] a, int x) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == x) {
                    if ((i + j) % 2 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
