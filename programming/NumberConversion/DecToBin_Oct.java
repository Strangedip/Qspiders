package NumberConversion;

public class DecToBin_Oct {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(decToBinary(n));
        System.out.println(decToOcatal(n));
    }

    public static String decToBinary(int n) {
        String ans = "";
        while (n > 0) {
            int rem = n % 2;
            ans = rem + ans;
            n /= 2;
        }
        return ans;
    }

    public static String decToOcatal(int n) {
        String ans = "";
        while (n > 0) {
            int rem = n % 8;
            ans = rem + ans;
            n /= 8;
        }
        return ans;
    }

}
