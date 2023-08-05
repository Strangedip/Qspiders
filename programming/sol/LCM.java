package sol;

public class LCM {
    public static void main(String[] args) {
        int a=8;
        int b=10;
        int lcm=(a*b)/gcd(a, b);
        System.out.println(lcm);
    }

    public static int gcd(int a,int b) {
        // int a = 12;
        // int b = 18;
        int gcd = 1;
        int i = 1;
        for (int j = 1; j <= a && j <= b; j++) {
            if (a % j == 0 && b % j == 0) {
                gcd = j;
            }
        }
        // OR
        // while (i <= a && i <= b) {
        //     if (a % i == 0 && b % i == 0) {
        //         gcd = i;
        //     }
        //     i++;
        // }
        return gcd;
    }
}
