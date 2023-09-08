package String;

public class MissChar {
    public static void main(String[] args) {
        String a="aa abc@ sad$ hsagd^";
        int miss=0;
        for (int i = 0; i < a.length(); i++) {
            char c= a.charAt(i);
            if(!((c>='A' && c<='Z')|| (c>='a' && c<='z')|| (c>='0' && c<='9') || c==' ')){
                miss++;
            }   
        }
        System.out.println(miss);
    }
}
