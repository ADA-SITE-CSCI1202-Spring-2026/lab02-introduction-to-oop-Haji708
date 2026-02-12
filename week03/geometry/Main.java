package week03.geometry;
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3.14, 5.0);
        Point p2 = new Point(2.0, 7.4);

        Segment s1 = new Segment(p1, p2);

        s1.setP1X(4.5);
        System.out.println(s1.getP1X());
    }
}