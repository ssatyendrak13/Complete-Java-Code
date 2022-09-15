package javatPoint.javaAWT.awtCheckBox;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxExample2  {
	
	CheckboxExample2(){
		
		Frame f = new Frame();
		f.setSize(400 , 400);
		f.setVisible(true);
		f.setLayout(null);
		
		
//		Label l = new Label("check any box");
		TextField tf = new TextField();
		tf.setBounds(110, 80, 200, 30);
		f.add(tf);
		
		Checkbox cb1 = new Checkbox("java checkbox");
		cb1.setBounds(100, 200, 100, 30);
		f.add(cb1);
		Checkbox cb2 = new Checkbox("c++ checkbox");
		cb2.setBounds(250, 200, 100, 30);
		f.add(cb2);
		
		cb1.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				tf.setText("java checkbox : "+ (e.getStateChange()==1?
						"checked":"unchecked"));
			}
			
		});
		cb2.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				tf.setText("c++ checkbox : "+(e.getStateChange()==1?"checked":"unchecked"));
			}
			
		});
	}
	
	public static void main(String args[]) {
		new CheckboxExample2();
	}
	

}
