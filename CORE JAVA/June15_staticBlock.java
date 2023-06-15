class June15_staticBlock{
    
    // type of static members static var,static method,
    // Static Block or Static Initializor Block (SIB)

    static int a;
    static double b; 

    public static void qspider(){
        System.out.println("Qsp begins");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a='b';
        b=10.5;
        System.out.println("Qsp Ends");
    }

    
    static {
        System.out.println("SIB-1");
    }

    public static void jspider(){
        System.out.println("Jsp begins");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a='c';
        b=20.9;
        qspider();
        System.out.println("Jsp Ends");
    }
    public static void main(String[] args) {
        System.out.println("main begins");
        double b=20.5;
        jspider();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("b: "+June15_staticBlock.b);
        System.out.println("main ends");
    }
    static{
        qspider();
    }
}