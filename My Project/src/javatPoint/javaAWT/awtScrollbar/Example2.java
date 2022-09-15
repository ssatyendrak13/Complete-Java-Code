package javatPoint.javaAWT.awtScrollbar;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example2 extends Frame {
	
	Example2(){
		
		Label l = new Label("sattu");
		l.setAlignment(Label.CENTER);
		l.setSize(400,100);
		
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

}
