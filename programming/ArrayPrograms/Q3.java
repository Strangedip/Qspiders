package ArrayPrograms;

//wap to find number (either cubes or square) count in 1 - n
public class Q3 {
    public static void main(String[] args) {
        sol(10);
        sol(25);
        sol(1);
        System.out.println();
        sol2(10);
        sol2(25);
        sol2(1);
    }

    static void sol2(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            int cube = i * i * i;
            if (square == cube) {
                count++;
                continue;
            }
            if (square <= n) {
                count++;
            }
            if (cube <= n) {
                count++;
            }

        }
        System.out.println(count);
    }

    static void sol(int n) {
        boolean[] likes = new boolean[n + 1];
        for (int i = 1; i < likes.length; i++) {
            if (i * i <= n) {
                likes[i * i] = true;
            }
            if (i * i * i <= n) {
                likes[i * i * i] = true;
            }
        }
        int likedNumber = 0;
        for (int i = 1; i < likes.length; i++) {
            if (likes[i]) {
                likedNumber++;
            }
        }
        System.out.println(likedNumber);
    }
}
