package ArrayPrograms.level1;

public class BinayrySearch {
    public static void main(String[] args) {
        int[] a = { 1, 4, 6, 8, 10, 12, 15, 20, 25 };
        int target = 7;
        int index = binarySearch(a, target);
        if (index == -1) {
            System.out.println("Target Not found");
        } else {
            System.out.println("fount at " + index);
        }
    }

    static int binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (a[middle] == target) {
                return middle;
            } else if (a[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
