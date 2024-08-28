package gr.aueb.cf.ch8_ΧειρισμόςΛαθώνExceptionsHandling;

import java.util.Scanner;

public class HomeworkCh8 {
    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getChoice();

            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    // Μέθοδος για εμφάνιση μενού
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
        System.out.print("Please enter your choice: ");
    }

    // Μέθοδος για λήψη επιλογής από τον χρήστη
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number between 1 and 5: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    // Μέθοδος για εκτύπωση της επιλογής
    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Invalid choice. Please select a number between 1 and 5.");
        }

        if (choice != 5) {
            System.out.println("You selected option " + choice);
        }
    }
}

