package Multithreading;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DataInconsistency {
    String data = "String value"; // Data to be printed into file

    // address of the file
    String path = "C:\\Users\\sg022\\Desktop\\Git\\Qspiders\\programming\\Multithreading\\text.txt";

    // method to write into file
    public void writeDataIntoFile() throws Exception {

        // this may produce exception if file path is incorrect
        // hence declared in the method declaration
        FileOutputStream fos = new FileOutputStream(path); // creating file connection

        PrintWriter pw = new PrintWriter(fos); // creating writing object with created connection

        pw.write(data); // writing data into file

        System.out.println("Written");

        // must push data into file at the end
        pw.flush();
    }

    public static void main(String[] args) {
        DataInconsistency ref = new DataInconsistency();
        try {
            // calling the methid with possible exception in try block
            ref.writeDataIntoFile();
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }
}
