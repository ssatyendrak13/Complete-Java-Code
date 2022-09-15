package javatPoint.javaSwings.jTabbedPane;
import javax.swing.*;
public class Example {
	
	JFrame f; 
	Example(){
		f = new JFrame("tabbedPane example");
		
		JTabbedPane tp = new JTabbedPane();
		 tp.setBounds(50,50,200,200); 
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		tp.add("main",p1);
		tp.add("visit",p2);
		tp.add("help",p3);
		f.add(tp);
		
		JTextArea ta = new JTextArea(200,200);
		p2.add(ta);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new Example();
	}
}
