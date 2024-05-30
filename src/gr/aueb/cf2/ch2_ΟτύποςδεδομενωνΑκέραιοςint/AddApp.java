package gr.aueb.cf.ch2_ΟτύποςδεδομενωνΑκέραιοςint;

public class AddApp {
    public AddApp() {
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 12;
        int result = num1 + num2;
        System.out.println("Το άθροισμα των " + num1 + " και " + num2 + " είναι " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι %d", Integer.valueOf(num1), Integer.valueOf(num2), result);
    }
}