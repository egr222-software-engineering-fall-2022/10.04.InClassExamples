import java.awt.*;

public class PointMain {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200,200);
        Graphics g = panel.getGraphics();

        // create two Point objects
        Point p1 = new Point();
        p1.x = 15;
        p1.y = 37;

        p1.draw(g);
    }
}