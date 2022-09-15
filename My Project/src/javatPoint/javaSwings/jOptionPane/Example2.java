package javatPoint.javaSwings.jOptionPane;
import javax.swing.*;
public class Example2 {
	
	Example2(){
		JFrame f = new JFrame();
		JOptionPane.showMessageDialog(f, "successfully created " , 
				"lert",JOptionPane.WARNING_MESSAGE);;
	}
	public static void main(String args[]) {
		new Example2();
	}

}
