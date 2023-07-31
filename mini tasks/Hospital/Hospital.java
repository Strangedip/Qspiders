import java.util.ArrayList;
import java.util.Scanner;

class Appointment {
    String date;
    String docName;
    String patientID;

    public Appointment(String patientID, String date, String docName) {
        this.patientID = patientID;
        this.date = date;
        this.docName = docName;
    }

    @Override
    public String toString() {
        return "ID: " + patientID + " | date : " + date + " | " + "Doctor Name : " + docName;
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
        this.patientID = "E" + ((Hospital.patientList.size()) + 1);
        this.fname = fname;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        System.out.println("");
        System.out.println("Patient with id " + patientID + " Added successfully!");
        Hospital.patientList.add(this);
        System.out.println();
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
        new Patient(fname, sname, age, gender);
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
            in.nextLine();
            String docName = in.nextLine();
            p.appointments.add(new Appointment(patientID, date, docName));
            Hospital.AppointmentLog.add(new Appointment(patientID, date, docName));
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

    static void getLast3Appointment() {
        if (Hospital.AppointmentLog.isEmpty()) {
            System.out.println("no entries yet");
            System.out.println();
            Home.menu();
        } else {
            int count = 0;
            for (int i = Hospital.AppointmentLog.size() - 1; i >= 0; i--) {
                if (count > 2) {
                    break;
                }
                System.out.println(Hospital.AppointmentLog.get(i));
                System.out.println();
                count++;
            }
        }
        Home.menu();
    }
}

class Home {
    public static void menu() {
        System.out.println("1.Add Patient      2.Get Patient Details  3.Add Appointment");
        System.out.println("4.My appointments  5.Patient List         6.last 3 appointments");

        homeInput();
    }

    public static void homeInput() {
        System.out.println();
        System.out.print("Enter you choice (0.exit) : ");
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
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
                Action.getLast3Appointment();
                break;
            case "0":
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
    public static ArrayList<Appointment> AppointmentLog = new ArrayList<>();

    public static void main(String[] args) {
        Home.menu();
    }
}