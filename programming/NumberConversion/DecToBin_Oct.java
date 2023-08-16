package NumberConversion;

public class DecToBin_Oct {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(toBinary(n));
        System.out.println(toOcatal(n));
    }

    public static String toBinary(int n) {
        String ans = "";
        while (n > 0) {
            int rem = n % 2;
            ans = rem + ans;
            n /= 2;
        }
        return ans;
    }

    public static String toOcatal(int n) {
        String ans = "";
        while (n > 0) {
            int rem = n % 8;
            ans = rem + ans;
            n /= 8;
        }
        return ans;
    }

}
