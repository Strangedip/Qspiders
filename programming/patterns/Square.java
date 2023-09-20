package patterns;

public class Square {
    public static void main(String[] args) {
        filledSquare(5);
        borderSquare(5);
        plus(5);
    }

    public static void filledSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void borderSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1 || j == 1 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void plus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (1 + n) / 2 || j == (1 + n) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
