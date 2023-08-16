// package programs;

public class OddEvenDigits {
    public static void main(String[] args) {
        int n=41524;   
        oddprint(n);
        //EVEN digits
        // while(n>0){
        //     int ld=n%10;
        //     if(ld%2==0){
        //         System.out.println(ld);
        //     }
        //     n/=10;
        // }

    }

    //ODD digits
    public static void oddprint(int n){
        while(n>0){
            int ld=n%10;
            if(ld%2!=0){
                System.out.println(ld);
            }
            n/=10;
        }
    }
}
