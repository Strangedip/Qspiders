package Inheritance;

public class July05_ProjectIdea {
    public static void main(String[] args) {
        System.out.println("ProjectE");
    }
}

// Elite School
class ProjectE {

    public static void main(String[] args) {
        System.out.println("Main class of project");
    }
}

class Graphics {
    // Graphics of application class
}

class DBconnection {
    // database connection class #private
}

class Database extends DBconnection {
    // database manipulation class
}

// every member
class Member {
    String fname;
    String lname;
    String fullName;
    String email;
    String phone;
    String dob;
    String gender;
    int accLevel;

}

// class for students only
class Student extends Member {
    String className;
    long accType;
    String achievements;

}

// class for Faculties
class Faculty extends Member {
    long accNumber;
    String position;
    String deptName;
    String subjectName;
}

// class for accounts of members
class Account extends Member {
    Long accNumber;
}

// class for handling transactions
class Transaction extends Account {
    String transactionNumber;
}
