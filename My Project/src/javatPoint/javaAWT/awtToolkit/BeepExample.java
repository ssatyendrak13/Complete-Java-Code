package javatPoint.javaAWT.awtToolkit;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BeepExample {
	
	BeepExample(){
		
		Frame f = new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
		Button b = new Button("beep");
		b.setBounds(50,100,60,30);  
		f.add(b);     
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
			}
			
		});
		
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}

	public static void main(String args[]) {
		
		new BeepExample();
	}
}
