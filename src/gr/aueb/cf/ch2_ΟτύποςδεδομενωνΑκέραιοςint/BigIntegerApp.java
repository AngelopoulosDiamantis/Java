package gr.aueb.cf.ch2_ΟτύποςδεδομενωνΑκέραιοςint;

import java.math.BigInteger;

public class BigIntegerApp {
    public BigIntegerApp() {
    }

    public static void main(String[] args) {
        BigInteger myBignum1 = new BigInteger("123456789");
        BigInteger myBignum2 = new BigInteger("12345698765");
        BigInteger result = myBignum1.add(myBignum2);
        System.out.println("The result is: " + result);
        System.out.printf("The result: %d: ", result);
    }
}