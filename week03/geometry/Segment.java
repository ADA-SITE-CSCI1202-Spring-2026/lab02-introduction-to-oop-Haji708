package week03.geometry;
public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double getP1X() {
        return p1.getX();
    }

    public void setP1X(double x) {
        p1.setX(x);
    }
    public double getP1Y() {
        return p1.getY();
    }

    public void setP1Y(double y) {
        p1.setY(y);
    }
}
