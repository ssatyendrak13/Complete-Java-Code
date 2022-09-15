package javatPoint.javaAWT.awtWindowClosing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ByAnonymousClass {
	
	public static void main(String args[]) {
		
		new Example1();
	}
	
	

}
class Example1 extends Frame {
	
	Example1(){
		
		setSize(400 , 400);
		setLayout(null);
		setVisible(true);
		
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
	}
}
