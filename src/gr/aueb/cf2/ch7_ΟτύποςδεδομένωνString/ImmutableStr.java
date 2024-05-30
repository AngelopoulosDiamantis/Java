package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

public class ImmutableStr {
    public static void main(String[] args) {
        String s1 = "Alice";
        String s2 = "Alice";
        String s3 =  new String("Alice");

        s2 = "bob";
        s1 = "Athens";


    }
}
