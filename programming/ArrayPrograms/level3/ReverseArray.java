package ArrayPrograms.level3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = { 4, 2, 7, 1, 6, 18, 0, 13 };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reverseOf(a)));
        System.out.println(Arrays.toString(a));
        // reverseArray(a);
        // System.out.println(Arrays.toString(a));

    }

    public static int[] reverseOf(int[] b) {
        int[] a = b.clone();
        int size = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[size - i];
            a[size - i] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void reverseArray(int[] a) {
        int size = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[size - i];
            a[size - i] = a[i];
            a[i] = temp;
        }
    }

}