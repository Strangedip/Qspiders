package ArrayPrograms.level3;


public class PalindromeArray {
    public static void main(String[] args) {
        int[] a = { 6, 4, 2, 1, 2, 4, 6 };
        System.out.println(isPalindrome(a));
        System.out.println(isStringPalindrome("ABBAD"));

    }

    public static boolean isPalindrome(int[] a) {
        int size = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[size - i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isStringPalindrome(String a) {
        int size = a.length() - 1;
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(size - i)) {
                return false;
            }
        }
        return true;
    }

}
