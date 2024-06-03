package gr.aueb.cf.ch12;

/**
 * it represents a two-dimension point
 */
public class Point {
    private static int noOfPoints;

    static {
        noOfPoints = 0;
    }

    private  int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        noOfPoints++;
    }
    public Point() {
        noOfPoints++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getNoOfPoints() {
        return noOfPoints;
    }

    public static void setNoOfPoints(int noOfPoints) {
        Point.noOfPoints = noOfPoints;
    }
}
