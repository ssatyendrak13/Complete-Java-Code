package javatPoint.javaAWT.awtEventHandling;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
public class Example extends Frame implements ActionListener{
	TextField tf;
	Example(){
		
		tf =  new TextField();
		tf.setBounds(60,50,170,20);  
		Button b=new Button("click me");  
		b.setBounds(100,120,80,30);  
		
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		b.addActionListener(this); // passing current instance 
		
	}
	public static void main(String args[]) {

		new Example();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tf.setText("welcome");
	}

}
