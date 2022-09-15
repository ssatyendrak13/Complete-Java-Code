package javatPoint.javaAWT.awtItemListener;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Example1 extends Frame {
	Label l ;
	Checkbox b1;
	Checkbox b2;
	Example1(){
		
		setSize(400, 400);
		setVisible(true);
		setLayout(null);
		
		l = new Label();
		l.setBounds(90 , 50, 200, 30);
		add(l);
		
		b1 =  new Checkbox("java");
		b1.setBounds(80, 200, 80, 30);
		add(b1);
		
		b2 =  new Checkbox("c++");
		b2.setBounds(200, 200, 80, 30);
		add(b2);
		
		b1.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				
				l.setText("java checkbox : "+(e.getStateChange()==1
						?"checked":"unchecked"));
				
			}
			
		});
		
		b2.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				
				l.setText("c++ checkbox : "+(e.getStateChange()==1
						?"checked":"unchecked"));
				
			}
			
		});
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		
	}
	public static void main(String args[]) {
		new Example1();
	}

}
