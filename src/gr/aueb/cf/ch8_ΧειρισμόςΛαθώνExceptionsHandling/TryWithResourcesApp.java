package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner in = new Scanner(System.in)){
            System.out.println("Insert a Num");
            num = in.nextInt();

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
