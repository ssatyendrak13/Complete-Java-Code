package javatPoint.javaSwings.JRadioButton;
import javax.swing.*;
public class Example1 extends JFrame{
	
	Example1(){
		
		
		JRadioButton b1 = new JRadioButton("A)Male");
		b1.setBounds(50 , 50 , 140 , 30);
		add(b1);
		
		JRadioButton b2 = new JRadioButton("A)Male");
		b2.setBounds(50 , 100 , 140 , 30);
		add(b2);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		new Example1();
	}

}
