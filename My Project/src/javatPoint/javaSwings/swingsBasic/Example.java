package javatPoint.javaSwings.swingsBasic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example extends JFrame {
	
	Example(){
		
		setSize(400 , 400);
		setVisible(true);
		setLayout(null);
		
		JButton b = new JButton("click me");
		b.setBounds(130,100,100,40);
		add(b);
		
	}
	public static void main(String args[]) {
		new Example();
	}

}
