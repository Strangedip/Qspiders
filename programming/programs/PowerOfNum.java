public class PowerOfNum {

    public static void main(String[] args) {
        int n = 5, p = 3;
        int ans = 1;
        while (p > 0) {
            ans *= n;
            p--;
        }
        System.out.println(ans);
    }
}
