package Multithreading;

//inherit thread class
public class UsingThreadClass extends Thread {
    //Override run method of thread class
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()+" "+"hi");
        }
    }
    public static void main(String[] args) {
        // creat object of the same class consisting run overridden method
        UsingThreadClass t1= new UsingThreadClass();
        UsingThreadClass t2= new UsingThreadClass();
        UsingThreadClass t3= new UsingThreadClass();
        //call start method with the same class object
        t1.start();
        t2.start();
        t3.start();

    }
    
}
