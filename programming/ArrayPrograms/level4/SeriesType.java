package ArrayPrograms.level4;

public class SeriesType {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 5, 8 };
        if (isArithmetic(a)) {
            System.out.println("Arithmetic Progression");
            System.out.println(a[a.length - 1] + (a[a.length - 1] - a[a.length - 2]));
        } else if (isGeometric(a)) {
            System.out.println("Geometric Progression");
            System.out.println(a[a.length - 1] * (a[a.length - 1] / a[a.length - 2]));
        } else {
            System.out.println("Fibbonacci Progression");
            System.out.println(a[a.length - 1] + a[a.length - 2]);
        }
    }

    public static boolean isArithmetic(int[] a) {
        int d = a[1] - a[0];
        for (int i = 2; i < a.length; i++) {
            if (a[i] - a[i - 1] != d) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGeometric(int[] a) {

        int d = a[1] / a[0];
        for (int i = 2; i < a.length; i++) {
            if (a[i] / a[i - 1] != d) {
                return false;
            }
        }
        return true;
    }
}
