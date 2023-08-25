package ArrayPrograms;

public class SumOfElements {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 10 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
