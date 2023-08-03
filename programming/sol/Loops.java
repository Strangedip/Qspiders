package sol;
// WAP to print all even nums till 50
public class Loops {
    public static void main(String[] args) {
        

        int k=1;
        do {
            if(k%2==0)
            {System.out.println(k);}
            k++;
        } while (k<=50);
    }
}
