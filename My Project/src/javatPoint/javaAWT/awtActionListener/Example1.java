package javatPoint.javaAWT.awtActionListener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example1 implements ActionListener{
	final TextField tf;
	Example1(){
		Frame f=new Frame("ActionListener Example");  
	     tf=new TextField();  
	    tf.setBounds(50,50, 150,20);  
	    Button b=new Button("Click Here");  
	    b.setBounds(50,100,60,30);  
	    //2nd step  
	    b.addActionListener(this);  
	    f.add(b);f.add(tf);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    f.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		f.dispose();
	    	}
	    });
	}
	public void actionPerformed(ActionEvent e) {
		tf.setText("welcome to my world");
	}
	public static void main(String[] args) {  
	    new Example1();
	}  
	

}
