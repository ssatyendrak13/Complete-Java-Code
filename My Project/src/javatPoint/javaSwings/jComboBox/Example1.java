package javatPoint.javaSwings.jComboBox;
import javax.swing.*;
public class Example1 extends  JFrame {
	
	Example1(){
		
		String str[] = {"india" , "USA" , "Brazil" , "Rusia"};
		JComboBox b = new JComboBox(str);
		b.setBounds(50 , 50 , 100 , 30);
		add(b);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example1();
	}

}
