package gr.aueb.cf.myCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testfileApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\User\\Desktop\\test.txt");

        Scanner in = new Scanner(file);

        int a = 0;
        int b = 0;

        a = in.nextInt();
        b = in.nextInt();

        System.out.println(a +"+"+ b);
    }
}
