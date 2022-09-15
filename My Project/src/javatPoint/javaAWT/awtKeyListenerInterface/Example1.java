package javatPoint.javaAWT.awtKeyListenerInterface;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Example1 extends Frame implements KeyListener{
	
	Label l ;
	Checkbox cb;
	Example1(){
		
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		
		l = new Label("this is label");
		l.setBounds(80 , 80, 200, 30);
		add(l);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		addKeyListener(this);
		
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed ");
	}
	public void keyReleased(KeyEvent e ) {
		System.out.println("key released");
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("key typed ");
	}
	public static void main(String args[]) {
		new Example1();
	}

}
