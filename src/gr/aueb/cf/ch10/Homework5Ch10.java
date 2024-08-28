package gr.aueb.cf.ch10;

public class Homework5Ch10 {
    public static void main(String[] args) {
        boolean[][] seats = new boolean[30][12];
        book(seats, 'C', 2);
        cancel(seats, 'C', 2);
    }

    public static void book(boolean[][] seats, char column, int row) {
        int colIndex = column - 'A';
        if (seats[row - 1][colIndex]) {
            System.out.println("Seat " + column + row + " is already booked.");
        } else {
            seats[row - 1][colIndex] = true;
            System.out.println("Seat " + column + row + " is now booked.");
        }
    }

    public static void cancel(boolean[][] seats, char column, int row) {
        int colIndex = column - 'A';
        if (!seats[row - 1][colIndex]) {
            System.out.println("Seat " + column + row + " is not booked.");
        } else {
            seats[row - 1][colIndex] = false;
            System.out.println("Seat " + column + row + " is now canceled.");
        }
    }
}
