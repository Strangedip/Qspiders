package ArrayPrograms.level2;

public class LeaderOfArray {
    public static void main(String[] args) {
        int[] a = { 8, 7, 4, 3, 5, 2 };
        for (int i = 0; i < a.length; i++) {
            if (isLeader(a, i)) {
                System.out.println(a[i]);
            }
        }
    }

    public static boolean isLeader(int[] a, int start) {
        if (start == a.length - 1) {
            return true;
        }
        int leader = a[start];
        for (int i = start + 1; i < a.length; i++) {
            if (a[i] > leader) {
                return false;
            }
        }
        return true;
    }
}
