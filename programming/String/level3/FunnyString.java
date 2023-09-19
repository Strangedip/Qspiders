package String.level3;

// funny string is on reerse the array diffrence of character is same as of original array
// ABC -> 1,1 , CBA-> 1,1

public class FunnyString {
    public static void main(String[] args) {
        String s1 = "ABCABC";
        System.out.println(isFunnyString(s1));
    }

    public static boolean isFunnyString(String s) {
        if (s.length() <=2) {
            return true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (absDiff(s.charAt(i), s.charAt(i + 1)) != absDiff(s.charAt(s.length() - 1 - i),
                    s.charAt(s.length() - 2 - i))) {
                return false;
            }
        }
        return true;
    }

    public static int absDiff(char a, char b) {
        return a > b ? a - b : b - a;
    }
}
