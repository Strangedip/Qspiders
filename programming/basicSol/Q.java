package basicSol;
// package programs;

public class Q {
    public static void main(String[] args) {
        int n = 2514795;
        // int ans=sumOfEvenDigits(n)*sumOfOddDigits(n);
        System.out.println(directSol(n));
    }

    public static int directSol(int n)
    {
        int osum = 0;
        int esum = 0;

        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) {
                osum += d;
            }
            if (d % 2 != 0) {
                esum += d;
            }

            n /= 10;
        }
        return osum*esum;
    }

    public static int sumOfEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) {
                sum += d;
            }
            n /= 10;
        }
        return sum;
    }

    public static int sumOfOddDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) {
                sum += d;
            }
            n /= 10;
        }
        return sum;
    }
}
