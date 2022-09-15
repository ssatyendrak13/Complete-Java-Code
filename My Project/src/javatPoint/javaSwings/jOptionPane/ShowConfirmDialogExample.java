package javatPoint.javaSwings.jOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
public class ShowConfirmDialogExample extends WindowAdapter{
	JFrame f;
	ShowConfirmDialogExample(){
		 	f=new JFrame();   
		    f.addWindowListener(this);  
		    f.setSize(300, 300);  
		    f.setLayout(null);  
		    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		    f.setVisible(true);  
	}
	public void windowClosing(WindowEvent e) {
		int a = JOptionPane.showConfirmDialog(f, "are you sure");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation( f.EXIT_ON_CLOSE);
		}
	}
	public static void main(String args[]) {
		new ShowConfirmDialogExample();
	}

}
