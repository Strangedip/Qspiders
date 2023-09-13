package String;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramSubString {
    public static void main(String[] args) {
        String s1="asdasd";
        String s2="ad";
        System.out.println(findAnagramsIndices(s1, s1.length(), s2, s2.length()));
        
    }

    public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m){
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n-m+1; i++) {
            String subString="";
            for (int j = i; j < i+m ; j++) {
                subString+=str.charAt(j);
            }
            if(isAnagram(ptr, subString))
            {
                a.add(i);
            }
        }
        
        return a;
    }

    public static boolean isAnagram(String s1, String s2) {
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
}
