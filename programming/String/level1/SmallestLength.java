package String.level1;

public class SmallestLength {
    public static void main(String[] args) {
        String[] s = { "bye","hi", "hello", "welcome", "maharashtra" };
        String ans = s[0];
        for (String string : s) {
            if (string.length() < ans.length()) {
                ans = string;
            }
        }
        System.out.println(ans);
    }
}
