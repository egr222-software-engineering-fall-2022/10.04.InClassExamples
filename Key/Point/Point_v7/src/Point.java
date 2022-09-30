import java.awt.*;

public class Point {
    private int x;
    private int y;

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString(toString(), x, y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}