import javax.swing.*;
import java.awt.*;

public class FrmMain extends JFrame{
    private JPanel PanMain;
    public static void main(String[] args) {
        JFrame fm = new JFrame();
        fm.setSize(new Dimension(500,500));
        fm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fm.setVisible(true);
    }




    public FrmMain() {
        PanMain panMain = new PanMain();
        setContentPane(panMain);
    }





}
