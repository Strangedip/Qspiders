package ArrayPrograms;
public class MissingNumInRange {
    public static void main(String[] args) {
        int[] a = { 10, 12, 11, 13, 15, 14, 16, 17, 19, 20 };
        int start = a[0]-1;
        int end = a[a.length - 1];
        int totalSum = (end * (end + 1)) / 2;
        int unwantedSum = (start * (start + 1)) / 2;
        totalSum=totalSum-unwantedSum;
        int actualSum=0;
        for (int i = 0; i < a.length; i++) {
            actualSum+=a[i];
        }
        System.out.println(totalSum-actualSum);


    }
}
