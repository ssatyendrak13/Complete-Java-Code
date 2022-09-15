package javatPoint.javaSwings.jLayeredPane;
import java.awt.Color;

import javax.swing.*;
public class Example extends JFrame{
	
	@SuppressWarnings("removal")
	Example(){
		
		JButton top = new JButton();
		top.setBackground(Color.white);
		top.setBounds(50,50,80,80);
		add(top);
		
		JButton middle = new JButton();
		middle.setBackground(Color.GREEN);
		middle.setBounds(70,70,80,80);
		add(middle);
		
		JButton bottom = new JButton();
		bottom.setBackground(Color.red);
		bottom.setBounds(90,90,80,80);
		add(bottom);
		
		JLayeredPane pane = getLayeredPane();
		pane.add(top , new Integer(3));
		pane.add(middle , new Integer(2));
		pane.add(bottom , new Integer(1));
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String args[]) {
		new Example();
	}

}
