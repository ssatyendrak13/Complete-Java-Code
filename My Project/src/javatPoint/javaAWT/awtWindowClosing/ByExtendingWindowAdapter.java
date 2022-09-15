package javatPoint.javaAWT.awtWindowClosing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ByExtendingWindowAdapter {

	public static void main(String args[]) {
		
		new Example2();
		
	}
}
class Example2 extends WindowAdapter{
	Frame f;
	Example2(){
		
		 f =  new Frame("this is final frame");
		f.setSize(400 , 400);
		f.setVisible(true);
		f.setLayout(null);
		
		f.addWindowListener(this);
		
	}
	public void windowClosing (WindowEvent e) {    
	    f.dispose();    
	}    
	
}
