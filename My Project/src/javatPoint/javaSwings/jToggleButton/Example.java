package javatPoint.javaSwings.jToggleButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class Example extends JFrame{
	
	Example(){
		
		JToggleButton b = new JToggleButton("on");
		add(b);
		b.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(b.isSelected()) {
					b.setText("ON");
				}
				if(b.isSelected()) {
					b.setText("OFF");
				}
			}
		});
		setSize(400,400);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		new Example();
	}

}
