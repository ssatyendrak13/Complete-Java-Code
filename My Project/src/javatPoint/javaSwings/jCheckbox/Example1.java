package javatPoint.javaSwings.jCheckbox;

import javax.swing.*;

public class Example1 {
	
	Example1(){
		
		JFrame f = new JFrame("checkbox");
		
		JCheckBox cb1 = new JCheckBox("java");
		cb1.setBounds(80 , 80 , 70 , 30);
		f.add(cb1);
		

		JCheckBox cb2 = new JCheckBox("c++");
		cb2.setBounds(80 , 100 , 70 , 30);
		f.add(cb2);
		
		f.setSize(400 , 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		new Example1();
	}

}
