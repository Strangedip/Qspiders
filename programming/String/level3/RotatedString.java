package String.level3;

public class RotatedString {
    public static void main(String[] args) {
<<<<<<< HEAD
        String s1="ABCD";
        String s2="CDAB";
        
=======
        String s1 = "ABCD";
        String s2 = "CDAB";
        String temp = s1 + s1;
        if (temp.contains(s2) && s1.length() == s2.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
>>>>>>> a6da480320bb459fbae975cba73f51be0ab8ad63
    }
}
