//dependent non static class 
public class Test {

    // independet (static) class inside another class
    static class Human{  
    static int eyeCount=12;  // static variable for Human class
    }

    static int eyeCount=3;  //static variable for Test class
    int sal = 20;

    // Test class main method
    public static void main(String[] args) {
        // Test obj=new Test();
        // Test.Human obj1= new Human();
        System.out.println(Human.eyeCount);  //static members of Human class (in Human class static area)  
        System.out.println(Test.eyeCount);   //static members of Test class (in Test class static area)
        
    }
}


