public class apr14 {
    public static void main(String[] args) {

        // 5) Switch DMS
        int n = 2;
        switch (n) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("default");
                break;
        }

        // LOOPS
        // step 1) Initialization 2) Condtion 3) Updation

        // 1) while loop
        n = 3; // initialization
        while (n < 5) // condition
        {
            System.out.println(n); // statement
            n++; // updation
        }

        // 2) Do while loop
        do {
            System.out.println(n);
            n++;
        } while (n < 10);

        // 3) for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
}
