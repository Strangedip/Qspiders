package Multithreading.DeadLock;

public class P2 {
    public synchronized void demo2(P1 ref) {
        System.out.println("demo2");

        //calling method from diffrent object under cotrol of other thread
        ref.test1();
    }

    public synchronized void test2() {
        System.out.println("test2");
    }
}
