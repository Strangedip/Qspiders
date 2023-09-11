package String;

import java.util.HashMap;

public class CharOccurence {
    public static void main(String[] args) {
        String s1 = "maharashtra";
        countChar2(s1);
        countChar(s1);
    }

    public static void countChar2(String s1) {
        boolean[] a = new boolean[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            if (!a[i]) {
                int count = 0;
                char c = s1.charAt(i);
                for (int j = 0; j < a.length; j++) {
                    if (c == s1.charAt(j)) {
                        a[j] = true;
                        count++;
                    }
                }
                System.out.println(c + ":" + count);
            }

        }
    }

    public static void countChar(String s1) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }   
    }
}
