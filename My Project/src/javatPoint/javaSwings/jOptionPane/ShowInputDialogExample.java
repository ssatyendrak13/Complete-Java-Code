package javatPoint.javaSwings.jOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowInputDialogExample {
	
	ShowInputDialogExample(){
		JFrame f = new JFrame("input dialog");
		JOptionPane.showInputDialog(f , "enter name");
	}
	public static void main(String args[]) {
		new ShowInputDialogExample();
	}

}
