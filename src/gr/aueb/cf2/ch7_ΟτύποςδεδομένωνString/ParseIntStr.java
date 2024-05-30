package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

import java.util.Scanner;

public class ParseIntStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert");
        s = in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);


    }
}
