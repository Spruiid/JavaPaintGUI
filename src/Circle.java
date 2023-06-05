import java.awt.*;

public class Circle extends Figur{

    public Circle(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g) {
        int r = getRadius();
        g.drawOval(p1.getX()-r, p1.getY()-r, r*2,r*2);

    }

    private int getRadius() {
        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        return (int)Math.round(Math.sqrt(dx*dx+dy*dy));
    }
}
