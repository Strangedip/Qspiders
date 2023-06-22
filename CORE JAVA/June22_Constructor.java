// use parameterised constructor for student class

public class June22_Constructor {
    public static void main(String[] args) {
        //creating objects from student class
        Student sandip=new Student(100, "Sandip Gupta", 75);
        Student gulshan=new Student(101, "Gulshan Gupta", 95);
        Student aarohi=new Student(102, "Aarohi Gupta", 85);

        //printing details
        System.out.println( sandip.name + ", ID:" + sandip.id +", Marks:"+ sandip.marks);
        System.out.println( gulshan.name + ", ID:" + gulshan.id +", Marks:"+ gulshan.marks);
        System.out.println( aarohi.name + ", ID:" + aarohi.id +", Marks:"+ aarohi.marks);
    }

}
// creted new student class
// ** another byte code file will be created for student class
class Student{
    //non static variable declared
    int id;
    String name;
    double marks;

    //Constructor for student class
    Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public static void main(String[] args) {
        
    }

}
