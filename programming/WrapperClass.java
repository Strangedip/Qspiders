public class WrapperClass {
    // wrapper class
    // convert non primitive datatype to primitive datatype
    // each primitive have their own nonprimitive wrapper class
    // int - Integer, char-Character, byte-Byte, short-Short,....
    public static void main(String[] args) {
        
        // before jdk 1.5
        int a = 10;
        int b = 20;
        // boxing int into Integer wrapper class
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);

        // Unboxing Integer to respective int value
        int c = i1.intValue();
        int d = i2.intValue();

        // after jdk 1.5
        // auto boxing
        Integer i3 = 10;
        Integer i4 = 20;

        // auto unboxing
        int f = i3;
        int g = i4;

        System.out.println("Boxing " + a + " " + b + " " + i1 + " " + i2 + " UnBoxing " + c + " " + d);
        System.out.println("Auto Boxing " + i3 + " " + i4 + " Auto UnBoxing " + f + " " + g);
    }

}
