package gr.aueb.cf.ch5_ΑριθμοίκινητήςυποδιαστολήςFloatDoubleκαιΔομημένοςΠρογραμματισμός;

import java.util.Scanner;

public class HomeWorkCh5 {
    public HomeWorkCh5() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = false;
        int i = 0;
        int j = 0;
        int nStars = false;

        while(true) {
            while(true) {
                System.out.println("Επιλεξτε πόσα αστεράκια θέλετε να εμφανίσετε(int)");
                int nStars = in.nextInt();
                System.out.println("Ευχαριστούμε! τώρα επιλέξτε με τι μορφή θέλετε να τα εμφανίσετε.");
                printMenu();
                int choice = in.nextInt();
                if (choice >= 1 && choice <= 6) {
                    switch (choice) {
                        case 1:
                            nStarsHor(i, nStars);
                            break;
                        case 2:
                            nStarsVer(i, nStars);
                            break;
                        case 3:
                            nxnStarsVer(i, nStars, j);
                            break;
                        case 4:
                            ascStars(i, nStars, j);
                            break;
                        case 5:
                            descStars(i, nStars, j);
                            break;
                        default:
                            System.out.println("Έξοδος απο το πρόγραμμα");
                            return;
                    }
                } else {
                    System.out.println("Λάθος επιλογή. Επίλεξε 1-5 ή 6 για έξοδο.");
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Κάνε την επιλογή σου");
        System.out.println("1. Εμφάνισε 5 αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε 5 αστεράκια Κάθετα");
        System.out.println("3. Εμφάνισε 5 γραμμές με 5 αστεράκια");
        System.out.println("4. Εμφάνισε 5 γραμμές με 1-n αστεράκια");
        System.out.println("5. Εμφάνισε 5 γραμμές με n-1 αστεράκια");
        System.out.println("6. Έξοδος απο το πρόγραμμα");
    }

    public static void nStarsHor(int i, int n) {
        for(i = 0; i < n; ++i) {
            System.out.print("*");
        }

    }

    public static void nStarsVer(int i, int n) {
        for(i = 0; i < n; ++i) {
            System.out.println("*");
        }

    }

    public static void nxnStarsVer(int i, int n, int j) {
        for(j = 0; j < n; ++j) {
            nStarsHor(i, n);
            System.out.println();
        }

    }

    public static void ascStars(int i, int n, int j) {
        for(j = 0; j <= n; ++j) {
            nStarsHor(i, j);
            System.out.println();
        }

    }

    public static void descStars(int i, int n, int j) {
        for(j = n; j >= 1; --j) {
            nStarsHor(i, j);
            System.out.println();
        }

    }
}
