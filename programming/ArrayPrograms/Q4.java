package ArrayPrograms;

// wap to count no. of total occurence in array nums
//in int-2
//   arr-5 - 37, 823, 122, 2322, 6017
public class Q4 {
    public static void main(String[] args) {
        int[] a = { 37, 823, 122, 2322, 6017 };
        int target = 2;
        int max = 0;
        int ans = a[0];
        for (int i = 0; i < a.length; i++) {
            if (digitCount(a[i], target) > max) {
                max = digitCount(a[i], target);
                ans = a[i];
            }
        }
        System.out.println(ans);
    }

    public static int digitCount(int n, int target) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == target) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
