package sol;

//WAP to print sum till given range
public class Sum {
    public static void main(String[] args) {

        // time complexity O(n) space(1)
        int sum = 0;
        for (int i = 35; i < 41; i++) {
            sum += i;
        }
        System.out.println(sum);

        // time complexity O(1) space(1)
        int i = 34;
        int e = 40;
        int ans = ((e * (e + 1)) / 2) - ((i * (i + 1)) / 2);
        System.out.println(ans);
    }
}
