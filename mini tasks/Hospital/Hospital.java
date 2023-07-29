import java.util.ArrayList;
import java.util.Scanner;
class Appointment {
    String date;
    String docName;
    public Appointment(String date, String docName) {
        this.date = date;
        this.docName = docName;
    }
    @Override
    public String toString() {
        return "date : " + date + " | " + "Doctor Name : " + docName;
    }
}
class Patient {
    ArrayList<Appointment> appointments = new ArrayList<>();
    String patientID;
    String fname;
    String sname;
    String age;
    String gender;
    public Patient(String fname, String sname, String age, String gender) {
        this.patientID = "" + ((Hospital.patientList.size())+1);
        this.fname = fname;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }
    void patientDetails() {
        System.out.println("PatientID: " + patientID);
        System.out.println("Name     : " + fname + " " + sname);
        System.out.println("Age      : " + age);
        System.out.println("Gender   : " + gender);
        System.out.println();
    }
    void patientAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
            System.out.println();
        }
    }
}
class Action {
    public static void addPatient() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String fname = in.next();
        System.out.print("Enter Last Name : ");
        String sname = in.next();
        System.out.print("Enter Gender : ");
        String gender = in.next();
        System.out.print("Enter Age : ");
        String age = in.next();
        Patient p = new Patient(fname, sname, age, gender);
        Hospital.patientList.add(p);
        System.out.println("Patient Added successfully!");
        System.out.println();
        Home.menu();
    }

    public static void addAppointment() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Patient ID : ");
        String patientID = in.next();
        Patient p = getPatient(patientID);
        if (p == null) {
            System.out.println("no such patient exist");
            System.out.println();
            Home.menu();
        } else {
            System.out.print("Enter Appointment Date (dd/mm/yy): ");
            String date = in.next();
            System.out.print("Enter Doctor Name : ");
            String docName = in.next();
            p.appointments.add(new Appointment(date, docName));
            System.out.println("Appointment added");
            System.out.println();
            Home.menu();
        }
    }

    static void getPatientDetails() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Patient ID : ");
        String patientID = in.next();
        Patient p = getPatient(patientID);
        if (p == null) {
            System.out.println("No such patient Exist");
            System.out.println();
            Home.menu();
        } else {
            p.patientDetails();
            Home.menu();
        }
    }
    static Patient getPatient(String id) {
        for (Patient p : Hospital.patientList) {
            if (p.patientID.equals(id)) {
                return p;
            }
        }
        return null;
    }
    static void patientList() {
        if (Hospital.patientList.isEmpty()) {
            System.out.println("No patients added");
            System.out.println();
            Home.menu();
        } else {
            for (Patient p : Hospital.patientList) {
                p.patientDetails();
                
            }
            Home.menu();
        }
    }
    static void getAppointment() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Patient ID : ");
        String patientID = in.next();
        Patient p = getPatient(patientID);
        if (p == null) {
            System.out.println("No such patient Exist");
            System.out.println();
            Home.menu();
        } else {
            System.out.println(p.appointments);
            // p.patientAppointments();
            System.out.println();
            Home.menu();
        }
    }
}
class Home {
    public static void menu() {
        System.out.println("1.add Patient");
        System.out.println("2.get Patient Details");
        System.out.println("3.add appointment");
        System.out.println("4.get appointments Details");
        System.out.println("5.see all Patient");
        System.out.println("6.exit");
        homeInput();
    }
    public static void homeInput() {
        System.out.println();
        System.out.print("Enter you choice : ");
        Scanner in = new Scanner(System.in);
        switch (in.nextLine()) {
            case "1":
                Action.addPatient();
                break;
            case "2":
                Action.getPatientDetails();
                break;
            case "3":
                Action.addAppointment();
                break;
            case "4":
                Action.getAppointment();
                break;
            case "5":
                Action.patientList();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                Home.menu();
        }
    }
}
public class Hospital {
    public static ArrayList<Patient> patientList = new ArrayList<>();
    public static void main(String[] args) {
        Home.menu();
    }
}