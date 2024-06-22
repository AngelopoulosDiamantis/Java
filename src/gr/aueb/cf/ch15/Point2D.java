package gr.aueb.cf.ch15;

public class Point2D extends Point{
   private double y;

   public Point2D() {
       // super(); αυτόματα καλεί στην Super
       // Y = 0;  αυτόματα αρχικοποιεί
   }

    public Point2D(double x, double y) {
        super(x); // δείχνει τον υπερφορτωμένο constructor της Super
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {

       this.y = y;
    }

    @Override
    public String convertToString() {
       return "(" + getX() + "," + y + ")";
       //getX() γιατί το χ δεν έχει κληρονομηθεί είναι private.
        // Έχει όμως κληρονομηθεί ο getter
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public void movePlus1() {
        super.movePlus1();
        y++;
    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }
}
