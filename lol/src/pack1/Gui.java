package pack1;

import javax.swing.JFrame;


public class Gui {

	public Gui() {
		
	Var.jfl = new JFrame();	
	Var.jfl.setSize(Var.screenwidth,Var.screenheight);
	Var.jfl.setLocationRelativeTo(null);
	Var.jfl.setLayout(null);
	Var.jfl.setTitle("Space Adventure");
	Var.jfl.setResizable(false);
	Var.jfl.requestFocus();
	Var.jfl.setVisible(true);
	
	Var.lbl1= new Label();
	Var.lbl1.setBounds(0,0,Var.screenwidth,Var.screenheight);
	Var.lbl1.setVisible(true);
	
	Var.lbl1.add(Var.jfl);
	
	}

}
