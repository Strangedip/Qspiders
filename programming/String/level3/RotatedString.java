package String.level3;

public class RotatedString {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        String temp = s1 + s1;
        if (temp.contains(s2) && s1.length() == s2.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
