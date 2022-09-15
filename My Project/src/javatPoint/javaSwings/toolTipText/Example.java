package javatPoint.javaSwings.toolTipText;
import javax.swing.*;
public class Example {
	
	Example(){
		
		JFrame f = new JFrame();
		
		JLabel l = new JLabel("password : ");
		l.setBounds(100,100,100,30);
		f.add(l);
		
		JPasswordField pf = new JPasswordField();
		pf.setBounds(170,100 , 150,30);
		pf.setToolTipText("enter your password");
		f.add(pf);
		
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		new Example();
	}

}
