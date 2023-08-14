public class P2 extends Thread {
    // creating a P1 ref which will have that single object reference address
    // using constructor
    P1 ref;

    P2(P1 ref) {
        this.ref = ref;
    }

    public void run() {
        // call write method in this thread
        try {
            ref.writeDataIntoFile();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }

}
