public class Test {

    public static void main(String[] args) {
        int[] a = { 2, 1, -3, 4, -1, 2, 1, -5, 4 };
        sum(a);
    }

    public static void sum(int[] a) {
        int max = Integer.MIN_VALUE;
        int begin = 0, end = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            int current_sum = 0;
            for (int j = i; j < a.length; j++) {
                current_sum += a[j];
                if (max <= current_sum) {
                    max = current_sum;
                    begin = i;
                    end = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(begin);
        System.out.println(end);
    }

}
