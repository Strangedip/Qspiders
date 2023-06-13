// Write sum method without using loop
// use recursion

public class June13_SumRecursion {

    public static int recurse(int a) {
        // return 1 if a <= 1;
        if (a <= 1) {
            return 1;
        }
        // sum to store all values of a from 10 to 1 -> a+ a-1 + a-2 + a-3 +...+ a-(a-1)
        // as soon as a<=1, 1 is returned and added into expression created recursively
        int sum = a + recurse(a - 1);
        return sum;
    }

    public static void main(String[] args) {

        // sum of first 5 nums
        System.out.println(recurse(5));

    }
}
