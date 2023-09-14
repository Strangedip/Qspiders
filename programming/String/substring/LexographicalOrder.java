package String.substring;

import java.util.ArrayList;
import java.util.Arrays;

public class LexographicalOrder {
    public static void main(String[] args) {
        String[] s = { "vadapav", "samosa", "chai", "poha", "coffee", "sutta" };
        // for (int i = 0; i < s.length; i++) {
        // for (int j = 0; j < s.length - 1; j++) {
        // if (s[j].compareTo(s[j + 1]) > 0) {
        // String t = s[j];
        // s[j] = s[j + 1];
        // s[j + 1] = t;
        // }
        // }
        // }
        mergeSort(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    public static void mergeSort(String[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);

    }

    public static void merge(String[] a, int low, int mid, int high) {
        ArrayList<String> arr = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (a[left].compareTo(a[right]) < 0) {
                arr.add(a[left]);
                left++;
            } else {
                arr.add(a[right]);
                right++;
            }
        }
        while (left <= mid) {
            arr.add(a[left]);
            left++;
        }
        while (right <= high) {
            arr.add(a[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            a[i] = arr.get(i - low);
        }
    }
}
