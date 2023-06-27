

public class June12_Smallest {
    public static void main(String[] args) {
        
        System.out.println("Smallest num of 2 is : "+ max(5,10));
        System.out.println("Smallest num of 3 is : "+ max(5,10,15));
        System.out.println("Smallest num of 4 is : "+ max(5,10,15,20));
    }

    // Smallest of 2 numbers
    public static int max(int a, int b){
        if (a<=b){
            return a;
        }
        else{
            return b;
        }
    }

    // Smallest of three numbers
    public static int max(int a, int b,int c){
        if (a<=b && a<=c){
            return a;
        }
        else if(c<=a && c<=b)
        {
            return c;
        }
        else{
            return b;
        }
    }
    // Smallest of four numbers
    public static int max(int a, int b,int c,int d){
        if (a<=b && a<=c && a<=d){
            return a;
        }
        else if (b<=a && b<=c && b<=d){
            return b;
        }
        else if (c<=b && c<=a && c<=d){
            return c;
        }
        else{
            return d;
        }
    }
}
