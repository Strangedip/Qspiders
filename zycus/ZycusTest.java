import java.util.HashMap;
import java.util.Map;

public class ZycusTest {
    public static void main(String[] args) {
        int[] a = {  3, 4, 5, 6, 5 };
        System.out.println(ans(a));
    }

    public static int ans(int[] a) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (h.containsKey(sum)) {
                    h.put(sum, h.get(sum) + 1);
                } else {
                    h.put(sum, 1);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> i : h.entrySet()) {
            if (i.getValue() > res) {
                res = i.getValue();
            }
        }
        return res;
    }
}
