package javatPoint.javaSwings.jSlider;
import javax.swing.*;
public class Example extends JFrame{

	Example(){
		
		JSlider s = new JSlider(JSlider.HORIZONTAL , 0, 50,25);
		JPanel p = new JPanel();
		p.add(s);
		add(p);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		Example obj = new Example();
//		obj.setVisible(true);
		obj.pack();
	}
}
