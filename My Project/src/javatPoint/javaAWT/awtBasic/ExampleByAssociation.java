package javatPoint.javaAWT.awtBasic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class ExampleByAssociation {
	
	
	ExampleByAssociation(){
		
		Frame f = new Frame("this is my first GUI");
		f.setSize(400 ,400);
		f.setVisible(true);
		f.setLayout(null);
		
		Label l = new Label("student name");
		TextField tf = new TextField();
		Button b = new Button("click me");
		
		  l.setBounds(20, 80, 80, 30);  
	      tf.setBounds(20, 115, 80, 30);  
	      b.setBounds(100, 115, 80, 30);
	      
	      f.add(l);
	      f.add(tf);
	      f.add(b);
		
	}
	public static void main(String args[]) {

		new ExampleByAssociation();
		
	}

}
