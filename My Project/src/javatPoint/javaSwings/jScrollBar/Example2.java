package javatPoint.javaSwings.jScrollBar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;

public class Example2 extends JFrame{
	
	Example2(){
		
		JLabel l = new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(400,400);
		add(l);
		
		JScrollBar sb = new JScrollBar();
		sb.setBounds(375 , 0 , 10 , 365);
		add(sb);
		
		sb.addAdjustmentListener(new AdjustmentListener() {
			
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l.setText("vertical scrollbar value is : "+sb.getValue());
			}
			
		});
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new Example2();
	}

}
