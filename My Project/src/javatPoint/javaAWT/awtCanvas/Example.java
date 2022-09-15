package javatPoint.javaAWT.awtCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example {
	
	 public Example()    
	  {    
	  
	    // creating a frame  
	    Frame f = new Frame("Canvas Example");   
	    // adding canvas to frame   
	    f.add(new MyCanvas());    
	  
	    // setting layout, size and visibility of frame  
	    f.setLayout(null);    
	    f.setSize(400, 400);    
	    f.setVisible(true);  
	    
	    f.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		f.dispose();
	    	}
	    });
	    
	  }    
	  
	  // main method  
	  public static void main(String args[])    
	  {    
	    new Example();    
	  }    
	}    
	  
	// class which inherits the Canvas class  
	// to create Canvas  
	class MyCanvas extends Canvas    
	{    
	        // class constructor  
	        public MyCanvas() {    
	        setBackground (Color.GRAY);    
	        setSize(300, 200);    
	     }    
	  
	     // paint() method to draw inside the canvas  
	  public void paint(Graphics g)    
	  {    
	  
	    // adding specifications  
	    g.setColor(Color.red);    
	    g.fillOval(75, 75, 150, 75);    
	  }    

}
