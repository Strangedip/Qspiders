public class DataInconsistency {
    public static void main(String[] args) {
        // one common object with methods
        P1 ref = new P1();

        // creating 2 thread with the same object reference
        P2 t1 = new P2(ref);
        P3 t2 = new P3(ref);

        // starting thread 1
        t1.start();
        // starting thread 2
        t2.start();

        // This will cause both threads to create data inconsistency in the txt file
        // To avoid this we must use synchronization concept
        // which allow access of object one by one
        // to use synchroniaztion just put synchronized keyword in method definition

    }
}
