package javatPoint.javaAWT.awtPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example {
	
	Example(){
		Frame f = new Frame("panel");
		 f.setSize(400,400);
		 f.setLayout(null);
		f.setVisible(true);
		Panel p  = new Panel();
		p.setBounds(50, 70, 250, 250);
		p.setBackground(Color.gray);
		f.add(p);
		
		 Button b1=new Button("Button 1");     
	     b1.setBounds(50,100,80,30);    
	     b1.setBackground(Color.yellow);  
		
		 Button b2=new Button("Button 2");   
	        b2.setBounds(100,100,80,30);    
	        b2.setBackground(Color.green);   
	        p.add(b1); p.add(b2); 
	       
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
	}
	public static void main(String args[]) {
		new Example();
	}

}
