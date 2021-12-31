package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener {

	@Override 
	public void keyTyped (KeyEvent e) {
		
	}

public void keyPressed(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveup=true;
	}
	
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveright=true;
	}
	
	
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.movedown=true;
	}
	
	
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveleft=true;
	}	
}


@Override 
public void keyReleased(KeyEvent e)
{
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveup=false;
}
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveright=false;
	}	
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.movedown=false;
	}
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveleft=false;
	}
	
	
	
}


}
