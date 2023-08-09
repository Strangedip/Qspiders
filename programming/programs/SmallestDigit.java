package programs;

public class SmallestDigit {
    public static void main(String[] args) {
        System.out.println();
        int n = -1235;
        int smallest = n % 10;
        while (n > 0) {
            if (n % 10 < smallest) {
                smallest = n % 10;
            }
            n /= 10;
        }
        System.out.println(smallest);
    }
}
