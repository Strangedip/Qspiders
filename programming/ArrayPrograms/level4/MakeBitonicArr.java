package ArrayPrograms.level4;

import java.util.Arrays;

public class MakeBitonicArr {
    public static void main(String[] args) {
        int[] ar = { 2, 1, 5, 6, 0, 8, 7, 4 };
        int k = 4;
        bitonic(ar, k);
        System.out.println(Arrays.toString(ar));

    }

    public static void bitonic(int[] a, int k) {
        if (k >= a.length) {
            return;
        }
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, a[j], a[j + 1]);
                }
            }
        }
        for (int i = k - 1; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    swap(a, a[j], a[j + 1]);
                }
            }
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
