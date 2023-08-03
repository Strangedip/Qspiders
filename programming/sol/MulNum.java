package sol;

//product of all nums in range

public class MulNum {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 6; i++) {
            sum*=i;
        }
        System.out.println(sum);
    }
}
