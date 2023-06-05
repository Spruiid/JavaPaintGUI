import java.awt.*;
import java.util.ArrayList;

public class Management{
    private ArrayList<Figur> figures;
    public Management() {
        figures = new ArrayList<Figur>();
    }

    public void add(Figur f) {
        figures.add(f);
    }

    public void paint(Graphics g) {
        for (Figur f: figures) {
            f.paint(g);
        }
    }
}
