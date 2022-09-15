package javatPoint.javaSwings.jScrollPane;
import java.awt.FlowLayout;

import javax.swing.*;
public class Example {
	
	Example(){
		
		 JFrame frame = new JFrame("scrollPane example");
		 frame.setSize(500, 500);  
		 frame.setVisible(true);  
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JTextArea ta = new JTextArea();
		 JScrollPane sp = new JScrollPane(ta);
		 sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		 sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		 frame.getContentPane().add(sp);
		
	}
	public static void main(String args[]) {
		new Example();
	}

}
