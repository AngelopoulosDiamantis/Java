package gr.aueb.cf.ch9_ΕίσοδοςΈξοδοςδεδομένων;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class HomeworkCh9 {
    public static void main(String[] args) {
        File inputFile = new File("C:/Users/User/Desktop/Java/input.txt");
        File outputFile = new File("C:/Users/User/Desktop/Java/output.txt");

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Διαχωρίζουμε τη γραμμή σε tokens
                String[] tokens = line.split(",");
                String location = tokens[0];
                String latitude = tokens[1];
                String longitude = tokens[2];

                // Γράφουμε τα δεδομένα στο ζητούμενο format
                writer.println("{ Location: '" + location + "', latitude: " + latitude + ", longitude: " + longitude + " }");
            }

            System.out.println("Data successfully processed and written to " + outputFile.getAbsolutePath());

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
