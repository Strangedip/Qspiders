public class ArmStrongNum {
    public static void main(String[] args) {

        // int n = 153;
        // if (isArmStrong(n)) {
        // System.out.println("armstrong num");
        // } else {
        // System.out.println("not an armstrong num");
        // }

        for (int i = 0; i < 10000; i++) {
            if (isArmStrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmStrong(int n) {
        int og = n;
        int sum = 0;
        int power = digitCount(n);

        while (n > 0) {
            int digit = n % 10;
            sum += raisedTo(digit, power);
            n /= 10;
        }

        if (sum == og) {
            return true;
        } else {
            return false;
        }
    }

    public static int raisedTo(int n, int power) {
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow = pow * n;
        }
        return pow;
    }

    public static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
