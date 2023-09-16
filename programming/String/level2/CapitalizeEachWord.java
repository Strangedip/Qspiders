package String.level2;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        String s = "How are you?";
        sol(s);
    }

    public static void sol(String s) {
        String[] sr=s.split(" ");
        String ans="";
        for (int i = 0; i < sr.length; i++) {
            ans+= capitalize(sr[i])+" ";
        }
        System.out.println(ans);
    }
    public static String capitalize(String s){
        char[] c= s.toCharArray();
        if(c[0]>='a' && c[0]<='z')
        {
            c[0]=(char)(c[0]-32);
        }
        return new String(c);
    }
}
