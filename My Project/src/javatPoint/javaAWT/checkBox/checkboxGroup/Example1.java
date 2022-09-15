package javatPoint.javaAWT.checkBox.checkboxGroup;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class Example1 {
	
	Example1(){
		
		CheckboxGroup g = new CheckboxGroup();
		Frame f = new Frame("final frame");
		Checkbox cb1 = new Checkbox("java" , g , false);
		Checkbox cb2 = new Checkbox("c++" , g , false);   
		cb1.setBounds(100,100, 50,50);     
		cb2.setBounds(100,150, 50,50);    
		f.add(cb1);    
		f.add(cb2);    
		f.setSize(400,400);    
		f.setLayout(null);    
		f.setVisible(true); 
		
	}
	public static void main(String args[]) {
		new Example1();
	}
}
