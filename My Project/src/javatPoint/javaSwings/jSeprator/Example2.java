package javatPoint.javaSwings.jSeprator;
import javax.swing.*;
import java.awt.*;
public class Example2 {
	
	public static void main(String args[]) {  
        JFrame f = new JFrame("Separator Example");      
        f.setLayout(new GridLayout(0, 1));  
        JLabel l1 = new JLabel("Above Separator");  
        f.add(l1);  
        JSeparator sep = new JSeparator();  
        f.add(sep);  
        JLabel l2 = new JLabel("Below Separator");  
        f.add(l2);  
        f.setSize(400, 400);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      }  

}
