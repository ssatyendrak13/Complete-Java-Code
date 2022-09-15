package javatPoint.javaAWT.awtMouseListener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example1 implements MouseListener {
	
	Example1(){
		
		Frame f = new Frame("frame");
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		Button b = new Button("click");
		b.setBounds(180 , 180, 80 , 30);
		f.add(b);
		
		f.addMouseListener(this);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
	}
	public static void main(String args[]) {
		new Example1();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse pressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse released");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse entered ");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse exited");
	}

}
