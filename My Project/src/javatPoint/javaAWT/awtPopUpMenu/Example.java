package javatPoint.javaAWT.awtPopUpMenu;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example {
	
	Example(){
		
		Frame f = new Frame("popup menu example");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
		PopupMenu pm = new PopupMenu("Edit");
		
		MenuItem mi = new MenuItem("cut");
		mi.setActionCommand("cut");
		MenuItem m2 = new MenuItem("Copy");
		m2.setActionCommand("copy");
		MenuItem m3 = new MenuItem("paste");
		m3.setActionCommand("paste");
		
		pm.add(mi);
		pm.add(m2);
		pm.add(m3);
		
		f.add(pm);
		
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pm.show(f, e.getX(), e.getY());
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
	}
	
	public static void main(String args[]) {
		new Example();
	}

}
