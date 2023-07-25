//final class cannot be inherited
public final class Final {
    // final keyword is used to finalize the implementation of any member
    // members which can be prefixed with final keyword are variable, methods, class

    // final variable cannot be reinitialized
    final static int a = 20;

    // final method cannot be over ridden
    final static void meth() {
        System.out.println("final method, we cant overrider");
    }

    public static void main(String[] args) {

    }
}

// final class cannot be inherited by other classes

// final class C1{}
// class C2 extends C1{} //error
