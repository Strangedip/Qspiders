package Array2D;

// sales of n products of m days find highest sale each day

public class Q {
    public static void main(String[] args) {
        int[][] a = {
                { 100, 198, 333, 323 },
                { 122, 232, 221, 111 },
                { 223, 565, 245, 764 }
        };
        maxSalesEachDay(a);
    }

    public static void maxSalesEachDay(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }

}
