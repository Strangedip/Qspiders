package DataInconsistency;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P1 {
    String data = "String value"; // Data to be printed into file

    // address of the file
    String path = "C:\\Users\\sg022\\Desktop\\Git\\Qspiders\\programming\\Multithreading\\DataInconsistency\\text.txt";

    // method to write into file
    public void writeDataIntoFile() throws Exception {

        // this may produce exception if file path is incorrect
        // hence declared in the method declaration
        FileOutputStream fos = new FileOutputStream(path); // creating file connection

        PrintWriter pw = new PrintWriter(fos); // creating writing object with created connection

        // pw.write(data); // writing data into file

        //writing char by char into file
        for (char i : data.toCharArray()) {
            pw.write(i);
        }

        System.out.println("Written");

        // must push data into file at the end
        pw.flush();
    }

    // new method which changes the data value
    public void changeData(String newData){
        data=newData;
    }
}