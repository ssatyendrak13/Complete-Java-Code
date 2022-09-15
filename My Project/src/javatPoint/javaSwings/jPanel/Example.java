package javatPoint.javaSwings.jPanel;
import java.awt.Color;

import javax.swing.*;
public class Example extends JFrame{

	Example(){
		JFrame f = new JFrame("example of panel");
		
		JPanel p = new JPanel();
		p.setBounds(40,80,200,200);
		p.setBackground(Color.gray);
		f.add(p);
		
		
		 	JButton b1=new JButton("Button 1");     
//	        b1.setBounds(50,100,80,30);    
	        b1.setBackground(Color.yellow);   
	        JButton b2=new JButton("Button 2");   
//	        b2.setBounds(100,100,80,30);    
	        b2.setBackground(Color.green);   
	        p.add(b1); p.add(b2);  
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example();
	}
}
