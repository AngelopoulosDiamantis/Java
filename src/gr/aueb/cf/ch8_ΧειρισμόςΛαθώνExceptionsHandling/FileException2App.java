package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileException2App {
    public static void main(String[] args) {
        int num = 0;

        try {
            num = getNum();
        }catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }catch (InputMismatchException e) {
            System.out.println("Error Reading");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }

    }
    public static int getNum() throws FileNotFoundException, InputMismatchException, ArithmeticException {
        File fd = new File("C:/tmp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)) {

            if (in.hasNextInt()) {
                throw new InputMismatchException();
            }

            num = in.nextInt();

            if (num < 0) {
                throw new ArithmeticException("NegativeNum");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
        return num;
    }
}
