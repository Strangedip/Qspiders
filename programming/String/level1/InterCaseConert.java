package String.level1;

public class InterCaseConert {
    public static void main(String[] args) {
        String a= "AscdA";
        char[] c = a.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A'&&c[i]<='Z')
            {
                c[i]=(char)(c[i]+32);
            }
            else if(c[i]>='a'&&c[i]<='z')
            {
                c[i]=(char)(c[i]-32);
            }
        }
        String ans=new String(c);
        System.out.println(ans);
    }
}
