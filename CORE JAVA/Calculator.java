class Calculator {
    public static void main(String[] args) {
        System.out.println("Addition for 1,2,3,4: " + add(1, 2, 3, 4));
        System.out.println("subtraction for 1,2,3,4: " + sub(1, 2, 3, 4));
        System.out.println("multiplication for 1,2,3,4: " + mul(1, 2, 3, 4));
        System.out.println("Addition for 4,4: " + div(2, 4));
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int sub(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public static int mul(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}