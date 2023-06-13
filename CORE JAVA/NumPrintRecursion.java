// print 1 to 10 without using loops
// using recursion

class NumPrintRecursion {
    public static void main(String[] args) {
        nums(11); // method calling statement
    }

    public static void nums(int a) {

        // recursion ends here if a <= 1
        if (a <= 1) {
            return;
        }

        // keeps calling with a-1 value till a<=1
        nums(--a); // recursive calling statement

        // will print only if recursion is ended
        System.out.println(a);
    }
}