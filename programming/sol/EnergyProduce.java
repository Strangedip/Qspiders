package sol;

import java.util.Scanner;

public class EnergyProduce {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int e=in.nextInt();
        int r=in.nextInt();
        int t=in.nextInt();
        while(t>1){
            e=e+r;
            t--;
        }
        System.out.println(e);
    }
}
