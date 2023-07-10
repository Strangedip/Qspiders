// package polymorphism;

class July06_Polymorphism{
    // Members having same name but diffrent behaviour is called as polymorphism
    // types of polymorphism
    // 1) Compile Time Polymorphism / Compile Time Binding / Static Bindin
    //      *checks for members availability(referencev variable class type) at compile time
    //      *depends on reference variable class not on object
    //      e.g. method overloading, contructor overloading,
    //           static/non-static variable shadowing, static method shadowing

    // 2) Runt Time Polymorphism
    //      *checks for members alvailablity at runtime 
    //      *depends on Object at runtime
    //      e.g method Overriding
    
    public static void main(String[] args) {        
        A ref1 = new A(); // class and object of A
        B ref2 = new B(); //class and object of B
        A ref3 = new B(); // Upcasting
        
        System.out.println("a :"+ref1.a+" b:"+ref1.b);
        ref1.print();  //super
        ref1.met();    //super

        System.out.println("a :"+ref2.a+" b:"+ref2.b); //static/nonstatic variable shadowing
        ref2.print();   //sub (method shadowing)(shadowing superclass method)
        ref2.met();     //sub (method overriding)

        System.out.println("a :"+ref3.a+" b:"+ref3.b); //static/nonstatic variable shadowing
        ref3.print();   //super (method shadowing)(shadowing subclass method)
        ref3.met();     //sub (method overriding)
    }

}

class A{
    // Compile time Binding
    int a=10;
    static int b=20;
    
    static void print(){
        System.out.println("static super");
    }

    void met(){
        System.out.println("non-static Super");
    }

}
class B extends A{
    // Compile time Binding
    int a=20;
    static int b=30;
    static void print(){
        System.out.println("static Sub");
    }
    // Overriding previous nonstatic met method
    void met(){
        System.out.println("non-static Sub");
    }
}