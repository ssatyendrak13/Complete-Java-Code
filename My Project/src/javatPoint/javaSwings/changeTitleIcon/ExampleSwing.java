package javatPoint.javaSwings.changeTitleIcon;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ExampleSwing {
	
	ExampleSwing(){
		
		JFrame f = new JFrame();
		
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users"
				+ "\\PC\\OneDrive\\Desktop\\icon.jpg");
		f.setIconImage(icon);  
		f.setLayout(null);   
		f.setSize(200,200);   
		f.setVisible(true);   
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new ExampleSwing();
	}

}
