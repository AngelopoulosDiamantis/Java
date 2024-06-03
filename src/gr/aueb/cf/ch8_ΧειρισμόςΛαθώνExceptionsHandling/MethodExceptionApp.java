package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;

import java.io.IOException;

public class MethodExceptionApp {
    public static void main(String[] args) {
        char ch = ' ';

        try {
            ch = readOneChar();
        } catch (IOException e) {
            System.out.println("Error. Can not Read a char");
        }
    }
    public static char readOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
