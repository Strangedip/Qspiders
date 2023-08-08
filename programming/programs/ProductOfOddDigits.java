package programs;

public class ProductOfOddDigits {
    public static void main(String[] args) {
        sol(8754132);
    }

    public static void sol(int n)
    {
        int prod=1;
        while(n>0)
        {
            if((n%10)%2!=0)
            {
                prod*=n%10;
            }
            n/=10;
        }
        System.out.println(prod);
    }
}
