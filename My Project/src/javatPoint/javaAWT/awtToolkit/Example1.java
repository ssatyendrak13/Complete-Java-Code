package javatPoint.javaAWT.awtToolkit;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Example1 {
	
	
	public static void main(String args[]) {
		
		Toolkit t = Toolkit.getDefaultToolkit();
		System.out.println("screen resolution : "+t.getScreenResolution());
		Dimension d = t.getScreenSize();
		System.out.println("width : "+d.getWidth());
		System.out.println("height : "+d.getHeight());
		
	}

}
