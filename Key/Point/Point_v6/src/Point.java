import java.awt.*;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
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