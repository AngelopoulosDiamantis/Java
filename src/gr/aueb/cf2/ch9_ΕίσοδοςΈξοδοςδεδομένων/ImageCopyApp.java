package gr.aueb.cf.ch9_ΕίσοδοςΈξοδοςδεδομένων;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyApp {
    public static void main(String[] args) {
        // Ορισμός διαδρομών αρχείων με πλήρη ονόματα και επεκτάσεις
        String inputFilePath = "C:\\Users\\User\\Desktop\\ke.jpg";
        String outputFilePath = "C:\\Users\\User\\Desktop\\ke-out.jpg";

        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            int b;
            int count = 0;

            // Αντιγραφή δεδομένων byte προς byte
            while ((b = fis.read()) != -1) {
                fos.write(b);
                count++;
            }
            System.out.printf("Successful Copy, το αρχείο με μέγεθος %d αντιγράφτηκε%n", count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
