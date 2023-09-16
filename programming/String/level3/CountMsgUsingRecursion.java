package String.level3;

public class CountMsgUsingRecursion {
    public static void main(String[] args) {
        String s = "aaHiaaaHiaHiaaa";
        String msg = "Hi";

        System.out.println(countSubString(s, msg, 0));
    }

    public static int countSubString(String s, String msg, int start) {
        int newIndex = s.indexOf(msg, start);
        if (!s.contains(msg) || newIndex < 0) {
            return 0;
            
        }
        return 1 + countSubString(s, msg, newIndex + 1);
    }
}
