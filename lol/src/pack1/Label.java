package pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void painComponet(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g ;
		g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(Var.ib1,0,Var.backgroundY1 ,1080,1920,null);
		g.drawImage(Var.ib2,0,Var.backgroundY2 ,1080,1920,null);
		g.drawImage(Var.stift,Var.x,Var.y,100,100,null);
		
		
		repaint();
	}
}
