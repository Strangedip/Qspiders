// print 1 to 10 without using loops
// using recursion

class NumPrint{
    public static void main(String[] args) {
        nums(10); // method calling statement
    }

    public static void nums(int a){
        if (a==1){
            return;
        }

        //recursive calling method
        nums(--a); 

        //will run only if recursion is ended
        System.out.println(a); 
    } 
}