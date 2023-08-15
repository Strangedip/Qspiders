package Multithreading.DeadLock;

public class Driver extends Thread {
    P1 ob1= new P1();
    P2 ob2= new P2();

    @Override
    public void run()
    {
        ob1.demo1(ob2);
    }

    public void thread2(){
        start();
        ob2.demo2(ob1);
    }
    public static void main(String[] args) {
        Driver t2= new Driver();
        t2.thread2();
    }
}
