package javatPoint.javaSwings.jCheckbox;

import javax.swing.JCheckBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Example2 {
	JTextField t;
	JCheckBox cb1,cb2;
	Example2(){
		
		JFrame f = new JFrame("checkbox");
		
		JLabel l = new JLabel("select any one option : ");
		l.setBounds(50 , 50 , 200 , 30);
		f.add(l);
		
		cb2 = new JCheckBox("c++");
		cb2.setBounds(80 , 120 , 70 , 30);
		f.add(cb2);
		
		cb1 = new JCheckBox("java");
		cb1.setBounds(80 , 80 , 70 , 30);
		f.add(cb1);
		
		JLabel l1 = new JLabel("status : ");
		l1.setBounds(50 , 170 , 50 , 30);
		f.add(l1);
		
		t = new JTextField();
		t.setBounds(110 , 170 , 180 , 30);
		f.add(t);
		t.setEditable(false);
		
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				t.setText("java checkbox : "+(e.getStateChange()==1
						?"checked":"unchecked"));
			}
		});
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				t.setText("c++ checkbox : "+(e.getStateChange()==1
						?"checked":"unchecked"));
			}
		});
		
		f.setSize(400 , 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		new Example2();
	}

}

