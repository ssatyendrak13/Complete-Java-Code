package javatPoint.javaSwings.jSeprator;
import javax.swing.*;
public class Example1 {
	
	Example1(){
		JFrame f = new JFrame("jseprator example");
		
		JMenuBar menubar = new JMenuBar();
		f.setJMenuBar(menubar);
		JMenu menu = new JMenu("Menu");
		menubar.add(menu);
		menu.addSeparator();
		JMenuItem cut = new JMenuItem("cut");
		JMenuItem copy = new JMenuItem("copy");
		JMenuItem paste = new JMenuItem("paste");
		JMenuItem selectAll = new JMenuItem("selectAll");
		menu.add(cut);menu.add(copy);menu.add(paste);menu.add(selectAll);
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Example1();
	}

}
