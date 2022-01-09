package pack1;


import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;











public class Musik{
	public static synchronized void musik (String track) {
	
	final String trackname=track;
	
	
		
			while (true) {
			try{
	
		 
		  Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(trackname));
			  
			  clip.open(inputStream);
			  
			  Scanner scanner = new Scanner(System.in);
			  String response = "";
			 
			  System.out.println("och man aeste");
			  
			  while(true) {
				  
			   System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			   System.out.print("Enter your choice: ");
			   
			   response = scanner.next();
			   response = response.toUpperCase();
			   
			   switch(response) {
			    case ("P"): clip.start();
			    break;
			    case ("S"): clip.stop();
			    break;
			    case ("R"): clip.setMicrosecondPosition(0);
			    break;
			    case ("Q"): clip.close();
			    break;
			    default: System.out.println("Not a valid response");
			    
			    System.out.println("Och mannnn");
			   }
			  }
			
	
			
    }
			catch(Exception e) {
				e.printStackTrace();
		
			
	
	  

			}
}
	}
	}
