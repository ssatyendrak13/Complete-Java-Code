package javatPoint.javaAWT.awtList;

import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example1 {
	
	 // class constructor   
    Example1() {    
    // creating the frame  
       Frame f = new Frame();   
      // creating the list of 5 rows   
       List l1 = new List();   
 
       // setting the position of list component   
       l1.setBounds(100, 100, 75, 75);    
 
       // adding list items into the list  
       l1.add("Item 1");    
       l1.add("Item 2");    
       l1.add("Item 3");    
       l1.add("Item 4");    
       l1.add("Item 5");    
 
       // adding the list to frame  
       f.add(l1);   
 
       // setting size, layout and visibility of frame  
       f.setSize(400, 400);    
       f.setLayout(null);    
       f.setVisible(true);  
       f.addWindowListener(new WindowAdapter() {
    	   public void windowClosing(WindowEvent e) {
    		   f.dispose();
    	   }
       });
    }    
 
//main method  
	public static void main(String args[])    
	{    
	  new Example1();    
	}    

}
