package gr.aueb.cf.ch12;

import java.sql.SQLOutput;

/**
 * Driver class
 */
public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);

        Point p2 = new Point(11, 0);

        System.out.println("Point 1 State");
        System.out.println("X:" + p1.getX());
        System.out.println("Y:" + p1.getY());

        System.out.println("Point 2 State");
        System.out.println("X:" + p2.getX());
        System.out.println("Y:" + p2.getY());

        System.out.println("Total Count of Creating Points " + Point.getNoOfPoints());


    }
}
