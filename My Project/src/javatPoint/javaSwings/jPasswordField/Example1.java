package javatPoint.javaSwings.jPasswordField;

import javax.swing.*;

public class Example1 {
	
	Example1(){
		
		JFrame f = new JFrame("password field example");
		
		JPasswordField pf = new JPasswordField();
		pf.setBounds(70 , 70 , 70 , 30);;
		f.add(pf);
		
		f.setSize(400 , 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example1();
	}

}
