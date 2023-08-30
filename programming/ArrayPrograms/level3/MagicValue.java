package ArrayPrograms.level3;

import java.util.Arrays;

public class MagicValue {
    public static void main(String[] args) {
        int[] a= {0,4,0,0,1,3,4,1,0,2};
        int[] b=a.clone();
        Arrays.sort(b);
        int good=0;
        int bad=0;
        for (int i = 0; i < b.length; i++) {
            if(a[i]==b[i]){
                good+=a[i];
            }
            else {
                bad+=a[i];
            }
        }
        System.out.println(good-bad);
    }
}
