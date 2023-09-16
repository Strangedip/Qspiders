package String.level2;

import java.util.Arrays;

public class Q {
    public static void main(String[] args) {
        String s1 = "today is tuesday in sept";
        revPrint(s1);
        revPrint2(s1);
    }

    // using split method of string
    public static void revPrint(String s1) {
        String[] a = s1.split(" ");
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    // using out own method
    public static void revPrint2(String s1) {

        String ans = "";
        for (int i = 0; i < s1.length(); i++) {
            String word = "";
            while (i < s1.length() - 1 && s1.charAt(i) != ' ') {
                word += s1.charAt(i);
                i++;
            }
            ans = word + " " + ans;
        }
        System.out.println(ans);
    }
}
