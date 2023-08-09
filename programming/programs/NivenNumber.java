package programs;

public class NivenNumber {
    public static void main(String[] args) {
        int n = 18;
        int og=n;

        // sum of digits of a number

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(og%sum==0?"yes":"no");
    }
}
