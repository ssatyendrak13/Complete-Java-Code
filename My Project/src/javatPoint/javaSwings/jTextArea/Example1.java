package javatPoint.javaSwings.jTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Example1 implements ActionListener {
	JTextArea ta;
	JLabel l;
	Example1(){
		
		JFrame f = new JFrame("text area");
		
		l =  new JLabel();
		l.setBounds(40 , 40 , 200 , 30);
		f.add(l);
		
		ta = new JTextArea();
		ta.setBounds(30 , 90 , 300 , 200);
		f.add(ta);
		
		JButton b = new JButton("count");
		b.setBounds(140 , 295 , 80 , 30);
		f.add(b);
		
		b.addActionListener(this);
		
		f.setSize(400 , 400);;
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String s = ta.getText();
		String sarr[] = s.split("\\s");
		
		l.setText("word : "+sarr.length+" character : "+s.length());
		
	}
	
	public static void main(String args[]) {
		new Example1();
	}


}
