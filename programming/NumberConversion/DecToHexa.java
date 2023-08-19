package NumberConversion;

public class DecToHexa {
    public static void main(String[] args) {
        int n = 1777;
        System.out.println(decToHexaDecimal(n));
    }

    public static String decToHexaDecimal(int n) {
        String ans = "";
        while (n > 0) {
            int rem = n % 16;
            switch (rem) {
                case 10:
                    ans = "A" + ans;
                    break;
                case 11:
                    ans = "B" + ans;
                    break;
                case 12:
                    ans = "C" + ans;
                    break;
                case 13:
                    ans = "D" + ans;
                    break;
                case 14:
                    ans = "E" + ans;
                    break;
                case 15:
                    ans = "F" + ans;
                    break;
                default:
                    ans = rem + ans;
                    break;
            }
            n = n / 16;
        }
        return ans;

    }
}
