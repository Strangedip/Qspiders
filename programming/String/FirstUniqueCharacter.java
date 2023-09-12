package String;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s1 = "falafal";
        System.out.println(firstUniqueChar(s1));
    }

    public static int firstUniqueChar(String s1) {
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
                if (count == 1) {
                    return i+1;
                }
            }
        }
        return -1;

    }
}
