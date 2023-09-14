package String.level1;

public class Palindrome {
    public static void main(String[] args) {
        String a = "mama";
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
