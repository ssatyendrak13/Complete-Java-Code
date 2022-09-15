package javatPoint.javaSwings.jList;

import javax.swing.DefaultListModel;
import javax.swing.*;

public class Example1 extends JFrame{
	
	Example1(){
		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("item1");
		l1.addElement("item2");
		l1.addElement("item3");
		l1.addElement("item4");
		l1.addElement("item5");
		
		JList<String> jl = new JList(l1);
		jl.setBounds(100,100,75,75);
		add(jl);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String args[]) {
		new Example1();
	}
}
