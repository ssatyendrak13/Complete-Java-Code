package javatPoint.javaSwings.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example2 extends JFrame implements ActionListener{
	
	JRadioButton b1,b2;
	Example2(){
		
		ButtonGroup g = new ButtonGroup();
		
		b1 = new JRadioButton("A)Male");
		b1.setBounds(50 , 50 , 140 , 30);
		add(b1);
		
		b2 = new JRadioButton("A)Male");
		b2.setBounds(50 , 100 , 140 , 30);
		add(b2);
		
		g.add(b1); g.add(b2);
		
		JButton b = new JButton("click");
		b.setBounds(50 , 150 , 100 , 30);
		add(b);
		
		b.addActionListener(this);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(b1.isSelected()) {
			JOptionPane.showMessageDialog(this, "you are male");
		}else if(b2.isSelected()) {
			JOptionPane.showMessageDialog(this, "you are female");
		}
		
	}
	public static void main(String args[]) {
		new Example2();
	}
}
