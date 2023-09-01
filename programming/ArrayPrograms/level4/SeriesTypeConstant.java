package ArrayPrograms.level4;

public class SeriesTypeConstant {
    public static void main(String[] args) {
        int[] a = { 1, 1,1,1,1 };
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
        int size = a.length - 1;
        if (a[size] - a[size - 1] == a[size - 1] - a[size - 2]) {
            return true;
        }
        return false;
    }

    public static boolean isGeometric(int[] a) {
        int size = a.length - 1;
        if ((float) a[size] / (float) a[size - 1] == (float) a[size - 1] / (float) a[size - 2]) {
            return true;
        }
        return false;
    }

    // public static boolean isFibonacci(int[] a) {
    // int size = a.length - 1;
    // if (a[size - 1] + a[size - 2] == a[size]) {
    // return true;
    // }
    // return false;
    // }

}
