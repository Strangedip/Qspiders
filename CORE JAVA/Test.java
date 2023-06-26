
public class Test {
    static class Human{  
    static int eyeCount=12;  // eye for Human class
    }

    static int eyeCount=3;  //eye for Test class
    int sal = 20;
    public static void main(String[] args) {
        // Test obj=new Test();
        // Test.Human obj1= new Human();
        System.out.println(Human.eyeCount);  //use static members by using THEIR class name  
        System.out.println(Test.eyeCount);  
        
    }
}


