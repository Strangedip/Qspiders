package Array2D;

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of arrays ");
        int arrayCount = in.nextInt();
        int[][] a = new int[arrayCount][];

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter size of array " + (i + 1));
            int size = in.nextInt();
            a[i] = new int[size];
            System.out.println("Enter " + size + " Elements");

            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }

        print2DArray(a);

        System.out.print("Array Sum : ");
        arraySum(a);
        
        System.out.print("each array Sum : ");
        eachArraySum(a);

    }

    public static void eachArraySum(int[][] a) {
        System.out.println("2D Array is");
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void arraySum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}
