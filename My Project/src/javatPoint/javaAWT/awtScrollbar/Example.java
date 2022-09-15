package javatPoint.javaAWT.awtScrollbar;

import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Example extends Frame{
	
	Example(){
		
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		Scrollbar s = new Scrollbar();
		s.setBounds(100, 10, 30, 300);
		add(s);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	public static void main(String args[]) {
		
		new Example();
	}

}
