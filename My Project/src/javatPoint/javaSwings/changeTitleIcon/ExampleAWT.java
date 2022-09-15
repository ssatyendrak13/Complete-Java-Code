package javatPoint.javaSwings.changeTitleIcon;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ExampleAWT {
	
	ExampleAWT(){
		
		Frame f = new Frame();
		
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users"
				+ "\\PC\\OneDrive\\Desktop\\icon.jpg");
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
			
		});
		f.setIconImage(icon);  
		f.setLayout(null);   
		f.setSize(200,200);   
		f.setVisible(true);   
	}
	public static void main(String args[]) {
		new ExampleAWT();
	}

}
