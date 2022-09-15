package javatPoint.javaSwings.jSlider;

import javax.swing.*;
import javax.swing.JSlider;

public class Example1 extends JFrame {
	
	Example1(){
		
		JSlider s = new JSlider(JSlider.HORIZONTAL , 0, 50,25);
		s.setMinorTickSpacing(0);
		s.setMajorTickSpacing(10);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		JPanel p = new JPanel();
		p.add(s);
		add(p);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		Example1 obj = new Example1();
//		obj.setVisible(true);
		obj.pack();
	}

}
