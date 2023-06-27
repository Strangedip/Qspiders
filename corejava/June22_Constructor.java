// use parameterised constructor for student class

public class June22_Constructor {
    public static void main(String[] args) {
        // creating objects from student class
        Student sandip = new Student(100, "Sandip Gupta", 75);
        Student gulshan = new Student(101, "Gulshan Gupta", 95);
        Student aarohi = new Student(102, "Aarohi Gupta", 85);

        // printing details
        sandip.det();
        gulshan.det();
        aarohi.det();
    }

}

// creted new student class
// ** another byte code file will be created for student class
class Student {
    // non static variable declared
    int id;
    String name;
    double marks;

    // Constructor for student class
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // printing details
    void det() {
        System.out.println(this.name + ", ID:" + this.id + ", Marks:" + this.marks);
    }

    public static void main(String[] args) {

    }

}
