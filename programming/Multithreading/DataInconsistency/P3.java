package DataInconsistency;
public class P3 extends Thread {
    // creating a P1 ref which will have that single object reference address
    // using constructor
    P1 ref;

    P3(P1 ref) {
        this.ref = ref;
    }

    public void run() {
        // call change method in this thread
        ref.changeData("NEW DATA");
    }
}
