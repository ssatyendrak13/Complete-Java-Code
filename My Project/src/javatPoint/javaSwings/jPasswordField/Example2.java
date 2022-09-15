package javatPoint.javaSwings.jPasswordField;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example2 implements ActionListener{
	JTextField tf1;
	JPasswordField pf;
	JLabel l3;
	Example2(){
		
		JFrame f = new JFrame("password field example");
		
		JLabel l1 =  new JLabel("user id : ");
		l1.setBounds(80, 70, 70 , 30 );
		f.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(160 , 70 , 100 , 30);
		f.add(tf1);
		
		JLabel l2 =  new JLabel("password : ");
		l2.setBounds(80, 130, 70 , 30 );
		f.add(l2);
		
		pf = new JPasswordField();
		pf.setBounds(160 , 130 , 100 , 30);;
		f.add(pf);
		
		JButton  b = new JButton("Login");
		b.setBounds(170 , 170 , 70 , 30);
		f.add(b);
		
		l3 = new JLabel("this is the region where this will write");
		l3.setBounds(70 , 210 , 300 , 30);
		f.add(l3);
		
		b.addActionListener(this);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(400 , 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String id = tf1.getText();
		String password = String.valueOf(pf.getPassword());
		
		l3.setText("user id : "+id+" and password : "+password);
		
	}
	public static void main(String args[]) {
		new Example2();
	}

	

}
