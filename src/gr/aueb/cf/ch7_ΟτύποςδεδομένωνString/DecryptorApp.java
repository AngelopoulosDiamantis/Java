package gr.aueb.cf.ch7_ΟτύποςδεδομένωνString;

public class DecryptorApp {
    public static void main(String[] args) {
        String encrypted = "Bohfmpqpvmpt/E";

        String decrypted = decrypt(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String decrypt(String input) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            decrypted.append((char) (c - 1));
        }
        return decrypted.toString();
    }
}
