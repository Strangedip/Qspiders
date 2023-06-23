// Global Members - Variable, Methods declared inside global area
// Static Members : Members declared in global area prefixed with static keyword
    // type of static members:   
    // Static variable 
    // Static method (Static context)
    // Static Block or Static Initializor Block (SIB)

class June15_StaticBlock{

    //static variable
    static int a;
    static double b; 

    //static method
    public static void qspider(){
        System.out.println("Qsp begins");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a='b';
        b=10.5;
        System.out.println("Qsp Ends");
    }

    //static block
    static {
        System.out.println("SIB-1");
    }

    //static method
    public static void jspider(){
        System.out.println("Jsp begins");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a='c';
        b=20.9;
        qspider();
        System.out.println("Jsp Ends");
    }

    //main method
    public static void main(String[] args) {
        System.out.println("main begins");
        double b=20.5;
        jspider();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("b: "+June15_StaticBlock.b);
        System.out.println("main ends");
    }
    static{
        qspider();
    }
}