package javatPoint.javaSwings.jCheckbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example3 extends JFrame implements ActionListener{
	JCheckBox cb1 , cb2 , cb3;
	Example3(){
		
		JLabel l = new JLabel("food ordering system");
		l.setBounds(40 , 40 , 200 , 30);
		add(l);
		
		cb1 = new JCheckBox("Pizza@100");
		cb1.setBounds(80 , 100 , 100 , 30);
		add(cb1);
		
		cb2 = new JCheckBox("Burger@80");
		cb2.setBounds(80 , 150 , 100 , 30);
		add(cb2);
		
		cb3 = new JCheckBox("Tea@20");
		cb3.setBounds(80 , 200 , 100 , 30);
		add(cb3);
		
		JButton b = new JButton("order");
		b.setBounds(80 , 250 , 70 , 30);
		add(b);
		
		b.addActionListener(this);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		float amount = 0.0f;
		String msg = "";
		if(cb1.isSelected()) {
			amount +=100;
			msg += "Pizza:100\n";
		}
		if(cb2.isSelected()) {
			amount +=80;
			msg +="Burger:80\n";
		}
		if(cb3.isSelected()) {
			amount +=20;
			msg +="Tea:20\n";
		}
		msg +="----------------\n";
		JOptionPane.showMessageDialog(this, msg+" total "+amount);
	}
	
	public static void main(String args[]) {
		new Example3();
	}
	

}
