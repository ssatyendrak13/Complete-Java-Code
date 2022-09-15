package javatPoint.javaAWT.awtTextArea;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample2 implements ActionListener {
	
	Label l1 , l2;
	TextArea t;
	Button b;
	
	TextAreaExample2(){
		
		Frame f = new Frame("final Frame");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
		l1 =  new Label();
		l1.setBounds(50 , 60 , 100 , 30);
		f.add(l1);
		
		l2 = new Label();
		l2.setBounds(180 , 60 , 150 , 30);
		f.add(l2);
		
		t = new TextArea();
		t.setBounds(30, 100, 250, 200);
		f.add(t);
		
		
		b = new Button("count");
		b.setBounds(100, 310, 60, 30);
		f.add(b);
		
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String s = t.getText();
		String[] w = s.split("\\s");
		l1.setText("word : "+s.length());
		l2.setText("character : "+w.length);
		
		
	}
	
	public static void main(String args[]) {
		new TextAreaExample2();
	}

}
