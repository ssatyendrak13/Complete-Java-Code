package javatPoint.javaSwings.jTextField;
import javax.swing.*;
public class Example1 extends JFrame{
	
	Example1(){
		
		JTextField tf1 = new JTextField("welcome to java");
		tf1.setBounds(50 , 80 ,150 , 30);
		add(tf1);
		
		JTextField tf2 = new JTextField("welcome to python");
		tf2.setBounds(50 , 150 ,150 , 30);
		add(tf2);
		
		setSize(400 , 400);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		
		new Example1();
		
	}

}
