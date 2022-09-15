package javatPoint.javaSwings.jPopupMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Example2 {
	
	Example2(){
		JFrame f = new JFrame("popup menu ");
		
		
		JPopupMenu popupmenu =  new JPopupMenu();
		JMenuItem cut = new JMenuItem("cut");
		JMenuItem copy = new JMenuItem("copy");
		JMenuItem paste = new JMenuItem("paste");
		JMenuItem selectAll = new JMenuItem("selectAll");
		popupmenu.add(cut);popupmenu.add(copy);popupmenu.add(paste);popupmenu.add(selectAll);
		
		JLabel l = new JLabel();
		l.setBounds(50,50,200,30);
		f.add(l);
		
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				popupmenu.show(f, e.getX(), e.getY());
			}
		});
		
		cut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setText("cut menuItem clicked");
			}
		});
		copy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setText("copy menuItem clicked");
			}
		});
		paste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setText("paste menuItem clicked");
			}
		});
		selectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setText("selectAll menuItem clicked");
			}
		});
		
		f.setSize(400,400);
		f.setLayout(null);;
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new   Example2();
	}

}
