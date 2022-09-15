package javatPoint.javaSwings.JLabel;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example2 implements ActionListener {
	JFrame  jf;
	JButton b;
	JTextField tf;
	Label l ;
	Example2(){
		
		jf = new JFrame("final frame");
		
		b = new JButton("click me");
		b.setBounds(120 , 200 , 100 , 30);
		jf.add(b);
		
		l = new Label();
		l.setBounds(80 , 100 , 200 , 30);
		jf.add(l);
		
		tf = new JTextField();
		tf.setBounds(80 , 50 , 200 , 30);
		jf.add(tf);
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			String host = tf.getText();
			String ip=java.net.InetAddress.getByName(host).getHostAddress();  
	        l.setText("IP of "+host+" is: "+ip);  
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	public static void main(String args[]) {
		new Example2();
	}

}
