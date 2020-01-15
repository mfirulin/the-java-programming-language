// Exercise 1.8: Add a method to the Point class that sets the current object's 
// coordinates to those of passed in Point object.

public class Point {
    private double x, y;
    public static Point origin = new Point();
    
    public void clear() {
        x = y = 0;
    }

    public double distance(Point that) {
        double xdiff = x - that.x;
        double ydiff = y - that.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void duplicate(Point p) {
        p.x = x;
        p.y = y;
    }
    
    public static void main(String[] args) {
    }
}
