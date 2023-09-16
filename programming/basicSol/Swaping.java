package basicSol;

public class Swaping {
    public static void main(String[] args) {
        swap();
    }

    static void swap() {
        int a = 3;
        int b = 4;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("using 3rd variable");
        // using 3rd variable
        int c = a;
        a = b;
        b = c;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("without using third variable");

        // Without using third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}
