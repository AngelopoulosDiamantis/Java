package gr.aueb.cf.ch9_ΕίσοδοςΈξοδοςδεδομένων;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/tmp/fileout.txt");
            printMessage(ps, "Hello Coding Factory");
            printMessage(System.out, "Hello CF!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
