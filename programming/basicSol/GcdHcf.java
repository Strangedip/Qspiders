package basicSol;

public class GcdHcf {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
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
        System.out.println(gcd);
    }
}
