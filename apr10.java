public class apr10 {
    public static void main(String[] args){

// UNARY OPERATORS   
        // Increment (++), Decrement (--)
        
        // Post Incremet/Decrement (v++,v--)
        // first use current value then update
        int x=4;
        int y=x++;  // 4 is used and updated x=5
        System.out.println(x+y); // 4+5

        // Pre Incremet/Decrement (++v,--v)
        // update first and use updated value
        int c=4;
        int d=++c;  // updated c=3 and used 3 
        System.out.println(c+d); // 4+3

        // NOT uperators
        boolean e=true;
        System.out.println(!e);


// BIRNARY OPERATORS
        // Arithmatic operators +,-,*,/,%
        int a=10;
        int b=20;
        System.out.println(a+b);    //addition
        System.out.println(a+"b");  //Concatenation
        System.out.println(a-b);    //subtraction
        System.out.println(a*b);    //multiplication
        System.out.println(a/b);    //divide
        System.out.println(a%b);    //modulus

        // Relational operator  (conditions, comparisons)
        // Equal (==) , less (<), not equal (!=), greater (>) 
        // greater than equal (>=), lesser than or equal (<=)
    }
}
