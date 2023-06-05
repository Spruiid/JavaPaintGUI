import java.awt.*;

public abstract class Figur {
    protected Point p1, p2;

    public Figur(int x, int y) {
        p1 = new Point(x,y);
        p2 = new Point(x,y);
    }

    public void setP2(int x, int y) {
        p2.set(x,y);
    }

    public void move(int dx, int dy) {

    }

    public abstract void paint(Graphics g);
}
