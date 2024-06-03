package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileExceptionApp {
    public static void main(String[] args) throws FileNotFoundException {
        int num = 0;

        try {
            num = getNum();
            System.out.println("Num: " +num);
        } catch (FileNotFoundException | InputMismatchException e) {
//            e.printStackTrace();
            System.out.println("Error");
        }


    }
    public static int getNum() throws FileNotFoundException, InputMismatchException {
        File fd = new File("c:/tmp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)){
            num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {
//            e.printStackTrace();
            System.err.println("Error1");
            throw e;
        }
        return num;
    }
}
