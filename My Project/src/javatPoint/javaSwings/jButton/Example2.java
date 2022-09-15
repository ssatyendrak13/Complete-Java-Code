package javatPoint.javaSwings.jButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class Example2 {
		JButton b ;
		JTextField tf;
		Example2(){
		 	JFrame f=new JFrame("Button Example");  
		    b=new JButton("Click Here");  
		    b.setBounds(50,100,95,30);  
		    f.add(b);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true); 
		    
		    tf = new JTextField("hello");
		    tf.setBounds(50 , 50 , 200 , 30);
		    f.add(tf);
		    
		    b.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e ) {
		    		tf.setText("welcome to my world");
		    	}
		    });
		}
		public static void main(String args[]) {
			new Example2();
		}
	

}
