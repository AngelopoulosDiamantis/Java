package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");

        try (Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = in.nextInt();

        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
//            System.out.println("FileNotFound");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("IOException");
            throw e;
        }
    }
}
