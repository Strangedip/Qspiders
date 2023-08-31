package ArrayPrograms.SortingArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 4, 2, 7, 1, 6, 18, 0 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

}
