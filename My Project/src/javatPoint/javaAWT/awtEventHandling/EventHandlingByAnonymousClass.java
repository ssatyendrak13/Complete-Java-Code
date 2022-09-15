package javatPoint.javaAWT.awtEventHandling;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventHandlingByAnonymousClass extends Frame{
	
	EventHandlingByAnonymousClass(){
		
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		
		TextField tf = new TextField();
		tf.setBounds(20, 80, 150, 30);
		add(tf);
		
		Button b = new Button("click me");
		b.setBounds(200, 80, 80, 30);
		add(b);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tf.setText("button Successfully clicked ");
				
			}
			
		});
		
	}
	public static void main(String args[]) {
		new EventHandlingByAnonymousClass();
		
	}

}
