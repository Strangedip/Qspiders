package patterns;

public class Diagonal {
    public static void main(String[] args) {
        weird(11);
        System.out.println();
        diagonal(5);
        System.out.println();
        reverseDiagonal(5);
    }
    public static void diagonal(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void reverseDiagonal(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-i-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void weird(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == (n + 1) / 2 && i < (n + 1) / 2) {
                    System.out.print("* ");
                } else if ((i >= (n + 1) / 2 && (j == 1 || j == n)) || i == n || i == (n + 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
