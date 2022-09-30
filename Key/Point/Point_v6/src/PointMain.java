public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(7,2);
        Point p2 = new Point(4,3);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        p2.translate(2,4);

        System.out.println("p2: " + p2);
    }
}