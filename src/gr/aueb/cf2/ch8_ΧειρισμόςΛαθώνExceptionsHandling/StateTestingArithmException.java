package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StateTestingArithmException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert two ints");
                numerator = in.nextInt();
                if (numerator == 0) break;
                denominator = in.nextInt();

                result = numerator / denominator;

                System.out.printf("%d / %d = %d", numerator, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("Denominator can not be ZERO");

            } catch (InputMismatchException e) {
                in.nextLine(); //recover - ο Scanner δεν καταναλώνεται..θα κάνει συνεχώς loop
                System.out.println("Please insert an integer");
            }
        }
        System.out.println("Thanks");
    }
}
