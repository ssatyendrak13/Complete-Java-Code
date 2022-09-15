package javatPoint.javaSwings.swingsBasic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example2 {
	
	Example2(){
		JFrame jf = new JFrame("final frame");
		jf.setSize(400 , 400);
		jf.setVisible(true);
		jf.setLayout(null);
		
		JButton b = new JButton("click me");
		b.setBounds(130 , 100 , 100 , 40);
		jf.add(b);
	}
	public static void main(String args[]) {
		new Example2();
	}

}
