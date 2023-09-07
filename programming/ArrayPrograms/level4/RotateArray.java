package ArrayPrograms.level4;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = { 1, 0, 2, 3, 4 };
        cyclicSort(a);
        for (int i = 0; i < a.length; i++) {
            int temp = a[a.length - 1];
            int k = a.length - 1;
            while (k > 0) {
                a[k] = a[k - 1];
                k--;
            }
            a[0] = temp;
            System.out.println(Arrays.toString(a));
        }

    }

    public static void cyclicSort(int[] a) {
        int i = 0;
        while (i < a.length - 1) {
            if (a[i] != i) {
                int temp = a[a[i]];
                a[a[i]] = a[i];
                a[i] = temp;
            } else {
                i++;
            }
        }
    }
}
