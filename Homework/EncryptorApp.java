package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

public class EncryptorApp {
    public static void main(String[] args) {
        String original = "Angelopoulos.D";

        String encrypted = encrypt(original);

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
    }
    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}