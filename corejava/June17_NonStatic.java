// non-static members : Global members not prefixed with static keyword
    // types of non static members
    // non static varibale
    // non static method
    // Instance Initializer Block (IIB)
    // Constructor

public class June17_NonStatic {
    int a=20;
    public static void main(String[] args) {
        // we cannot use non static members inside static context
        // System.out.println(a);

        // To use non static context we must create an object of the same class
        June17_NonStatic obj = new June17_NonStatic();
        System.out.println(obj.a);

        // Object: 
        // every object can store diffrent values in non static members
        // every object is connected to same class static area 
            //hence we can only store single static member at once value
            // type (static var) - will be same for every object (last updated value) 
            // type no (non static) - can be changed for every object 
    }
}
