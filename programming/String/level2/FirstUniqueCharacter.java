package String.level2;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s1 = "falafal";
        System.out.println(firstUniqueChar(s1));
    }

    public static int firstUniqueChar(String str) {
        boolean[] a = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (!a[i]) {
                int count = 0;
                char c = str.charAt(i);
                for (int j = 0; j < a.length; j++) {
                    if (c == str.charAt(j)) {
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
