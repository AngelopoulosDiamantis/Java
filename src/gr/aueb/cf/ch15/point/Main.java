package gr.aueb.cf.ch15.point;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(5);
        Point point2D = new Point2D(9, 4);

        doPrint(point);
        doPrint(point2D);
        System.out.println(point);

    }
    public static void doPrint(Point point) {
        System.out.println(point);

    }
}
