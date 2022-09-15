package javatPoint.javaSwings.jOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Example1 {
	
	Example1(){
		JFrame f = new JFrame("option pane");
//		f.setVisible(true);
		JOptionPane.showMessageDialog(f, "welcome to javatpoint");
	}
	public static void main(String args[]) {
		new Example1();
	}

}
