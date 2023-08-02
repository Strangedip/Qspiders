import java.util.Scanner;

public class IBMQues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();
        int time = in.nextInt();
        int extra = 0;
        int money = 2000;
        if (distance <= 250 && time <= 8) {
        } else if (distance > 250 && time < 8) {
            extra = (distance - 250) * 20;
        } else if (distance < 250 && time > 8) {
            extra = (time - 8) * 100;
        } else if (distance > 250 && time > 8) {
            extra = distance * 20;
        }
        if (distance == 0 ) {
            System.out.println("Invalid input");
        } else {
            System.out.println(money + extra);
        }

    }
}
