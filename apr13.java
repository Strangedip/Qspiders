public class apr13 {
    public static void main(String[] args) {
        // Decision Making Statement
        // 1) simple if
        int a = 12;
        if (a % 2 == 0) {
            System.out.println("even");
        }

        // 2) if else
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 3) ladder if else if
        if (a == 1) {
            System.out.println("one");
        } else if (a == 2) {
            System.out.println("two");
        } else if (a == 3) {
            System.out.println("three");
        } else {
            System.out.println("unknown");
        }

        // 4) Nested Decision making statements
        if (a % 2 == 0) {
            if (a == 2) {
                System.out.println("even two");
            } else {
                System.out.println("even");
            }
        } else {
            System.out.println("odd");
        }
    }
}
