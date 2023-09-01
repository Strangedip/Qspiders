package ArrayPrograms.SortingArray;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 4, 2, 7, 1, 6, 18, 0 };
        System.out.println(Arrays.toString(a));
        sort1(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i;
            while (j > 0 && current < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = current;
        }
    }

    

    public static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
