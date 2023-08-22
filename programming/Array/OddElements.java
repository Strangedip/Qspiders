package Array;

//WAP to print all odd elements in given array
public class OddElements {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 10 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
