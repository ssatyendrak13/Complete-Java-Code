package javatPoint.javaSwings.jButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageExample extends JFrame  {
	
	ImageExample(){
		
		setSize(400 , 400);
		setVisible(true);
		setLayout(null);
		
		JButton jb = new JButton(new ImageIcon("icom.png"));
		jb.setBounds(130,100,100,40);
		add(jb);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		new ImageExample();
	}

}
