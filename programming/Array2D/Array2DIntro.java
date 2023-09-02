package Array2D;

/*  there are 2 ways to crete a 2D array 
    1. Using Array Litral
    datatype[][] var ={ {val1, val2, val3, ....}, {val1, val2, val3, ....} } 

    2. Using new Keyword
    datatype[][] var = new datatype[(2D size)][(1D size)];
*/
public class Array2DIntro {
    public static void main(String[] args) {
        // type 1
        int[][] a = { { 1, 2, 2, 4 }, { 1, 3, 5 }, { 4, 2, 1, 4 } };

        // type 2
        int[][] b = new int[3][4];

        print2D(a);
        print2D(b);

    }

    public static void print2D(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
