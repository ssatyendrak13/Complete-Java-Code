package javatPoint.javaSwings.jMenu;
import javax.swing.*;
public class Example1 extends JFrame{
	
	Example1(){
		
		JMenu menu = new JMenu("Menu");
		JMenuBar menubar = new JMenuBar();
		
		JMenuItem i1 = new JMenuItem("first menu");
		JMenuItem i2 = new JMenuItem("second menu");
		JMenuItem i3 = new JMenuItem("third menu");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		JMenu submenu = new JMenu("subMenu");
		menu.add(submenu);
		JMenuItem i4 = new JMenuItem("first sub menu");
		JMenuItem i5 = new JMenuItem("second sub menu");
		JMenuItem i6 = new JMenuItem("third sub menu");
		submenu.add(i4);
		submenu.add(i5);
		submenu.add(i6);
		
		menubar.add(menu);
		setJMenuBar(menubar);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		
		
		new Example1();
	}

}
