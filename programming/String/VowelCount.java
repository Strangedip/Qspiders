package String;

public class VowelCount {
    public static void main(String[] args) {
        String a = "String";
        // a.toLowerCase();
        // int count = 0;
        // for (int i = 0; i < a.length(); i++) {
        // if (a.charAt(i) == 'a' || a.charAt(i) == 'A' || a.charAt(i) == 'e' ||
        // a.charAt(i) == 'E'
        // || a.charAt(i) == 'i' || a.charAt(i) == 'I' || a.charAt(i) == 'o' ||
        // a.charAt(i) == 'O'
        // || a.charAt(i) == 'u' || a.charAt(i) == 'U')
        // count++;
        // }
        // System.out.println(count);

        System.out.println(countVowels(a));
    }

    public static int countVowels(String b) {
        String a = b.toUpperCase();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O'
                    || a.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
