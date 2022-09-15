package javatPoint.javaAWT.awtTextArea;
import java.awt.Frame;
import java.awt.TextArea;
public class TextAreaExample1  {
	
	TextAreaExample1(){
		
		Frame f = new Frame("final frame");
		f.setSize(400 , 400);
		f.setLayout(null);
		f.setVisible(true);
		
		TextArea t = new TextArea("welcome to textArea");
		t.setBounds(30, 50, 150, 150);
		f.add(t);
		
	}
	public static void main(String args[]) {
		new TextAreaExample1();
	}

}
