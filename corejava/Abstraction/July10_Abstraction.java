// package Abstraction;

public class July10_Abstraction {
    // process of hiding not required body, logic or implementation is called as

    // method having body, logic or impletmentation is known as conctrete method 
    //  and class with concrete method in called as concrete class

    // method NOT having body, logic or impletmentation is known as abstract method 
    //  and class with abstarct method in called as abstract class 
    //we cannot create object of abstract class
    // A ref = new A();

    public static void main(String[] args) {
        A ref= new B();
        ref.met();
    }
}

// abstract class
// atleast one abstract method
// cam have all other members
abstract class A {
    // abstarct method
    // should not have body {}, ends with semicolon(;) 
    // prefeixed with abstract keyword, contained in abstract class
    abstract void met();
    int a =10;
}

class B extends A {
    void met() {
        System.out.println("Actual Method logic");
    }
}
