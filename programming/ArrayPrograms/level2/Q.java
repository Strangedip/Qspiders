package ArrayPrograms.level2;

import java.util.Scanner;

// a cold storage company has n storage units. products must be preserved at n tempratures inside the unit
// identify which product must be preserved at negative temp
public class Q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prodCount=in.nextInt();
        int[] storageUnit= new int[prodCount];
        for (int i = 0; i < storageUnit.length; i++) {
            storageUnit[i]=in.nextInt();
        }
        int ans=0;
        for (int i = 0; i < storageUnit.length; i++) {
            if(storageUnit[i]<0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
