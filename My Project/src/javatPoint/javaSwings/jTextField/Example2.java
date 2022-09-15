package javatPoint.javaSwings.jTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Example2 implements ActionListener{
	JTextField jf1;
	JTextField jf2;
	JTextField jf3;
	JButton b1;
	JButton b2;
	Example2(){
		
		JFrame f = new JFrame("calculator");
		
		jf1 = new JTextField();
		jf1.setBounds(90 , 50 , 150 , 30);
		f.add(jf1);
		
		jf2 = new JTextField();
		jf2.setBounds(90 , 110 , 150 , 30);
		f.add(jf2);
		
		jf3 = new JTextField();
		jf3.setBounds(90 , 230 , 150 , 30);
		jf3.setEditable(false);
		f.add(jf3);
		
		b1 = new JButton("+");
		b1.setBounds(110 , 160 , 50 , 50);
		f.add(b1);
		
		b2 = new JButton("-");
		b2.setBounds(170 , 160 , 50 , 50);
		f.add(b2);
		
		f.setSize(400 , 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String s1 = jf1.getText();
		String s2 = jf2.getText();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
		if(e.getSource()==b1) {
			c = a+b;
		}else if(e.getSource()==b2) {
			c = a-b;
		}
		String result = String.valueOf(c);
		jf3.setText(result);
	}
	
	public static void main(String args[]) {
		new Example2();
	}

}
