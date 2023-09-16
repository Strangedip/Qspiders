package String.level2;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "cat";
        boolean anagram = false;
        if (s1.length() - s2.length() == 0) {
            anagram = isAnagram2(s1, s2);
        }
        if (anagram) {
            System.out.println("Anagram string");
        } else {
            System.out.println("Not Anagram string");
        }
    }

    public static boolean isAnagram2(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c2.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s1, String s2) {
        boolean anagram = true;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean contains = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == c) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                anagram = false;
                break;
            }
        }
        return anagram;
    }
}
