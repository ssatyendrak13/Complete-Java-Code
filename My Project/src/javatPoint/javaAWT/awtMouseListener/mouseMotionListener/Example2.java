package javatPoint.javaAWT.awtMouseListener.mouseMotionListener;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example2 extends Frame implements MouseMotionListener {
	Label l; 
	Example2(){
		 
	    Color c=Color.BLUE;    
	    l=new Label();  
	    l.setBounds(20,40,100,20);  
	    add(l);  
	      
	    addMouseMotionListener(this);  
	      
	    setSize(400,400);  
	    setLayout(null);  
	    setVisible(true);  
	    
	    addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		dispose();
	    	}
	    });
	}  
	public void mouseDragged(MouseEvent e) {  
	    l.setText("X="+e.getX()+", Y="+e.getY());  
	    Graphics g=getGraphics();  
	    g.setColor(Color.RED);  
	    g.fillOval(e.getX(),e.getY(),20,20);  
	}  
	public void mouseMoved(MouseEvent e) {  
	    l.setText("X="+e.getX()+", Y="+e.getY());  
	}  
	public static void main(String[] args) {  
	    new Example2();  
	}  

}
