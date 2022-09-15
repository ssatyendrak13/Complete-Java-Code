package javatPoint.javaAWT.awtToolkit;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class TitleBarIcom {
	
	TitleBarIcom(){   
		Frame f=new Frame();   
		Image icon = Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\PC\\Downloads\\pic.jpg\"");  
		f.setIconImage(icon);  
		f.setLayout(null);   
		f.setSize(400,400);   
		f.setVisible(true);   
		}   
		public static void main(String args[]){   
		new TitleBarIcom();   
		}   

}
