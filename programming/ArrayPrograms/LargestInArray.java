package ArrayPrograms;

//WAP to print all odd elements in given array
public class LargestInArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 10 };
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);
        secondLargest(a);
    }

    public static void secondLargest(int[] a) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        System.out.println(secondLargest);
    }
}