package ArrayPrograms.SortingArray;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 4, 2, 7, 1, 6, 18, 0 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] < a[j + 1]) {
                    swap(a, i, j);
                }
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[j + 1];
        a[j + 1] = a[j];
        a[j] = temp;
    }
}
