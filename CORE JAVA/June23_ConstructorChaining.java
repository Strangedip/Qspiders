public class June23_ConstructorChaining {
    public static void main(String[] args) {
        Test ref = new Test(1, 2, 3); // calling 3fa constructor in Test class
        ref.a=10;

    }
}

// constructor chaining
class Test {
    int a;
    int b;
    int c;

    Test() {
        System.out.println("no FA");
    }

    Test(int a) {
        this(); // constructer calling statements
        this.a = a;
        System.out.println("1FA");
    }

    Test(int a, int b) {
        // this.a=a;
        this(a); // calling 1 fa constructor in same object
        System.out.println("2FA");
    }

    Test(int a, int b, int c) {
        this(a, b); // calling 2 fa constructor in same object
        this.c = c;
        System.out.println("3FA");
    }

    public static void main(String[] args) {

    }
}
