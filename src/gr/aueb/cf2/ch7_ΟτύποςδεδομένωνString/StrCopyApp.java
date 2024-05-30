package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

public class StrCopyApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = copyString(s1);

        System.out.println(s2);

        s2 = "Paris";

        System.out.println(s1);
        System.out.println(s2);

    }
    public static String copyString(String s) {
        return s;
    }
}
