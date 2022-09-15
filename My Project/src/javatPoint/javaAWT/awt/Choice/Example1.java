package javatPoint.javaAWT.awt.Choice;

import java.awt.Choice;
import java.awt.Frame;

public class Example1 extends Frame{
	
	Example1(){
		setSize(400 , 400);
		setVisible(true);
		setLayout(null);
		
		Choice c = new Choice();
		c.setBounds(100, 150, 100 , 30);
		add(c);
		c.add("select item");
		c.add("item1");
		c.add("item2");
		c.add("item3");
		c.add("item4");
		c.add("item5");
		
		
	}
	
	public static void main(String args[]) {
		
		new Example1();
		
	}

}
