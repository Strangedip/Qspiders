// Typcasting in java 1)primitive 2)non-primitive 3)wrapper

// Primitive Typecasting 1)widening -converting from small to larger datatype ex. byte a; short b=a; 
//                       2)narrowing - converting from large to smaller datatype (requires typecast operator) ex. short a; byte b = (short) a;

// Operators 1)Unary - requires one operands ex. NOT, increment, decrement
//           2)Binar - requires two operands ex. arithmatics, relationals, AND, OR
//           3)ternary - requires three operands ex. conditionals

class apr08 {

    public static void main(String[] args) {

        // Widening - no data loss
        byte a = 10;
        short b = a;
        System.out.println(b);

        // Narrowing - may lose data as decreasing memory size
        short c = 10000;
        byte d = (byte) c;
        System.out.println(d);

    }

}
