package javatPoint.javaSwings.jScrollBar;

import javax.swing.*;

public class Example extends JFrame{
	
	Example(){
		
		JScrollBar sb = new JScrollBar();
		sb.setBounds(375 , 0 , 10 , 365);
		add(sb);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new Example();
	}
}
