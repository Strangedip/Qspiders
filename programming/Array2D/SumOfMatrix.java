package Array2D;

import java.util.Arrays;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] m1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] m2 = {
                { 1, 3, 5 },
                { 4, 2, 1 },
                { 1, 0, 0 }
        };

        int[][] ans=new int[m1.length][m2[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j]=m1[i][j]+m2[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
