package javatPoint.javaAWT.awtKeyListenerInterface;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;
public class Example2 extends Frame implements KeyListener{
	
	
	 Label l;    
	    TextArea area;    
	// class constructor  
	    Example2() {    
	         // creating the label   
	        l = new Label();    
	// setting the location of label  
	        l.setBounds (20, 50, 200, 20);    
	// creating the text area  
	        area = new TextArea();    
	// setting location of text area  
	        area.setBounds (20, 80, 300, 300);    
	// adding KeyListener to the text area   
	        area.addKeyListener(this);    
	 // adding label and text area to frame  
	   add(l);  
	add(area);    
	// setting size, layout and visibility of frame  
	        setSize (400, 400);    
	        setLayout (null);    
	        setVisible (true);    
	    }    
	// even if we do not define the interface methods, we need to override them  
	    public void keyPressed(KeyEvent e) {}    
	// overriding the keyReleased() method of KeyListener interface   
	    public void keyReleased (KeyEvent e) {    
	// defining a string which is fetched by the getText() method of TextArea class  
	        String text = area.getText();    
	// splitting the string in words  
	        String words[] = text.split ("\\s");    
	// printing the number of words and characters of the string   
	        l.setText ("Words: " + words.length + " Characters:" + text.length());    
	    }    
	    public void keyTyped(KeyEvent e) {}    
	  // main method  
	    public static void main(String[] args) {    
	        new Example2();    
	    }    

}
