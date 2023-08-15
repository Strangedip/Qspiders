package DeadLock;

public class P1 {
    public synchronized void demo1(P2 ref) {
        System.out.println("demo1");

        try {

            // prinitng current thread method
            System.out.println("current thread name :"+Thread.currentThread().getName());
            // sending current thread to wait stage
            wait();
        } catch (InterruptedException e) {
            System.out.println("interrupted wait");
        }
        // calling method from diffrent object under cotrol of other thread
        ref.test2();
    }

    public synchronized void test1() {
        System.out.println("test1");

        // let other threads know current thread is free after execution
        notify();
    }
}
