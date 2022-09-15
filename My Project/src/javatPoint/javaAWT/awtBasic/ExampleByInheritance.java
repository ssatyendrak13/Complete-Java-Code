package javatPoint.javaAWT.awtBasic;

import java.awt.Button;
import java.awt.Frame;

public class ExampleByInheritance extends Frame {
	
	
	ExampleByInheritance(){
		
		setSize(400 , 400);
		setVisible(true);
		setTitle("this is my first GUI");
		Button b = new Button("click me");
		setLayout(null);
		b.setBounds(30 , 100 , 80 , 30);
		add(b);
		
	}
	public static void main(String args[]) {
		new ExampleByInheritance();
	}

}
