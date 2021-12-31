package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
static JFrame jfl;
static int screenwidth= 1920,screenheight=1080;
static int backgroundY1 =0,backgroundY2= -1080;
static int x=400,y=400;
static boolean moveup=false, movedown=false,moveleft=false,moveright=false;
static Label lbl1;
static BufferedImage ib1,ib2;
static BufferedImage stift;

	public Var() {
		try {
			ib1 =ImageIO.read(new File("Bilder/Iconmaxfreddy3.png"));
			ib2 =ImageIO.read(new File("Bilder/Iconmaxfreddy3.png"));
			
			stift = ImageIO.read(new File("Bilder/Sstiftmaxfreddy.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
		
	}

}
