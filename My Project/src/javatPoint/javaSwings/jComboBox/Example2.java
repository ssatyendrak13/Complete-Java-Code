package javatPoint.javaSwings.jComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example2 extends JFrame{
	
	Example2(){
		String str[] = {"java" , "python" , "c++" , "javascript" , "android"};
		JComboBox cb = new JComboBox(str);
		cb.setBounds(50 , 50 , 100 , 30);
		add(cb);
		
		JButton b = new JButton("show");
		b.setBounds(250 , 50 , 100 , 30);
		add(b);
		
		
		JLabel l = new JLabel();
		l.setBounds(50 , 150 , 300 , 30);
		add(l);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String data = "selected Programming is : " + cb.getItemAt(cb.getSelectedIndex());
				l.setText(data);
				
			}
			
		});
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example2();
	}

}
