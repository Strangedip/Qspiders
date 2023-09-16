package basicSol;

//WAP find sum of odd number from 1 to 10
public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
