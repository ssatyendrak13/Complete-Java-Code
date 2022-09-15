package javatPoint.javaAWT.awt.Choice;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;
public class Example2 extends Frame implements ActionListener{
	Label l ;
	Choice c;
	Example2(){
		
		
		setSize(400 , 400);
		setVisible(true);
		setLayout(null);
		l = new Label();
		l.setBounds(100, 50, 250, 30);
		add(l);
		c = new Choice();
		c.setBounds(100, 150, 100 , 30);
		add(c);
		c.add("select");
		c.add("java");
		c.add("c++");
		c.add("pthon");
		c.add("php");
		c.add("javascript");
		
		Button b = new Button("show");
		b.setBounds(220, 150, 60, 20);
		add(b);
		
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		String data = "programming language selected : " + c.getItem(c.getSelectedIndex());
		l.setText(data);
		
	}
	public static void main(String args[]) {
		new Example2();
	}

}
