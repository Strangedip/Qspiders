package ArrayPrograms.level1;

public class ProdOfEvenElements {
    public static void main(String[] args) {
        int[] a = { 7, 3, 6, 2, 1, 4, 8, 5, 2, 6 };
        int prod = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                prod *= a[i];
            }
        }
        System.out.println(prod);
    }
}
