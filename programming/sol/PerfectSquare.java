package sol;

public class PerfectSquare {
    public static void main(String[] args) {
        int n=64;
        if (perfectSquare(n)) {
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a perfect Sqaure");
        }
    }
    static boolean perfectSquare(int n){
        for (int i = 1; i*i <= n; i++) {
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
}
