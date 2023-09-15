package String.level2;

public class EncryptString {
    public static void main(String[] args) {
        String s = "Meet me at the clock tower";
        String[] c = s.split(" ");
        solution(c);
        for (String string : c) {
            System.out.print(string + " ");
        }

    }

    public static void solution(String[] s) {
        for (int i = 0; i < s.length; i++) {
            int d = i % 3;
            if (d == 0) {
                s[i] = replaceVowel(s[i]);
            }
            if (d == 1) {
                s[i] = replaceConsonent(s[i]);
            }
            if (d == 2) {
                s[i] = replaceSmall(s[i]);
            }
        }
    }

    public static String replaceVowel(String s) {
        String ans = "";
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                    || c == 'U') {
                ans += '%';
            } else {
                ans += c;
            }
        }
        return ans;
    }

    public static String replaceConsonent(String s) {
        String ans = "";
        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' && c != 'o' && c != 'O' && c != 'u'
                    && c != 'U') {
                ans += '#';
            } else {
                ans += c;
            }
        }
        return ans;

    }

    public static String replaceSmall(String s) {
        String ans = "";
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                ans += (char) (c - 32);
            } else {
                ans += c;
            }
        }
        return ans;
    }
}
