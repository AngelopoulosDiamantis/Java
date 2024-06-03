package gr.aueb.cf.ch9_ΕίσοδοςΈξοδοςδεδομένων;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        File fd = new File("C:\\Users\\User\\Desktop\\test.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {

                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens) {
                    System.out.print(token +" ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
