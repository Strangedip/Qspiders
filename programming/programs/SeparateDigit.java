// package programs;

public class SeparateDigit {
    public static void main(String[] args) {
        int n = 10234;
        String ans = "";
        for (; n > 0; n = n / 10) {
            ans = ans + n % 10;
        }
        System.out.println(ans);
        for (int i = ans.length() - 1; i >= 0; i--) {
            System.out.println(ans.charAt(i));
        }

    }

}
