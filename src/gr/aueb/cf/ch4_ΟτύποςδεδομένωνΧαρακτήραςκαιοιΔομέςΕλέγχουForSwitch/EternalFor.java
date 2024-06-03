package gr.aueb.cf.ch4_ΟτύποςδεδομένωνΧαρακτήραςκαιοιΔομέςΕλέγχουForSwitch;

/**
 * Αέναο for και break.
 */
public class EternalFor {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            System.out.print("CF forever ");
            counter++;

            if (counter % 10 == 0) {
                System.out.println();
            }

            if (counter == 100) {
                break;
            }
        }
    }
}