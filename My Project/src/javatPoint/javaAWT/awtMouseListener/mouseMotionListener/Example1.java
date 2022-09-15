package javatPoint.javaAWT.awtMouseListener.mouseMotionListener;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Example1 extends Frame implements MouseMotionListener {
	
	Example1(){
		
		setSize(400 , 400);
		setLayout(null);
		setVisible(true);
		
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}
	public static void main(String args[]) {
		
		new Example1();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(g.getColor().blue);
		g.fillOval(e.getX(), e.getY(), 20, 20);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
