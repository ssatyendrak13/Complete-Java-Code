package javatPoint.javaAWT.checkBox.checkboxGroup;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Example2 {
	
	Example2(){
		
		CheckboxGroup g = new CheckboxGroup();
		Frame f = new Frame("final frame");
		Checkbox cb1 = new Checkbox("java" , g , true);
		Checkbox cb2 = new Checkbox("c++" , g , false);   
		cb1.setBounds(100,100, 50,50);     
		cb2.setBounds(100,150, 50,50);    
		f.add(cb1);    
		f.add(cb2);    
		f.setSize(400,400);    
		f.setLayout(null);    
		f.setVisible(true); 
		
		Label l = new Label("");
		l.setBounds(100, 50, 200, 30);
		f.add(l);
		
		cb1.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				l.setText("java checkbox : "+(e.getStateChange()==1?
						"checked":"unchecked"));
			}
		});
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				l.setText("c++ checkbox : "+(e.getStateChange()==1
						?"checked":"unchecked"));
			}
		});
		
	}
	public static void main(String args[]) {
		new Example2();
	}

}
