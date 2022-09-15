package javatPoint.javaAWT.awtEventHandling;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventhandlingByOuterClass extends Frame{
	TextField tf;
	EventhandlingByOuterClass(){
		
		setSize(300 , 300);
		setVisible(true);
		tf=new TextField();  
		tf.setBounds(60,50,170,20);  
		Button b=new Button("click me");  
		b.setBounds(100,120,80,30);  
		setLayout(null);
		Outer o = new Outer(this);
		b.addActionListener(o);
		add(b);
		add(tf);
	}
	public static void main(String args[]) {
		new EventhandlingByOuterClass();
	}
}
class Outer implements ActionListener{
	
	EventhandlingByOuterClass obj ;
	Outer(EventhandlingByOuterClass obj){
		this.obj=obj;
	}
	public void actionPerformed(ActionEvent e) {
		obj.tf.setText("welcome sattu");
	}
	
	
}
