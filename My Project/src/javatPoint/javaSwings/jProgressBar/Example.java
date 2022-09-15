package javatPoint.javaSwings.jProgressBar;
import javax.swing.*;
public class Example {
	JProgressBar pb;
	Example(){
		JFrame f = new JFrame();
		
		pb  = new JProgressBar(0,2000);
		pb.setBounds(50,50 , 200 , 30);
		f.add(pb);
		pb.setValue(0);
		pb.setStringPainted(true);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public void iterate() {
		int i=0; 
		while(i<=2000) {
			pb.setValue(i);
			i +=20;
			try {
				Thread.sleep(150);
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String args[]) {
		Example obj = new Example();
		obj.iterate();
	}

}
