package String;

import java.util.ArrayList;

// in- SOSTOT
// out - 2 (SOSSOS)
public class Q1 {
    public static void main(String[] args) {
        String s = "OSOSTSTOT";
        String msg = "SOS";
        // String[] a = new String[s.length()/3];
        ArrayList<String> a = new ArrayList<>();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            word += s.charAt(i);
            if ((i + 1) % 3 == 0) {
                a.add(word);
                word = "";
            }
        }
        int count = 0;
        for (String string : a) {
            if (!string.equals(msg)) {
                count += countMiss(string, msg);
            }
        }
        System.out.println(count);
    }

    public static int countMiss(String s, String msg) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=msg.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}
