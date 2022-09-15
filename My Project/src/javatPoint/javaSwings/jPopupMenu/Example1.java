package javatPoint.javaSwings.jPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Example1 {
	
	Example1(){
		
		JFrame f = new JFrame("examle of popup menu");
		JPopupMenu popupmenu = new JPopupMenu();
//		popupmenu.setBounds(50,50 , 100, 100);
		f.add(popupmenu);
		
		JMenuItem i1 = new JMenuItem("cut");
		JMenuItem i2 = new JMenuItem("copy");
		JMenuItem i3 = new JMenuItem("paste");
		
		popupmenu.add(i1);
		popupmenu.add(i2);
		popupmenu.add(i3);
		
		f.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				popupmenu.show(f , e.getX(), e.getY());
			}
			
		});
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example1();
	}

}
