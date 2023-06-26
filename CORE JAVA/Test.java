//dependent non static class 
public class Test {

    // independet (static) class inside another class
    static class Human {
        static int eyeCount = 2; // static variable for Human class
    }

    class Human1 {
        int eyeCount = 3; // static variable for Human class
    }

    static int eyeCount = 0; // static variable for Test class
    int sal = 20;

    // Test class main method
    public static void main(String[] args) {

        System.out.println(Human.eyeCount); // static members of Human class (in Human class static area)
        System.out.println(Test.eyeCount); // static members of Test class (in Test class static area)

        Test obj = new Test(); // creating outer non static class object to use it
        Test.Human obj2 = new Human(); // creating inner static class object to use it
        Test.Human1 obj1 = obj.new Human1(); // creating inner non static class object to use it
        System.out.println(obj1.eyeCount);
    }
}
