package javatPoint.javaSwings.jComponent;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
public class Example {
	
	public static void main(String args[]) {
		
		
		MyJComponent com = new MyJComponent(); 
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Jcomponent example");
		f.add(com);
		f.setBackground(Color.red);
		f.setSize(400,400);
		f.setResizable(false);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}

}
class MyJComponent extends JComponent{
	
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(30, 30, 100, 100);  
	}
	
}