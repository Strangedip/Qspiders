// package Multithreading;


//implement Runnable interface
public class UsingRunnableInterface implements Runnable{
    // Override run method of Runnalble Interface
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //Create object of the current RUnnable inheriting class
        UsingRunnableInterface r= new UsingRunnableInterface();
        //create Thread object with runnable refrence as an argument 
        Thread t1= new Thread(r);
        Thread t2= new Thread(r);
        Thread t3= new Thread(r);
        //call start from thread object
        t1.start();
        t2.start();
        t3.start();
    }   
}
