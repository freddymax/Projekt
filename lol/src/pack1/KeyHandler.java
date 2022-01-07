package pack1;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
         if(e.getKeyCode()==KeyEvent.VK_UP) {
             Var.moveup = true;
         }
         if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
             Var.moveright = true;
         }
         if(e.getKeyCode()==KeyEvent.VK_LEFT) {
             Var.moveleft = true;
         }
         if(e.getKeyCode()==KeyEvent.VK_DOWN) {
             Var.movedown = true;
         }


    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP) {
             Var.moveup = false;
         }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
             Var.moveright = false;
         }
         if(e.getKeyCode()==KeyEvent.VK_LEFT) {
             Var.moveleft = false;
         }
         if(e.getKeyCode()==KeyEvent.VK_DOWN) {
             Var.movedown = false;
         }


    }

}
