package ArrayPrograms.level1;

import java.util.Scanner;
/*  Array is a continuous block of memory
    It is used to store homogeneous type of value Array have fixed size
    To access the elements of the array we have to go for index 
    which starts from 0 till n-1 where n is total number of elements
    if we try to cross the range of the index we will get ArraysOutOfBoundsException
    Arrays can be used to store default values
*/

/*  there are 2 ways to crete an array 
    1. Using Array Litral
    datatype[] var ={val1, val2, val3, ....}

    2. Using new keyword
    datatype[] var = new datatype[(size)];
*/

public class ArrayIntro {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = in.nextInt();
        int[] b = new int[size];

        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter index " + i + " value : ");
            b[i] = in.nextInt();
        }

        System.out.print("Array Values are : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
