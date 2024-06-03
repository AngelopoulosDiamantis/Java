package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

public class StrEqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "ATHENS";

        boolean equal1 = s1.equals(s2);
        boolean equal2 = s1.equalsIgnoreCase(s3);



    }
}
