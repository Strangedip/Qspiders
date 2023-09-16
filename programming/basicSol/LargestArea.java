package basicSol;

import java.util.Scanner;

public class LargestArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float base = in.nextInt();
        float height = in.nextInt();
        float base1 = in.nextInt();
        float height1 = in.nextInt();
        float t1=(base*height)/2;
        float t2=(base1*height1)/2;
        System.out.println(t1>t2?t1:t2);
    }
}
