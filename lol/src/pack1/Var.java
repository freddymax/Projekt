package pack1;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Var {
    static JFrame jf1;
    static int screenWidth = 1920;
    static int screenHeight = 1080;
    static int backgroundY1 = 0;
    static int backgroundY2 = -1080;
    static int x = 700, y = 700;

    static int movespeed = 5;

    static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static Label lbl1;

    static BufferedImage ib1, ib2;
    static BufferedImage iplayer;

    public Var() {
        try {
            ib1 = ImageIO.read(new File("Bilder/b1.jpg"));
            ib2 = ImageIO.read(new File("Bilder/b2.jpg"));
            iplayer = ImageIO.read(new File("Bilder/player.png"));


//background)
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden");

        }
   
    
   Musik.musik("Audio/maxinfor.wav"); 
    
    }


    
    
}