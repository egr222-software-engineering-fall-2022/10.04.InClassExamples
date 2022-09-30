import java.awt.*;

public class PointMain {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200,200);
        Graphics g = panel.getGraphics();

        // create two Point objects
        Point p1 = new Point();
        p1.x = 15;
        p1.y = 37;

        draw(p1, g);
    }

    public static void draw(Point p, Graphics g) {
        g.fillOval(p.x, p.y, 3, 3);
        g.drawString("(" + p.x + ", " + p.y + ")", p.x, p.y);
    }
}