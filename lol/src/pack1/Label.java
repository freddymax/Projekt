package pack1;

import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.Graphics2D;

public class Label extends JLabel {
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {
    super.paintComponent (g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.drawImage(Var.ib1,0,Var.backgroundY1,1920,1080,null);
        g.drawImage(Var.ib2,0,Var.backgroundY2,1920,1080,null);
        g.drawImage(Var.iplayer,Var.x,Var.y,313,207,null);

        repaint();




    }

}