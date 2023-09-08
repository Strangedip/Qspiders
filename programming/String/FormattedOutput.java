package String;
// WAP to convert string containing only uppercase alpha and numeric values
// in - BA1NGA2L3OR4E 
// out- (len of alpha)BANGLORE(sum of numerics)
public class FormattedOutput {
    public static void main(String[] args) {
        String a = "BA1NGA2L3OR4E";
        char[] c=a.toCharArray();
        int sum=0;
        String ans="";
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A'&& c[i]<='Z'){
                ans+=c[i];
            }
            else{
                sum+=c[i]-48;
            }
        }
        System.out.println(ans.length()+ans+sum);
    }
}
