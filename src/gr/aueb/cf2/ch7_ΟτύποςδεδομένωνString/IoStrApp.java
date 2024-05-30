package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

import java.util.Scanner;

public class IoStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert Two Strings");

        s1 = in.next();   //Διαβάζει μέχρι να βρει whitespaces, \t. \n
        s2 = in.nextLine(); // Διαβάζει μέχρι να βρει \n, το καταναλώνει δεν το αποδίδει

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s1: %s\n", s2);


    }
}
