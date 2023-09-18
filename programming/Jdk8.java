// normal interface
interface I{
    // can have variables inside interface auto prefixed with 'final static'
    final static int var=10;

    //can create concrete method inside interface prefixed with 'default'
    default void method1(){}

    //abstract method
    void method2();
    //abstract method
    void method3();
}

// marker interface // no methods at all // used for jvm indications
interface I2{}

//Functional interface  // only one abstract method
@FunctionalInterface
interface I3{
    void add();
}

public class Jdk8 extends Test{
    int hi=20;
    public static void main(String[] args) {
        System.out.println("hello");
    }

}