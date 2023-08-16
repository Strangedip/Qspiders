public class StrongNum {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {

            int og = n;
            int sum = 0;
            while (og > 0) {
                int d = og % 10;
                sum += fact(d);
                og /= 10;
            }
            if (sum == n) {
                System.out.println(n);
            } 
        }
    }

    public static int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
