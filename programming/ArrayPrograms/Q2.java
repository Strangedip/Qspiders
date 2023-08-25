package ArrayPrograms;

// total number of decrement performed to make element divisible by k
public class Q2 {
    public static void main(String[] args) {
        int[] a = { 5, 9, 12, 16, 25 };
        int k = 6;
        ans(a, k);
        System.out.println();
        int decrementCount = 0;
        for (int i = 0; i < a.length; i++) {
            while (a[i] % k != 0) {
                decrementCount++;
                a[i] = a[i] - 1;
            }
        }
        System.out.println(decrementCount);
    }

    public static void ans(int[] a, int k) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i] % k;
        }
        System.out.println(count);
    }
}
