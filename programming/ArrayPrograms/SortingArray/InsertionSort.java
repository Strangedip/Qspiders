package ArrayPrograms.SortingArray;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 4, 2, 7, 1, 6, 18, 0 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
    
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
