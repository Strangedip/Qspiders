package String;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {
    public static void main(String[] args) {
        String s = "java is programming language used to write java programming";
        wordCount(s);
    }

    public static void wordCount(String s) {
        String[] sr = s.split(" ");
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < sr.length; i++) {
            if (h.containsKey(sr[i])) {
                h.put(sr[i], h.get(sr[i]) + 1);
            } else {
                h.put(sr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> m : h.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
