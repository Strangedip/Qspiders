public class CountDigit {
    public static void main(String[] args) {
        int n = 1235;
        int ans = (int) Math.log10(n) + 1;
        System.out.println(ans);
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;    
        }
        return count;
    }
}
