import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanMain extends JPanel { // Dann kriegst ein Problem... Mit ihm

    public static final int T_CIRCLE = 1;
    public static final int T_RECTANGLE = 2;
    private int mode = T_CIRCLE;
    private Management figures;
    private Figur actFig;

    public PanMain() {
        figures = new Management();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                mousePressedPanel(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }
        });

    }

    public void mousePressedPanel(MouseEvent e) {
        actFig = new Circle(e.getX(), e.getY());
        repaint();
    }

    public void setMode(int mode) {
        if ((mode >= T_CIRCLE) && (mode <= T_RECTANGLE)) {
            this.mode = mode;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        figures.paint(g);

    }
}
