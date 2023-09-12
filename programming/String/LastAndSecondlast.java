package String;

public class LastAndSecondlast {
    public static void main(String[] args) {
        String s = "bat";
        String ans = s.charAt(s.length() - 1) + " " + s.charAt(s.length() - 2);
        System.out.println(ans);
    }
}
