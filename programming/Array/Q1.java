package Array;

import java.util.Scanner;
// count how many products are eligible for discount
// discount eligible only if product count can divide the discount amount

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int discAmount = in.nextInt();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (discAmount % a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
