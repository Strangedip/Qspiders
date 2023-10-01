package ArrayPrograms.level4;

import java.util.Arrays;

public class MakeBitonicArr {
    public static void main(String[] args) {
        int[] ar = { 9, 8, 7, 6, 0, 1, 2, 3, 4, 5 };
        int k = 4;
        bitonic(ar, k);
        System.out.println(Arrays.toString(ar));

    }

    public static void bitonic(int a[], int k) {
        // ascenfing order sort till k
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j + 1, j);
                }
            }
        }
        // descending order sort from k to a.length
        for (int i = k; i < a.length; i++) {
            for (int j = k + 1; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    swap(a, j + 1, j);
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
