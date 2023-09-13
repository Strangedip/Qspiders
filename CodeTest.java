import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(769082435);
        a.add(210437958);
        a.add(673982045);
        a.add(375809214);
        a.add(380564127);
        sol(a);
    }

    public static void sol(List<Integer> arr) {
        long minSum = Integer.MAX_VALUE;
        long maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    continue;
                }
                sum += arr.get(i);
            }
            if (sum >= maxSum) {
                maxSum = sum;
            }
            if (sum <= minSum) {
                minSum = sum;
            }
        }
        System.out.println(minSum + " " + maxSum);
    }
}
